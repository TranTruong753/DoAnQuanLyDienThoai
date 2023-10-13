/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.DAL_BaoHanh;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BUS_BaoHanh {
   DAL_BaoHanh bh= new DAL_BaoHanh();
   public ArrayList<DTO_BaoHanh> getList(){
       return bh.getList();
   }
   public boolean addDTO_BaoHanh(DTO_BaoHanh s){
       if(bh.addDTO_BaoHanh(s))
           return true;
       return false;
   }
   public boolean xoaDTO_BaoHanh(DTO_BaoHanh s) {
       if(bh.xoaDTO_BaoHanh(s))
           return true;
       return false;
   }
   //dfsfdsf
}
