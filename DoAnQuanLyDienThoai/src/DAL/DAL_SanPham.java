/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
public class DAL_SanPham {
    
    public List<DTO_SanPham> getList(){
        try {
            Connection cons = DAO.getConnection();
            String sql = "SELECT * FROM SanPham";
            List<DTO_SanPham> list = new ArrayList<>();
            PreparedStatement ps;
            ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DTO_SanPham sp = new DTO_SanPham();
                
                sp.setMaSp(rs.getString("MASP"));
                sp.setTenSp(rs.getString("TENSP"));
                sp.setMaThuongHieu(rs.getString("MATH"));
                sp.setMauSac(rs.getString("MAUSAC"));
                sp.setDungLuong(rs.getString("DUNGLUONG"));
                sp.setDonGia(rs.getDouble("DONGIA"));
                sp.setSoLuong(rs.getInt("SLTON"));
                sp.setImg(rs.getString("IMG"));
                sp.setTrangThai(rs.getInt("TRANGTHAI"));
                if(sp.getTrangThai()==1){
                    list.add(sp);
                }             
            }
            ps.close();
            rs.close();
            cons.close();
            return list;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ArrayList<DTO_SanPham> timSp(String key) {
        ArrayList<DTO_SanPham> list =new ArrayList<>();
        String sql="SELECT * FROM SanPham where MASP = '" + key + "'";
        try {
            Connection conn = DAO.getConnection();
            PreparedStatement ps= conn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
                DTO_SanPham sp = new DTO_SanPham();
                
                sp.setMaSp(rs.getString("MASP"));
                sp.setTenSp(rs.getString("TENSP"));
                sp.setMaThuongHieu(rs.getString("MATH"));
                sp.setMauSac(rs.getString("MAUSAC"));
                sp.setDungLuong(rs.getString("DUNGLUONG"));
                sp.setDonGia(rs.getDouble("DONGIA"));
                sp.setSoLuong(rs.getInt("SLTON"));
                sp.setImg(rs.getString("IMG"));
                sp.setTrangThai(rs.getInt("TRANGTHAI"));
                if(sp.getTrangThai()==1){
                    list.add(sp);
                }
                
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public DTO_SanPham timSp2(String key) {
        DTO_SanPham sp = new DTO_SanPham();
        String sql="SELECT * FROM SanPham where MASP = '" + key + "' AND TRANGTHAI = 1";
        try {
            Connection conn = DAO.getConnection();
            PreparedStatement ps= conn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
                
                
                sp.setMaSp(rs.getString("MASP"));
                sp.setTenSp(rs.getString("TENSP"));
                sp.setMaThuongHieu(rs.getString("MATH"));
                sp.setMauSac(rs.getString("MAUSAC"));
                sp.setDungLuong(rs.getString("DUNGLUONG"));
                sp.setDonGia(rs.getDouble("DONGIA"));
                sp.setSoLuong(rs.getInt("SLTON"));
                sp.setImg(rs.getString("IMG"));
                sp.setTrangThai(rs.getInt("TRANGTHAI"));
                
                
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sp;
    }
    
    
    public ArrayList<DTO_SanPham> timThTrongSp(String key) {
        ArrayList<DTO_SanPham> list =new ArrayList<>();
        String sql="SELECT * FROM SanPham where MATH = '" + key + "'";
        try {
            Connection conn = DAO.getConnection();
            PreparedStatement ps= conn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
                DTO_SanPham sp = new DTO_SanPham();
                
                sp.setMaSp(rs.getString("MASP"));
                sp.setTenSp(rs.getString("TENSP"));
                sp.setMaThuongHieu(rs.getString("MATH"));
                sp.setMauSac(rs.getString("MAUSAC"));
                sp.setDungLuong(rs.getString("DUNGLUONG"));
                sp.setDonGia(rs.getDouble("DONGIA"));
                sp.setSoLuong(rs.getInt("SLTON"));
                sp.setImg(rs.getString("IMG"));
                sp.setTrangThai(rs.getInt("TRANGTHAI"));
                list.add(sp);
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<DTO_SanPham> timSpDaKhoa(String key) {
        ArrayList<DTO_SanPham> list =new ArrayList<>();    
        String sql="SELECT * FROM SanPham where TRANGTHAI = 1 AND (MASP like N'%"+ key +"%' or TENSP like N'%"+ key +"%' or MAUSAC like N'%"+ key +"%')";
        try {
            Connection conn = DAO.getConnection();
            PreparedStatement ps= conn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
                DTO_SanPham sp = new DTO_SanPham();
                
                sp.setMaSp(rs.getString("MASP"));
                sp.setTenSp(rs.getString("TENSP"));
                sp.setMaThuongHieu(rs.getString("MATH"));
                sp.setMauSac(rs.getString("MAUSAC"));
                sp.setDungLuong(rs.getString("DUNGLUONG"));
                sp.setDonGia(rs.getDouble("DONGIA"));
                sp.setSoLuong(rs.getInt("SLTON"));
                sp.setImg(rs.getString("IMG"));
                sp.setTrangThai(rs.getInt("TRANGTHAI"));
                list.add(sp);
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
     
     public boolean addDTO_SanPham(DTO_SanPham sp) {
        String sql="insert into SanPham(MASP,TENSP,MATH,MAUSAC,DUNGLUONG,DONGIA,SLTON,IMG,TRANGTHAI)"
               + "VALUES(?,?,?,?,?,?,?,?,?)";             
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, sp.getMaSp());
           ps.setString(2, sp.getTenSp());
           ps.setString(3,sp.getMaThuongHieu());
           ps.setString(4, sp.getMauSac());
           ps.setString(5, sp.getDungLuong());
           ps.setDouble(6, sp.getDonGia());
           ps.setInt(7, sp.getSoLuong());
           ps.setString(8, sp.getImg());
           sp.setTrangThai(1);
           ps.setInt(9, sp.getTrangThai());
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return false;
    }

    public boolean updateSoLuongSp(DTO_SanPham s){
        String sql="update SanPham set SLTON=? where MASP = ?";                  
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
            //java.util.Date a=  s.getNgaysinh();        
           ps.setInt(1, s.getSoLuong());         
           ps.setString(2, s.getMaSp());
           
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
     public boolean updateSoLuongSp2(DTO_SanPham s,int sl, String maSp){
        String sql="update SanPham set SLTON=? where MASP = ? AND TRANGTHAI = 1";                  
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
            //java.util.Date a=  s.getNgaysinh();        
           ps.setInt(1, s.getSoLuong()+sl);         
           ps.setString(2, maSp);
           
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
     
    public boolean updateDTO_SanPham(DTO_SanPham s) {
        String sql="update SanPham set TENSP=? , MATH=? ,MAUSAC=? ,DUNGLUONG=? ,DONGIA=? ,SLTON=? ,IMG=? ,TRANGTHAI=? where MASP=?";
               
      
        try {
            
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
            //java.util.Date a=  s.getNgaysinh();
           ps.setString(1, s.getTenSp());
           ps.setString(2, s.getMaThuongHieu());
           ps.setString(3,s.getMauSac());
           ps.setString(4, s.getDungLuong());
           ps.setDouble(5, s.getDonGia());
           ps.setInt(6, s.getSoLuong());
           ps.setString(7, s.getImg());
           ps.setInt(8, s.getTrangThai());
           ps.setString(9, s.getMaSp());
           
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
   public int themDS() throws IOException {
    JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel files", "xlsx", "xls");
    fileChooser.setFileFilter(filter);
    int result = fileChooser.showOpenDialog(null);

    if (result == JFileChooser.APPROVE_OPTION) {
        FileInputStream file = null;
        Connection conn = null;
        PreparedStatement statement = null;

        try {
            File selectedFile = fileChooser.getSelectedFile();
            file = new FileInputStream(selectedFile);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            conn = DAO.getConnection();

            String sql = "MERGE INTO SanPham AS target " +
                    "USING (VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)) AS source (MASP, TENSP, MATH, MAUSAC, DUNGLUONG, DONGIA, SLTON, IMG, TRANGTHAI) " +
                    "ON (target.MASP = source.MASP) " +
                    "WHEN MATCHED THEN " +
                    "    UPDATE SET target.TENSP = source.TENSP, " +
                    "               target.MATH = source.MATH, " +
                    "               target.MAUSAC = source.MAUSAC, " +
                    "               target.DUNGLUONG = source.DUNGLUONG, " +
                    "               target.DONGIA = source.DONGIA, " +                               
                    "               target.SLTON = source.SLTON, " +
                    "               target.IMG = source.IMG, " +
                    "               target.TRANGTHAI = source.TRANGTHAI " +
                    "WHEN NOT MATCHED THEN " +
                    "    INSERT (MASP, TENSP, MATH, MAUSAC, DUNGLUONG, DONGIA, SLTON, IMG, TRANGTHAI) " +
                    "    VALUES (source.MASP, source.TENSP, source.MATH, source.MAUSAC, source.DUNGLUONG, source.DONGIA, source.SLTON, source.IMG, source.TRANGTHAI);";

            statement = conn.prepareStatement(sql);

            DataFormatter dataFormatter = new DataFormatter();

            // Loop through rows in Excel sheet and insert/update data into the database
            for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
                XSSFRow row = sheet.getRow(i);
                if (row == null) {
                    continue;
                }

                statement.setString(1, row.getCell(1).getStringCellValue()); // MASP
                statement.setString(2, row.getCell(2).getStringCellValue()); // TENSP
                statement.setString(3, row.getCell(3).getStringCellValue()); // MATH
                statement.setString(4, row.getCell(4).getStringCellValue()); // MAUSAC
                statement.setString(5, row.getCell(5).getStringCellValue()); // DUNGLUONG
                statement.setDouble(6, Double.parseDouble(dataFormatter.formatCellValue(row.getCell(6)))); // DONGIA
                statement.setDouble(7, Double.parseDouble(dataFormatter.formatCellValue(row.getCell(7)))); // SLTON
                statement.setString(8, row.getCell(8).getStringCellValue()); // IMG
                statement.setInt(9, 1); // TRANGTHAI

                // Execute the statement for each row
                statement.executeUpdate();
            }

            JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Thêm thất bại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
                if (file != null) {
                    file.close();
                }
            } catch (SQLException | IOException e) {
                e.printStackTrace();
            }
        }
    }
    return 0;
}
//    public static void main(String[] args) {
//        DAL_SanPham sp = new DAL_SanPham();
//        DTO_SanPham spDto = sp.timSp2("CL01");
//        System.out.println(spDto.getSoLuong());
//        sp.updateSoLuongSp2(spDto, 3, "CL01");
//        DTO_SanPham spDto2 = sp.timSp2("CL01");
//        System.out.println(spDto2.getSoLuong());
//    }

   

}
