/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class DAL_NhanVien {
    public ArrayList<DTO_NhanVien> getList() {
        try{
            Connection conn = DAO.getConnection();
            String sql ="select * from NhanVien";
            ArrayList<DTO_NhanVien> list= new ArrayList<>();
            PreparedStatement ps=conn.prepareCall(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                DTO_NhanVien nv=new DTO_NhanVien();
               nv.setMANV(rs.getString("MANV"));
               nv.setTENNV(rs.getString("TENNV"));
               nv.setNGAYSINH(rs.getDate("NGAYSINH"));
               nv.setSDT(rs.getString("SDT"));
               nv.setDIACHI(rs.getString("DIACHI"));
               nv.setGIOITINH(rs.getString("GIOITINH"));
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

    
    public boolean addDTO_NhanVien(DTO_NhanVien s) {
        String sql="insert into NhanVien(MANV,TENNV,NGAYSINH,SDT,DIACHI,GIOITINH,TRANGTHAI)"
               + "VALUES(?,?,?,?,?,?,?)";
        
        
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, s.getMANV());
           ps.setString(2, s.getTENNV());
           ps.setDate(3, (Date) s.getNGAYSINH());
           ps.setString(4, s.getSDT());
           ps.setString(5, s.getDIACHI());
           ps.setString(6, s.getGIOITINH());
           ps.setFloat(7, 1);
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return false;
    }

    
    public boolean updateDTO_NhanVien(DTO_NhanVien s) {
        String sql="update NhanVien set MANV=? , TENNV=? ,NGAYSINH=? ,SDT=? ,DIACHI=? ,GIOITINH=? ,TRANGTHAI=? where MANV=?";
               
      
        try {
            
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
            //java.util.Date a=  s.getNgaysinh();
           ps.setString(1, s.getMANV());
           ps.setString(2, s.getTENNV());
           ps.setDate(3, (Date) s.getNGAYSINH());
           ps.setString(4, s.getSDT());
           ps.setString(5, s.getDIACHI());
           ps.setString(6, s.getGIOITINH());
           
           ps.setFloat(7, s.getTRANGTHAI());
           ps.setString(8, s.getMANV());
           
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    
    public ArrayList<DTO_NhanVien> timnv(String tk) {
        ArrayList<DTO_NhanVien> list =new ArrayList<>();
        String sql="SELECT * FROM NhanVien where TENNV like N'%"+ tk +"%' or MANV like N'%"+ tk +"%' ";
        try {
            Connection conn = DAO.getConnection();
            PreparedStatement ps= conn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
               DTO_NhanVien nv=new DTO_NhanVien();
               nv.setMANV(rs.getString("MANV"));
               nv.setTENNV(rs.getString("TENNV"));
               nv.setNGAYSINH(rs.getDate("NGAYSINH"));
               nv.setSDT(rs.getString("SDT"));
               nv.setDIACHI(rs.getString("DIACHI"));
               nv.setGIOITINH(rs.getString("GIOITINH"));
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
                String sql="MERGE INTO NhanVien AS target "
           + "USING (VALUES (?, ?, ?, ?, ?, ?, ?)) AS source (MANV,TENNV,SDT,DIACHI,GIOITINH,NGAYSINH,TRANGTHAI) "
           + "ON (target.MANV = source.MANV) "
           + "WHEN MATCHED THEN "
           + "    UPDATE SET target.TENNV = source.TENNV, "
           + "               target.SDT = source.SDT, "
           + "               target.DIACHI = source.DIACHI, "
           + "               target.GIOITINH = source.GIOITINH, "
           + "               target.NGAYSINH = source.NGAYSINH, "             
           + "               target.TRANGTHAI = source.TRANGTHAI "
                                     
           + "WHEN NOT MATCHED THEN "
           + "    INSERT (MANV,TENNV,SDT,DIACHI,GIOITINH,NGAYSINH,TRANGTHAI) "
           + "    VALUES (source.MANV, source.TENNV, source.SDT,source.DIACHI, source.GIOITINH, source.NGAYSINH, source.TRANGTHAI);";
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
                        statement.setString(5, row.getCell(5).getStringCellValue());//GIOITINH
                        statement.setDate(6,cover(row.getCell(6).getDateCellValue())); // NGÁYINH
                        statement.setInt(7, 1); // trangthai
                        
                        
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
    


