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
    DAL_ThuongHieu nv= new DAL_ThuongHieu();
    
    public ArrayList<DTO_ThuongHieu> getList() {
        return nv.getList();
    }
}
