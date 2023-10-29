/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.DAL_KhuyenMai;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BUS_KhuyenMai {
    DAL_KhuyenMai nv= new DAL_KhuyenMai();
    
    public ArrayList<DTO_KhuyenMai> getList() {
        return nv.getList();
    }
    public boolean addKhuyenMai(DTO_KhuyenMai s){
        if(nv.addDTO_KhuyenMai(s))
            return true;
          return false;
        
    }
    public boolean updateKhuyenMai(DTO_KhuyenMai s){
        if(nv.updateDTO_KhuyenMai(s))
            return true;
          return false;
           
    }
    public ArrayList<DTO_KhuyenMai> timnv(String tk){
        
        return nv.timnv(tk);
    }
    
}
