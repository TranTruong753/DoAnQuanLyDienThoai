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
public class DAL_NhanVien {
    public ArrayList<DTO_NhanVien> getList() {
        try{
            Connection conn = DAO.getConnection();
            String sql ="select * from DTO_NhanVien";
            ArrayList<DTO_NhanVien> list= new ArrayList<>();
            PreparedStatement ps=conn.prepareCall(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                DTO_NhanVien nv=new DTO_NhanVien();
               nv.setMANV(rs.getString("MANV"));
               nv.setTENNV(rs.getString("TENNV"));
               nv.setNGAYSINH(rs.getDate("NGAYSINH"));
               nv.setSDT(rs.getString("SDT"));
               nv.setDIACHI(rs.getString("DIACHI"));
               nv.setGIOITINH(rs.getString("GIOITINH"));
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

    
    public boolean addDTO_NhanVien(DTO_NhanVien s) {
        String sql="insert into DTO_NhanVien(MANV,TENNV,NGAYSINH,SDT,DIACHI,GIOITINH,TRANGTHAI)"
               + "VALUES(?,?,?,?,?,?,?)";
        
        
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, s.getMANV());
           ps.setString(2, s.getTENNV());
           ps.setDate(3, (Date) s.getNGAYSINH());
           ps.setString(4, s.getSDT());
           ps.setString(5, s.getDIACHI());
           ps.setString(6, s.getGIOITINH());
           ps.setFloat(7, 1);
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return false;
    }

    
    public boolean updateDTO_NhanVien(DTO_NhanVien s) {
        String sql="update DTO_NhanVien set MANV=? , TENNV=? ,NGAYSINH=? ,SDT=? ,DIACHI=? ,GIOITINH=? ,TRANGTHAI=? where MANV=?";
               
      
        try {
            
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
            //java.util.Date a=  s.getNgaysinh();
           ps.setString(1, s.getMANV());
           ps.setString(2, s.getTENNV());
           ps.setDate(3, (Date) s.getNGAYSINH());
           ps.setString(4, s.getSDT());
           ps.setString(5, s.getDIACHI());
           ps.setString(6, s.getGIOITINH());
           
           ps.setFloat(7, s.getTRANGTHAI());
           ps.setString(8, s.getMANV());
           
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    
    public ArrayList<DTO_NhanVien> timnv(String tk) {
        ArrayList<DTO_NhanVien> list =new ArrayList<>();
        String sql="SELECT * FROM DTO_NhanVien where TENNV like N'%"+ tk +"%' or MANV like N'%"+ tk +"%' ";
        try {
            Connection conn = DAO.getConnection();
            PreparedStatement ps= conn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
               DTO_NhanVien nv=new DTO_NhanVien();
               nv.setMANV(rs.getString("MANV"));
               nv.setTENNV(rs.getString("TENNV"));
               nv.setNGAYSINH(rs.getDate("NGAYSINH"));
               nv.setSDT(rs.getString("SDT"));
               nv.setDIACHI(rs.getString("DIACHI"));
               nv.setGIOITINH(rs.getString("GIOITINH"));
               nv.setTRANGTHAI(rs.getInt("TRANGTHAI"));
               list.add(nv);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    
}
    


