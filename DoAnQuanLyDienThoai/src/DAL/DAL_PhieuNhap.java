/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Admin
 */
public class DAL_PhieuNhap {
    private DAL_CTPN ctpnDal = new DAL_CTPN();
    public ArrayList<DTO_PhieuNhap> getList() {
        try{
            Connection conn = DAO.getConnection();
            String sql ="select * from HDNhapHang";
            ArrayList<DTO_PhieuNhap> list= new ArrayList<>();
            PreparedStatement ps=conn.prepareCall(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                DTO_PhieuNhap nv=new DTO_PhieuNhap();
               nv.setMAHDNH(rs.getString("MAHDNH"));
               nv.setMANCC(rs.getString("MANCC"));
               
               nv.setTENNCC(rs.getString("TENNCC"));
               nv.setNGAYGIAO(rs.getDate("NGAYGIAO"));
               nv.setTONGTIEN(rs.getDouble("TONGTIEN"));
               nv.setTRANGTHAI(rs.getInt("TRANGTHAI"));
               list.add(nv);
            }
            ps.close();
            rs.close();
            conn.close();
            return list;
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
       return null ;
    
    }

    public java.sql.Date cover(java.util.Date d){
        return new java.sql.Date(d.getTime());
    }
    public boolean addDTO_PhieuNhap(DTO_PhieuNhap s) {
        String sql="insert into HDNhapHang(MAHDNH,MANCC,TENNCC,NGAYGIAO,TONGTIEN,TRANGTHAI)"
               + "VALUES(?,?,?,?,?,?)";
        
        
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, s.getMAHDNH());
           ps.setString(2, s.getMANCC());
          
           ps.setString(3, s.getTENNCC());
           ps.setDate(4, cover(s.getNGAYGIAO()));
           ps.setDouble(5, s.getTONGTIEN());
           ps.setDouble(6, s.getTRANGTHAI());
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return false;
    }

    
    public boolean updateDTO_PhieuNhap(DTO_PhieuNhap s) {
        String sql="update HDNhapHang set MAHDNH=? , MANCC=?,TENNCC=? ,NGAYGIAO=? ,TONGTIEN=? ,TRANGTHAI=? where MAHDNH=?";
               
      
        try {
            
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
            //java.util.Date a=  s.getNgaysinh();
           ps.setString(1, s.getMAHDNH());
           ps.setString(2, s.getMANCC());
           
           ps.setString(3, s.getTENNCC());
           ps.setDate(4, cover(s.getNGAYGIAO()));
           ps.setDouble(5, s.getTONGTIEN());
           
           ps.setDouble(6, s.getTRANGTHAI());
           ps.setString(7, s.getMAHDNH());
           
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public int themDS( ){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel files", "xlsx", "xls");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try{
                File selectedFile = fileChooser.getSelectedFile();
                FileInputStream file = new FileInputStream(selectedFile);
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet = workbook.getSheetAt(0);
                Connection conn= DAO.getConnection();
                
            String sql="MERGE INTO HDNhapHang AS target "
           + "USING (VALUES (?, ?, ?, ?, ?, ?)) AS source (MAHDNH,MANCC,TENNCC,NGAYGIAO,TONGTIEN,TRANGTHAI) "
           + "ON (target.MAHDNH = source.MAHDNH) "
           + "WHEN MATCHED THEN "
           + "    UPDATE SET target.MANCC = source.MANCC, "
           + "               target.TENNCC = source.TENNCC, "
           + "               target.NGAYGIAO = source.NGAYGIAO, "
           + "               target.TONGTIEN = source.TONGTIEN, "         
           + "               target.TRANGTHAI = source.TRANGTHAI "                                     
           + "WHEN NOT MATCHED THEN "
           + "    INSERT (MAHDNH,MANCC,TENNCC,NGAYGIAO,TONGTIEN,TRANGTHAI) "
           + "    VALUES (source.MAHDNH, source.MANCC, source.TENNCC,source.NGAYGIAO, source.TONGTIEN, source.TRANGTHAI);";
                PreparedStatement statement = conn.prepareStatement(sql);
                DataFormatter dataFormatter = new DataFormatter();

              
                XSSFRow row = sheet.getRow(1);
                if (row == null) {
                    return 0;
                }

                String maPn = capNhatMaPNH();
                statement.setString(1,maPn); // MAHDNH
                statement.setString(2, row.getCell(1).getStringCellValue()); // MANCC
                statement.setString(3, row.getCell(2).getStringCellValue()); // TENNCC
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date d=dateFormat.parse(row.getCell(3).getStringCellValue());
                statement.setDate(4,cover(d)); // NGAYGIAO                     
                statement.setDouble(5, Double.parseDouble(dataFormatter.formatCellValue(row.getCell(4)))); //TONGTIEN                       
                statement.setInt(6, 1); // trangthai                                               
                statement.executeUpdate();                    
                int kq = ctpnDal.themDS(maPn, fileChooser, workbook, sheet);
                        
                statement.close();
                conn.close();
                
                workbook.close();
                file.close();
                if(kq == 1)
                        JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                else
                      JOptionPane.showMessageDialog(null, "Thêm thất bại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);  
//                        System.out.println("Data imported successfully.");
            } catch (Exception e) {
                e.printStackTrace();
                

//                        System.out.println("Data import failed.");
            }
        }
        return 0;
    }
    
    public String capNhatMaPNH(){
            String maPn = "";                   
            int soThuTuMa = getList().size()+1;
            if(soThuTuMa<10){
                maPn = "HDN00" + soThuTuMa;
            }
            else{
                maPn = "HDN0" + soThuTuMa;
            }             
        return maPn ;
    }
    
    
}
