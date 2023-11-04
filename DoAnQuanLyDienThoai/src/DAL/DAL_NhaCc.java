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
public class DAL_NhaCc {
     public ArrayList<DTO_NhaCc> getList() {
        try{
            Connection conn = DAO.getConnection();
            String sql ="select * from NHACC";
            ArrayList<DTO_NhaCc> list= new ArrayList<>();
            PreparedStatement ps=conn.prepareCall(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                DTO_NhaCc nv=new DTO_NhaCc();
               nv.setMANCC(rs.getString("MANCC"));
               nv.setTENNCC(rs.getString("TENNCC"));              
               nv.setSDTNCC(rs.getString("SDTNCC"));
               nv.setDIACHI(rs.getString("DIACHI"));               
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

    public ArrayList<DTO_NhaCc> timNcc(String key) {
        ArrayList<DTO_NhaCc> list =new ArrayList<>();
        String sql="SELECT * FROM NHACC where TENNCC = '" + key + "'";
        try {
            Connection conn = DAO.getConnection();
            PreparedStatement ps= conn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
                DTO_NhaCc ncc = new DTO_NhaCc();
                
                ncc.setMANCC(rs.getString("MANCC"));
                ncc.setTENNCC(rs.getString("TENNCC"));
                ncc.setSDTNCC(rs.getString("SDTNCC"));
                ncc.setDIACHI(rs.getString("DIACHI"));               
                ncc.setTRANGTHAI(rs.getInt("TRANGTHAI"));
                if(ncc.getTRANGTHAI()==1){
                    list.add(ncc);
                }
                
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean addDTO_NhaCc(DTO_NhaCc s) {
        String sql="insert into NHACC(MANCC,TENNCC,SDTNCC,DIACHI,TRANGTHAI)"
               + "VALUES(?,?,?,?,?)";
        
        
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, s.getMANCC());
           ps.setString(2, s.getTENNCC());
           
           ps.setString(3, s.getSDTNCC());
           ps.setString(4, s.getDIACHI());
           
           ps.setFloat(5, 1);
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return false;
    }

    
    public boolean updateDTO_NhaCc(DTO_NhaCc s) {
        String sql="update NHACC set MANCC=? , TENNCC=?,SDTNCC=? ,DIACHI=?,TRANGTHAI=? where MANCC=?";
               
      
        try {
            
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
            //java.util.Date a=  s.getNgaysinh();
           ps.setString(1, s.getMANCC());
           ps.setString(2, s.getTENNCC());
           
           ps.setString(3, s.getSDTNCC());
           ps.setString(4, s.getDIACHI());
           
           
           ps.setFloat(5, s.getTRANGTHAI());
           ps.setString(6, s.getMANCC());
           
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
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
                String sql="MERGE INTO NHACC AS target "
           + "USING (VALUES (?, ?, ?, ?, ?)) AS source (MANCC,TENNCC,SDTNCC,DIACHI,TRANGTHAI) "
           + "ON (target.MANCC = source.MANCC) "
           + "WHEN MATCHED THEN "
           + "    UPDATE SET target.TENNCC = source.TENNCC, "
           + "               target.SDTNCC = source.SDTNCC, "
           + "               target.DIACHI = source.DIACHI, "
           + "               target.TRANGTHAI = source.TRANGTHAI "
                                     
           + "WHEN NOT MATCHED THEN "
           + "    INSERT (MANCC,TENNCC,SDTNCC,DIACHI,TRANGTHAI) "
           + "    VALUES (source.MANCC, source.TENNCC, source.SDTNCC,source.DIACHI, source.TRANGTHAI);";
                PreparedStatement statement = conn.prepareStatement(sql);
                // Loop through rows in Excel sheet and insert data into database
                for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
                    XSSFRow row = sheet.getRow(i);
                    if (row == null) {
                        continue;
                    }
                        statement.setString(1, row.getCell(1).getStringCellValue()); // MANCC
                        statement.setString(2, row.getCell(2).getStringCellValue()); // TENNCC
                        statement.setString(3, row.getCell(3).getStringCellValue()); // SDTNCC
                        statement.setString(4, row.getCell(4).getStringCellValue()); // DIACHI
                        statement.setInt(5, 1); // trangthai
                        
                        
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
//    public static void main(String[] args) {
//        DAL_NhaCc ncc = new DAL_NhaCc();
//        for(DTO_NhaCc ncc1 :ncc.timNcc("Quang Truong VIP PRO")){
//            System.out.println(ncc1.getMANCC());
//        }
//        
//    }
}
