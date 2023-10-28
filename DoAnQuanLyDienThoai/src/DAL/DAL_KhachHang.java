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
public class DAL_KhachHang {
        public ArrayList<DTO_KhachHang> getList() {
        try{
            Connection conn = DAO.getConnection();
            String sql ="select * from KhachHang";
            ArrayList<DTO_KhachHang> list= new ArrayList<>();
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
               DTO_KhachHang kh=new DTO_KhachHang();
               kh.setMAKH(rs.getString("MAKH"));
               kh.setTENKH(rs.getString("TENKH"));
               kh.setSDTKH(rs.getString("SDTKH"));
               kh.setTRANGTHAI(rs.getInt("TRANGTHAI"));
               list.add(kh);
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

    
    public boolean addDTO_KhachHang(DTO_KhachHang s) {
        String sql="insert into KhachHang(MAKH,TENKH,SDTKH,TRANGTHAI)"
               + "VALUES(?,?,?,?)";
        
        
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, s.getMAKH());
           ps.setString(2, s.getTENKH());
           ps.setString(3, s.getSDTKH());
           ps.setFloat(4, 1);
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return false;
    }

    
    public boolean updateDTO_KhachHang(DTO_KhachHang s) {
        String sql="update KhachHang set MAKH=? , TENKH=? ,SDTKH=?,TRANGTHAI=? where MAKH=?";
               
      
        try {
            
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, s.getMAKH());
           ps.setString(2, s.getTENKH());
           ps.setString(3, s.getSDTKH());           
           ps.setFloat(4, s.getTRANGTHAI());
           ps.setString(5, s.getMAKH());
           
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
return false;
    }

    
    public ArrayList<DTO_KhachHang> timkh(String tk) {
        ArrayList<DTO_KhachHang> list =new ArrayList<>();
        String sql="SELECT * FROM KhachHang where TENKH like N'%"+ tk +"%' or MAKH like N'%"+ tk +"%' ";
        try {
            Connection conn = DAO.getConnection();
            PreparedStatement ps= conn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
               DTO_KhachHang kh=new DTO_KhachHang();
               kh.setMAKH(rs.getString("MAKH"));
               kh.setTENKH(rs.getString("TENKH"));
               kh.setSDTKH(rs.getString("SDTKH"));
               kh.setTRANGTHAI(rs.getInt("TRANGTHAI"));
               list.add(kh);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
//    public java.sql.Date cover(java.util.Date d){
//        return new java.sql.Date(d.getTime());
//    }
    public int themDS(){
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
                String sql="MERGE INTO KhachHang AS target "
           + "USING (VALUES (?, ?, ?, ?)) AS source (MAKH,TENKH,SDTKH,TRANGTHAI) "
           + "ON (target.MAKH = source.MAKH) "
           + "WHEN MATCHED THEN "
           + "    UPDATE SET target.TENKH = source.TENKH, "
           + "               target.SDTKH = source.SDTKH, "             
           + "               target.TRANGTHAI = source.TRANGTHAI "
                                     
           + "WHEN NOT MATCHED THEN "
           + "    INSERT (MAKH,TENKH,SDTKH,TRANGTHAI) "
           + "    VALUES (source.MAKH, source.TENKH, source.SDTKH,source.TRANGTHAI);";
                PreparedStatement statement = conn.prepareStatement(sql);
                // Loop through rows in Excel sheet and insert data into database
                for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
                    XSSFRow row = sheet.getRow(i);
                    if (row == null) {
                        continue;
                    }
statement.setString(1, row.getCell(1).getStringCellValue()); // MAKH
                        statement.setString(2, row.getCell(2).getStringCellValue()); // TENKH
                        statement.setString(3, row.getCell(3).getStringCellValue()); // SDTKH
                        statement.setInt(4, 1); // trangthai
                        
                        
                        statement.executeUpdate();
                    }
                // Close all resources
                statement.close();
                conn.close();
                workbook.close();
                file.close();
                JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Thêm thất bại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        return 0;
    }
}
