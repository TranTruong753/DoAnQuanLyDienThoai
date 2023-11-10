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
public class DAL_TaiKhoan {
    public ArrayList<DTO_TaiKhoan> getList() {
        try{
            Connection conn = DAO.getConnection();
            String sql ="select * from TaiKhoan";
            ArrayList<DTO_TaiKhoan> list= new ArrayList<>();
            PreparedStatement ps=conn.prepareCall(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                DTO_TaiKhoan nv=new DTO_TaiKhoan();
               nv.setTENDN(rs.getString("TENDN"));
               nv.setMANV(rs.getString("MANV"));
               nv.setMK(rs.getString("MK"));
               nv.setPQ(rs.getString("PQ"));
               
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

    public DTO_TaiKhoan login(String tdn, String mk) {
        Connection cons = DAO.getConnection();
        String sql = "SELECT * FROM TaiKhoan WHERE TENDN LIKE ? AND MK LIKE ?";
        DTO_TaiKhoan tk = null;
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ps.setString(1, tdn);
            ps.setString(2, mk);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tk = new DTO_TaiKhoan();
                tk.setMANV(rs.getString("MANV"));
                tk.setMK(rs.getString("MK"));
                tk.setPQ(rs.getString("PQ"));
                tk.setTRANGTHAI(rs.getInt("TRANGTHAI"));
                tk.setTENDN(rs.getString("TENDN"));
            }
            ps.close();
            cons.close();
            return tk;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }    
    public boolean addDTO_TaiKhoan(DTO_TaiKhoan s) {
        String sql="insert into TaiKhoan(TENDN,MANV,MK,PQ,TRANGTHAI)"
               + "VALUES(?,?,?,?,?)";
        
        
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, s.getTENDN());
           ps.setString(2, s.getMANV());
           ps.setString(3, s.getMK());
           ps.setString(4, s.getPQ());
           ps.setFloat(5, 1);
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return false;
    }
public boolean updateDTO_TaiKhoan(DTO_TaiKhoan s) {
        String sql="update TaiKhoan set TENDN=? , MANV=? ,MK=? ,PQ=? ,TRANGTHAI=? where TENDN=?";
               
      
        try {
            
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
            //java.util.Date a=  s.getNgaysinh();
           ps.setString(1, s.getTENDN());
           ps.setString(2, s.getMANV());
            ps.setString(3, s.getMK());
           ps.setString(4, s.getPQ());
           
           
           ps.setFloat(5, s.getTRANGTHAI());
           ps.setString(6, s.getTENDN());
           
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
