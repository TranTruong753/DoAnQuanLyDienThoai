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
public class DAL_ThuongHieu {
    public ArrayList<DTO_ThuongHieu> getList() {
        try{
            Connection conn = DAO.getConnection();
            String sql ="select * from ThuongHieu";
            ArrayList<DTO_ThuongHieu> list= new ArrayList<>();
            PreparedStatement ps=conn.prepareCall(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                DTO_ThuongHieu nv=new DTO_ThuongHieu();
               nv.setMATH(rs.getString("MATH"));
               nv.setTENTH(rs.getString("TENTH"));
               
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
    
    
}
