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
   
}
