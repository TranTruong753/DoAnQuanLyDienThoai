/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Admin
 */
public class DAL_KhuyenMai {
    
    public ArrayList<DTO_KhuyenMai> getList() {
        try{
            Connection conn = DAO.getConnection();
            String sql ="select * from KhuyenMai";
            ArrayList<DTO_KhuyenMai> list= new ArrayList<>();
            PreparedStatement ps=conn.prepareCall(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                DTO_KhuyenMai nv=new DTO_KhuyenMai();
               nv.setMAKM(rs.getString("MAKM"));
               nv.setMASP(rs.getString("MASP"));
               nv.setTENSP(rs.getString("TENSP"));
               nv.setTENKM(rs.getString("TENKM"));
               nv.setPHANTRAMKM(rs.getInt("PHANTRAMKM"));
               nv.setNGAYBD(rs.getDate("NGAYBD"));
               nv.setNGAYKT(rs.getDate("NGAYKT"));
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

    
    public boolean addDTO_KhuyenMai(DTO_KhuyenMai s) {
        String sql="insert into KhuyenMai(MAKM,MASP,TENSP,TENKM,PHANTRAMKM,NGAYBD,NGAYKT,TRANGTHAI)"
               + "VALUES(?,?,?,?,?,?,?,?)";
        
        
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, s.getMAKM());
           ps.setString(2, s.getMASP());
           ps.setString(3, s.getTENSP());
           ps.setString(4, s.getTENKM());
           ps.setInt(5, s.getPHANTRAMKM());
           ps.setDate(6, cover(s.getNGAYBD()));
           ps.setDate(7, cover(s.getNGAYKT()));
           ps.setFloat(8, 1);
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return false;
    }

    
    public boolean updateDTO_KhuyenMai(DTO_KhuyenMai s) {
        String sql="update KhuyenMai set MAKM=? , MASP=? ,TENSP=? ,TENKM=? ,PHANTRAMKM=? ,NGAYBD=?,NGAYKT=?,TRANGTHAI=? where MAKM=?";
               
      
        try {
            
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
            //java.util.Date a=  s.getNgaysinh();
           ps.setString(1, s.getMAKM());
           ps.setString(2, s.getMASP());
           ps.setString(3, s.getTENSP());
           ps.setString(4, s.getTENKM());
           ps.setInt(5, s.getPHANTRAMKM());
           ps.setDate(6, cover(s.getNGAYBD()));
           ps.setDate(7, cover(s.getNGAYKT()));
           ps.setFloat(8, 1);
           
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    
    public ArrayList<DTO_KhuyenMai> timnv(String tk) {
        ArrayList<DTO_KhuyenMai> list =new ArrayList<>();
        String sql="SELECT * FROM KhuyenMai where MASP like N'%"+ tk +"%' or MAKM like N'%"+ tk +"%' ";
        try {
            Connection conn = DAO.getConnection();
            PreparedStatement ps= conn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
               DTO_KhuyenMai nv=new DTO_KhuyenMai();
               nv.setMAKM(rs.getString("MAKM"));
               nv.setMASP(rs.getString("MASP"));
               nv.setTENSP(rs.getString("TENSP"));
               nv.setTENKM(rs.getString("TENKM"));
               nv.setPHANTRAMKM(rs.getInt("PHANTRAMKM"));
               nv.setNGAYBD(rs.getDate("NGAYBD"));
               nv.setNGAYKT(rs.getDate("NGAYKT"));
               nv.setTRANGTHAI(rs.getInt("TRANGTHAI"));
               list.add(nv);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public java.sql.Date cover(java.util.Date d){
        return new java.sql.Date(d.getTime());
    }
    public int themDS(){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel files", "xlsx", "xls");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try{
                File selectedFile = fileChooser.getSelectedFile();
//                        String filePath = selectedFile.getAbsolutePath();
//                        System.out.println(filePath);
                FileInputStream file = new FileInputStream(selectedFile);
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet = workbook.getSheetAt(0);
                Connection conn= DAO.getConnection();
//                        String sql = "INSERT INTO SanPham (MaSP, MaNhom, TenSP, DonVi, DonGia, SLTon, TrangThai) VALUES (?, ?, ?, ?, ?, ?, ?)";
                String sql="MERGE INTO KhuyenMai AS target "
           + "USING (VALUES (?, ?, ?, ?, ?, ?, ?,?)) AS source (MAKM,MASP,TENSP,TENKM,PHANTRAMKM,NGAYBD,NGAYKT,TRANGTHAI) "
           + "ON (target.MAKM = source.MAKM) "
           + "WHEN MATCHED THEN "
           + "    UPDATE SET target.MASP = source.MASP, "
           + "               target.TENSP = source.TENSP, "
           + "               target.TENKM = source.TENKM, "
           + "               target.PHANTRAMKM = source.PHANTRAMKM, "
           + "               target.NGAYBD = source.NGAYBD, "
           + "               target.NGAYKT = source.NGAYKT, "             
           + "               target.TRANGTHAI = source.TRANGTHAI "
                                     
           + "WHEN NOT MATCHED THEN "
           + "    INSERT (MAKM,MASP,TENSP,TENKM,PHANTRAMKM,NGAYBD,NGAYKT,TRANGTHAI) "
           + "    VALUES (source.MAKM, source.MASP, source.TENSP,source.TENKM, source.PHANTRAMKM, source.NGAYBD,source.NGAYKT, source.TRANGTHAI);";
                PreparedStatement statement = conn.prepareStatement(sql);
                // Loop through rows in Excel sheet and insert data into database
                for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
                    XSSFRow row = sheet.getRow(i);
                    if (row == null) {
                        continue;
                    }
                        statement.setString(1, row.getCell(1).getStringCellValue()); // MANV
                        statement.setString(2, row.getCell(2).getStringCellValue()); // TENNV
                        statement.setString(3, row.getCell(3).getStringCellValue()); // SDT
                        statement.setString(4, row.getCell(4).getStringCellValue()); // DIACHI
                        statement.setInt(5, row.getCell(5).getColumnIndex());//GIOITINH
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        java.util.Date d=dateFormat.parse(row.getCell(6).getStringCellValue());
                        statement.setDate(6,cover(d)); // NGÁYINH
                        java.util.Date d1=dateFormat.parse(row.getCell(7).getStringCellValue());
                        statement.setDate(7,cover(d1)); // NGÁYINH
                        statement.setInt(8, 1); // trangthai
                        
                        
                        statement.executeUpdate();
                    }
                // Close all resources
                statement.close();
                conn.close();
                workbook.close();
                file.close();
                JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
//                        System.out.println("Data imported successfully.");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Thêm thất bại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

//                        System.out.println("Data import failed.");
            }
        }
        return 0;
    }
    
}
