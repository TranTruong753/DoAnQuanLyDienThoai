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
import java.util.*;

/**
 *
 * @author Admin
 */
public class DAL_HoaDon {
    
    public List<DTO_HoaDon> getList(){
        try {
            Connection cons = DAO.getConnection();
            String sql = "SELECT * FROM HoaDon";
            List<DTO_HoaDon> list = new ArrayList<>();
            PreparedStatement ps;
            ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DTO_HoaDon hd = new DTO_HoaDon();

                hd.setMaHD(rs.getString("MAHD"));
                hd.setMaNV(rs.getString("MANV"));
                hd.setMaKH(rs.getString("MAKH"));
                hd.setNgayLap(rs.getDate("NGAYLAP"));
                hd.setTongTien(rs.getDouble("TONGTIEN"));
                hd.setGiamGia(rs.getDouble("GIAMGIA"));
                hd.setTienThanhToan(rs.getDouble("TIENTHANHTOAN"));
                hd.setTienKhach(rs.getDouble("TIENKHACH"));
                hd.setTienThoi(rs.getDouble("TIENTHOI"));
                hd.setNgayKtBh(rs.getDate("NGAYKTBH"));
                hd.setTrangThai(rs.getInt("TrangThai"));
                
                if(hd.getTrangThai()==1){
                    list.add(hd);
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
    public boolean addDTO_HoaDon(DTO_HoaDon s) {
        String sql="insert into HoaDon(MAHD,MANV,MAKH,NGAYLAP,TONGTIEN,GIAMGIA,TIENTHANHTOAN,TIENKHACH,TIENTHOI,NGAYKTBH,TRANGTHAI)"
               + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        
        
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, s.getMaHD());
           
           ps.setString(2, s.getMaNV());
           ps.setString(3, s.getMaKH());
           ps.setDate(4, cover(s.getNgayLap()));
           ps.setDouble(5, s.getTongTien());
           ps.setDouble(6, s.getGiamGia());
           ps.setDouble(7, s.getTienThanhToan());
           ps.setDouble(8, s.getTienKhach());
           ps.setDouble(9, s.getTienThoi());
           ps.setDate(10, cover(s.getNgayKtBh()));
           ps.setInt(11, 1);
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return false;
    }
    public java.sql.Date cover(java.util.Date d){
        return new java.sql.Date(d.getTime());
    }
    
    public ArrayList<DTO_HoaDon> timHd(String tk) {
        ArrayList<DTO_HoaDon> list =new ArrayList<>();
        String sql="SELECT * FROM HoaDon where MAHD like N'%"+ tk +"%' or MANV like N'%"+ tk +"%' ";
        try {
            Connection conn = DAO.getConnection();
            PreparedStatement ps= conn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
               DTO_HoaDon hd=new DTO_HoaDon();
               hd.setMaHD(rs.getString("MAHD"));
               hd.setMaNV(rs.getString("MANV"));
               hd.setMaKH(rs.getString("MAKH"));
               hd.setNgayLap(rs.getDate("NGAYLAP"));
               hd.setTongTien(rs.getDouble("TONGTIEN"));
               hd.setGiamGia(rs.getDouble("GIAMGIA"));
               hd.setTienThanhToan(rs.getDouble("TIENTHANHTOAN"));
               hd.setTienKhach(rs.getDouble("TIENKHACH"));
               hd.setTienThoi(rs.getDouble("TIENTHOI"));
               hd.setTrangThai(rs.getInt("TrangThai"));
               list.add(hd);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    
    
  

}
