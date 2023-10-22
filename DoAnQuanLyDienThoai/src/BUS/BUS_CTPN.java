/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.DAL_CTPN;
import DAL.DAL_CTPN;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BUS_CTPN {
    DAL_CTPN nv= new DAL_CTPN();
    
    public ArrayList<DTO_CTPN> getList() {
        return nv.getList();
    }
    public boolean addCTPN(DTO_CTPN s){
        if(nv.addDTO_CTPN(s))
            return true;
          return false;
        
    }
    public boolean updateCTPN(DTO_CTPN s){
        if(nv.updateDTO_CTPN(s))
            return true;
          return false;
           
    }
    
    
}
