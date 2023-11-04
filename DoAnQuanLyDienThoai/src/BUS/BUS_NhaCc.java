/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.DAL_NhaCc;
import DAL.DAL_NhanVien;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BUS_NhaCc {
    DAL_NhaCc nccDAL= new DAL_NhaCc();
    
    public ArrayList<DTO_NhaCc> getList() {
        return nccDAL.getList();
    }
    public boolean addNhaCc(DTO_NhaCc s){
        if(nccDAL.addDTO_NhaCc(s))
            return true;
          return false;
        
    }
    public boolean updateNhaCc(DTO_NhaCc s){
        if(nccDAL.updateDTO_NhaCc(s))
            return true;
          return false;
           
    }
    public int themDS(){
         
         return nccDAL.themDS();
     }
    
    public ArrayList<DTO_NhaCc> timNcc(String key){     
        return nccDAL.timNcc(key);
    }
    
}
