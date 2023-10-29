/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DAL_KhuyenMai {
    
    public ArrayList<DTO_KhuyenMai> getList() {
        try{
            Connection conn = DAO.getConnection();
            String sql ="select * from KhuyenMai";
            ArrayList<DTO_KhuyenMai> list= new ArrayList<>();
            PreparedStatement ps=conn.prepareCall(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                DTO_KhuyenMai nv=new DTO_KhuyenMai();
               nv.setMAKM(rs.getString("MAKM"));
               nv.setMASP(rs.getString("MASP"));
               nv.setTENSP(rs.getString("TENSP"));
               nv.setTENKM(rs.getString("TENKM"));
               nv.setPHANTRAMKM(rs.getInt("PHANTRAMKM"));
               nv.setNGAYBD(rs.getDate("NGAYBD"));
               nv.setNGAYKT(rs.getDate("NGAYKT"));
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

    
    public boolean addDTO_KhuyenMai(DTO_KhuyenMai s) {
        String sql="insert into KhuyenMai(MAKM,MASP,TENSP,TENKM,PHANTRAMKM,NGAYBD,NGAYKT,TRANGTHAI)"
               + "VALUES(?,?,?,?,?,?,?,?)";
        
        
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, s.getMAKM());
           ps.setString(2, s.getMASP());
           ps.setString(3, s.getTENSP());
           ps.setString(4, s.getTENKM());
           ps.setInt(5, s.getPHANTRAMKM());
           ps.setDate(6, cover(s.getNGAYBD()));
           ps.setDate(7, cover(s.getNGAYKT()));
           ps.setFloat(8, 1);
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return false;
    }

    
    public boolean updateDTO_KhuyenMai(DTO_KhuyenMai s) {
        String sql="update KhuyenMai set MAKM=? , MASP=? ,TENSP=? ,TENKM=? ,PHANTRAMKM=? ,NGAYBD=?,NGAYKT=?,TRANGTHAI=? where MAKM=?";
               
      
        try {
            
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
            //java.util.Date a=  s.getNgaysinh();
           ps.setString(1, s.getMAKM());
           ps.setString(2, s.getMASP());
           ps.setString(3, s.getTENSP());
           ps.setString(4, s.getTENKM());
           ps.setInt(5, s.getPHANTRAMKM());
           ps.setDate(6, cover(s.getNGAYBD()));
           ps.setDate(7, cover(s.getNGAYKT()));
           ps.setFloat(8, 1);
           
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    
    public ArrayList<DTO_KhuyenMai> timnv(String tk) {
        ArrayList<DTO_KhuyenMai> list =new ArrayList<>();
        String sql="SELECT * FROM KhuyenMai where MASP like N'%"+ tk +"%' or MAKM like N'%"+ tk +"%' ";
        try {
            Connection conn = DAO.getConnection();
            PreparedStatement ps= conn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
               DTO_KhuyenMai nv=new DTO_KhuyenMai();
               nv.setMAKM(rs.getString("MAKM"));
               nv.setMASP(rs.getString("MASP"));
               nv.setTENSP(rs.getString("TENSP"));
               nv.setTENKM(rs.getString("TENKM"));
               nv.setPHANTRAMKM(rs.getInt("PHANTRAMKM"));
               nv.setNGAYBD(rs.getDate("NGAYBD"));
               nv.setNGAYKT(rs.getDate("NGAYKT"));
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
    
}
