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

/**
 *
 * @author Admin
 */
public class DAL_PhieuNhap {
    public ArrayList<DTO_PhieuNhap> getList() {
        try{
            Connection conn = DAO.getConnection();
            String sql ="select * from HDNhapHang";
            ArrayList<DTO_PhieuNhap> list= new ArrayList<>();
            PreparedStatement ps=conn.prepareCall(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                DTO_PhieuNhap nv=new DTO_PhieuNhap();
               nv.setMAHDNH(rs.getString("MAHDNH"));
               nv.setMANCC(rs.getString("MANCC"));
               
               nv.setTENNCC(rs.getString("TENNCC"));
               nv.setNGAYGIAO(rs.getDate("NGAYGIAO"));
               nv.setTONGTIEN(rs.getDouble("TONGTIEN"));
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

    public java.sql.Date cover(java.util.Date d){
        return new java.sql.Date(d.getTime());
    }
    public boolean addDTO_PhieuNhap(DTO_PhieuNhap s) {
        String sql="insert into HDNhapHang(MAHDNH,MANCC,TENNCC,NGAYGIAO,TONGTIEN,TRANGTHAI)"
               + "VALUES(?,?,?,?,?,?)";
        
        
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, s.getMAHDNH());
           ps.setString(2, s.getMANCC());
           
           ps.setString(3, s.getTENNCC());
           ps.setDate(4, cover(s.getNGAYGIAO()));
           ps.setDouble(5, s.getTONGTIEN());
           ps.setDouble(6, s.getTRANGTHAI());
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return false;
    }

    
    public boolean updateDTO_PhieuNhap(DTO_PhieuNhap s) {
        String sql="update HDNhapHang set MAHDNH=? , MANCC=?,TENNCC=? ,NGAYGIAO=? ,TONGTIEN=? ,TRANGTHAI=? where MAHDNH=?";
               
      
        try {
            
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
            //java.util.Date a=  s.getNgaysinh();
           ps.setString(1, s.getMAHDNH());
           ps.setString(2, s.getMANCC());
           
           ps.setString(3, s.getTENNCC());
           ps.setDate(4, cover(s.getNGAYGIAO()));
           ps.setDouble(5, s.getTONGTIEN());
           
           ps.setDouble(6, s.getTRANGTHAI());
           ps.setString(7, s.getMAHDNH());
           
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
