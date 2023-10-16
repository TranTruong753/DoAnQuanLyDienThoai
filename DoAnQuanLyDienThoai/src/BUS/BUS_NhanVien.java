/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.DAL_NhanVien;
import DTO.*;
import java.awt.Component;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BUS_NhanVien {
    DAL_NhanVien nv= new DAL_NhanVien();
    
    public ArrayList<DTO_NhanVien> getList() {
        return nv.getList();
    }
    public boolean addNhanVien(DTO_NhanVien s){
        if(nv.addDTO_NhanVien(s))
            return true;
          return false;
        
    }
    public boolean updateNhanVien(DTO_NhanVien s){
        if(nv.updateDTO_NhanVien(s))
            return true;
          return false;
           
    }
    public ArrayList<DTO_NhanVien> timnv(String tk){
        
        return nv.timnv(tk);
    }
     public int themDS(){
         
         return nv.themDS();
     }
   
    
}
