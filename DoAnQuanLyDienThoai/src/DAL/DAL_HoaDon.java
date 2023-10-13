/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.DTO_HoaDon;
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
}
