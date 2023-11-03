/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.*;
import DTO.*;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BUS_CTHD {
    private DAL_CTHD cthd_DAL = new DAL_CTHD();
    private Component rootPane;
    
    public List<DTO_CTHD> getList() {
        return cthd_DAL.getList();
    }
    
    public ArrayList<DTO_CTHD> timCthd(String key){     
        return cthd_DAL.timCthd(key);
    }
    public boolean addCTHD(DTO_CTHD s){
        if(cthd_DAL.addDTO_CTHD(s))
            return true;
          return false;
        
    }
}
