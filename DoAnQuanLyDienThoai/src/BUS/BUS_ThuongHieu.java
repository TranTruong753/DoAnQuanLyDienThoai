/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.DAL_ThuongHieu;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BUS_ThuongHieu {
    DAL_ThuongHieu thDal= new DAL_ThuongHieu();
    
    public ArrayList<DTO_ThuongHieu> getList() {
        return thDal.getList();
    }
    
    public boolean addThuongHieu(DTO_ThuongHieu tH){
        if(thDal.addThuongHieu(tH))
            return true;
          return false;       
    }
}
