/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.DAL_KhachHang;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BUS_KhachHang {
        DAL_KhachHang kh= new DAL_KhachHang();
    
    public ArrayList<DTO_KhachHang> getList() {
        return kh.getList();
    }
    public boolean addKhachHang(DTO_KhachHang s){
        if(kh.addDTO_KhachHang(s))
            return true;
          return false;
        
    }
    public boolean updateKhachHang(DTO_KhachHang s){
        if(kh.updateDTO_KhachHang(s))
            return true;
          return false;
           
    }
    public ArrayList<DTO_KhachHang> timnv(String tk){
        
        return kh.timkh(tk);
    }
     public int themDS(){
         
         return kh.themDS();
     }
}
