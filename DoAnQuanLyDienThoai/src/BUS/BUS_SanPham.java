/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DTO.*;
import DAL.*;
import java.awt.Component;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author Admin
 */
public class BUS_SanPham {
    private DAL_SanPham sp_DAL = new DAL_SanPham();
    private Component rootPane;
    
    public List<DTO_SanPham> getList(){
        return sp_DAL.getList();
    }
    
    public ArrayList<DTO_SanPham> timSp(String key){     
        return sp_DAL.timSp(key);
    }
    
    public DTO_SanPham timSp2(String key){     
        return sp_DAL.timSp2(key);
    }
    
    public ArrayList<DTO_SanPham> timThTrongSp(String key){     
        return sp_DAL.timThTrongSp(key);
    }
    
    public ArrayList<DTO_SanPham> timSpDaKhoa(String key){     
        return sp_DAL.timSpDaKhoa(key);
    }
    
    public boolean addSanPham(DTO_SanPham sp){
        if(sp_DAL.addDTO_SanPham(sp))
            return true;
          return false;
        
    }
    public boolean updateSanPham(DTO_SanPham sp){
        if(sp_DAL.updateDTO_SanPham(sp))
            return true;
          return false;           
    }
    
    public boolean updateSoLuongSp(DTO_SanPham sp){
        if(sp_DAL.updateSoLuongSp(sp))
            return true;
          return false;           
    }
    
    public boolean updateSoLuongSp2(int sl, String maSp, DTO_SanPham sp){
        if(sp_DAL.updateSoLuongSp2(sp,sl,maSp))
            return true;
          return false;           
    }
     
    public int themDS() throws IOException{         
         return sp_DAL.themDS();
    }
    
    
}
