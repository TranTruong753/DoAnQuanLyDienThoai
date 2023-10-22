/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.DAL_PhieuNhap;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BUS_PhieuNhap {
    DAL_PhieuNhap nv= new DAL_PhieuNhap();
    
    public ArrayList<DTO_PhieuNhap> getList() {
        return nv.getList();
    }
    public boolean addPhieuNhap(DTO_PhieuNhap s){
        if(nv.addDTO_PhieuNhap(s))
            return true;
          return false;
        
    }
    public boolean updatePhieuNhap(DTO_PhieuNhap s){
        if(nv.updateDTO_PhieuNhap(s))
            return true;
          return false;
           
    }
    
}
