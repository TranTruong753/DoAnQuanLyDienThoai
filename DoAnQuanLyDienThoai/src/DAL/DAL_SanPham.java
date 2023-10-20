/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
                sp.setKhuyenMai(rs.getDouble("KHUYENMAI"));
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
                sp.setKhuyenMai(rs.getDouble("KHUYENMAI"));
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
        String sql="insert into SanPham(MASP,TENSP,MATH,MAUSAC,DUNGLUONG,DONGIA,KHUYENMAI,SLTON,IMG,TRANGTHAI)"
               + "VALUES(?,?,?,?,?,?,?,?,?,?)";             
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, sp.getMaSp());
           ps.setString(2, sp.getTenSp());
           ps.setString(3,sp.getMaThuongHieu());
           ps.setString(4, sp.getMauSac());
           ps.setString(5, sp.getDungLuong());
           ps.setDouble(6, sp.getDonGia());
           ps.setDouble(7, sp.getKhuyenMai());
           ps.setInt(8, sp.getSoLuong());
           ps.setString(9, sp.getImg());
           sp.setTrangThai(1);
           ps.setInt(10, sp.getTrangThai());
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return false;
    }

    
    public boolean updateDTO_SanPham(DTO_SanPham s) {
        String sql="update SanPham set TENSP=? , MATH=? ,MAUSAC=? ,DUNGLUONG=? ,DONGIA=? ,KHUYENMAI=? ,SLTON=? ,IMG=? ,TRANGTHAI=? where MASP=?";
               
      
        try {
            
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
            //java.util.Date a=  s.getNgaysinh();
           ps.setString(1, s.getTenSp());
           ps.setString(2, s.getMaThuongHieu());
           ps.setString(3,s.getMauSac());
           ps.setString(4, s.getDungLuong());
           ps.setDouble(5, s.getDonGia());
           ps.setDouble(6, s.getKhuyenMai());
           ps.setInt(7, s.getSoLuong());
           ps.setString(8, s.getImg());
           ps.setInt(9, s.getTrangThai());
           ps.setString(10, s.getMaSp());
           
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
