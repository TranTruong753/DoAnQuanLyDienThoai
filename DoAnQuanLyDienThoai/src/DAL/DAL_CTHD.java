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
public class DAL_CTHD {
    
    public List<DTO_CTHD> getList(){
        try {
            Connection cons = DAO.getConnection();
            String sql = "SELECT * FROM CTHD";
            List<DTO_CTHD> list = new ArrayList<>();
            PreparedStatement ps;
            ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DTO_CTHD cthd = new DTO_CTHD();
                
                cthd.setMaHD(rs.getString("MAHD"));
                cthd.setMaSp(rs.getString("MASP"));
                cthd.setTenSp(rs.getString("TENSP"));
                cthd.setSoLuong(rs.getInt("SL"));
                cthd.setDonGia(rs.getDouble("DONGIA"));
                cthd.setThanhTien(rs.getDouble("THANHTIEN"));
            
                list.add(cthd);
                
                
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
    public boolean addDTO_CTHD(DTO_CTHD s) {
        String sql="insert into CTHD(MAHD,MASP,TENSP,SL,DONGIA,THANHTIEN)"
               + "VALUES(?,?,?,?,?,?)";
        
        
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, s.getMaHD());
           ps.setString(2, s.getMaSp());
           
           ps.setString(3, s.getTenSp());
           ps.setInt(4, s.getSoLuong());
           ps.setDouble(5, s.getDonGia());
           ps.setDouble(6, s.getThanhTien());
           
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return false;
    }
    public java.sql.Date cover(java.util.Date d){
        return new java.sql.Date(d.getTime());
    }
    
    public ArrayList<DTO_CTHD> timCthd(String key) {
        ArrayList<DTO_CTHD> list =new ArrayList<>();
        String sql="SELECT * FROM CTHD where MAHD = '" + key + "'";
        try {
            Connection conn = DAO.getConnection();
            PreparedStatement ps= conn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
                DTO_CTHD cthd = new DTO_CTHD();
                
                cthd.setMaHD(rs.getString("MAHD"));
                cthd.setMaSp(rs.getString("MASP"));
                cthd.setTenSp(rs.getString("TENSP"));
                cthd.setSoLuong(rs.getInt("SL"));
                cthd.setDonGia(rs.getDouble("DONGIA"));
                cthd.setThanhTien(rs.getDouble("THANHTIEN"));
            
                list.add(cthd);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
