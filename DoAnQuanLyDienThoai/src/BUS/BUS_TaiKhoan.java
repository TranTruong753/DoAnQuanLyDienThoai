/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;


import DAL.DAL_TaiKhoan;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BUS_TaiKhoan {
    DAL_TaiKhoan nv= new DAL_TaiKhoan();
    
    public ArrayList<DTO_TaiKhoan> getList() {
        return nv.getList();
    }
    public boolean addTaiKhoan(DTO_TaiKhoan s){
        if(nv.addDTO_TaiKhoan(s))
            return true;
          return false;
        
    }
    
     public DTO_TaiKhoan login(String tdn, String mk) {
         return nv.login(tdn, mk);
    }
    
    public boolean updateTaiKhoan(DTO_TaiKhoan s){
        if(nv.updateDTO_TaiKhoan(s))
            return true;
          return false;
           
    }
    
    
}
