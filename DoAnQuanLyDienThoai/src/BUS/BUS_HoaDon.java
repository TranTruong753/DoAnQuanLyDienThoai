/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.*;
import DTO.*;

import java.awt.Component;
import java.util.*;

/**
 *
 * @author Admin
 */
public class BUS_HoaDon {
    DAL_HoaDon hd_DAL = new DAL_HoaDon();
    private Component rootPane;
    
    public List<DTO_HoaDon> getList() {
        return hd_DAL.getList();
    }
    //cmt nhanhtestquangtruong
}
