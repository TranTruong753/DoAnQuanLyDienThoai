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
public class DAL_BaoHanh {
    public ArrayList<DTO_BaoHanh> getList() {
        try{
            Connection conn = DAO.getConnection();
            String sql ="select * from BaoHanh";
            ArrayList<DTO_BaoHanh> list= new ArrayList<>();
            PreparedStatement ps=conn.prepareCall(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                DTO_BaoHanh nv=new DTO_BaoHanh();
               nv.setMABH(rs.getString("MABH"));
               nv.setMAKH(rs.getString("MAKH"));
               nv.setMAHD(rs.getString("MAHD"));
               nv.setMASP(rs.getString("MASP"));
               nv.setLYDO(rs.getString("LYDO"));
               nv.setNGAYLAP(rs.getDate("NGAYLAP"));
             
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
    public boolean addDTO_BaoHanh(DTO_BaoHanh s) {
        String sql="insert into BaoHanh(MABH,MAKH,MAHD,MASP,LYDO,NGAYLAP,TRANGTHAI)"
               + "VALUES(?,?,?,?,?,?,?)";
        
        
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, s.getMABH());
           ps.setString(2, s.getMAKH());
           ps.setString(3,  s.getMAHD());
           ps.setString(4, s.getMASP());
           ps.setString(5, s.getLYDO());
           ps.setDate(6, (Date) s.getNGAYLAP());
           
           ps.setFloat(7, 1);
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return false;
    }
    public boolean xoaDTO_BaoHanh(DTO_BaoHanh s) {
        String sql="update BaoHanh set MABH=? , MAKH=? ,MAHD=? ,MASP=? ,LYDO=? ,NGAYLAP=? ,TRANGTHAI=? where MABH=?";
               
      
        try {
            
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
            //java.util.Date a=  s.getMAHD();
           ps.setString(1, s.getMABH());
           ps.setString(2, s.getMAKH());
           ps.setString(3,  s.getMAHD());
           ps.setString(4, s.getMASP());
           ps.setString(5, s.getLYDO());
           
           ps.setDate(6, (Date) s.getNGAYLAP());
           ps.setFloat(7, 0);
           ps.setString(8, s.getMABH());
           
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
