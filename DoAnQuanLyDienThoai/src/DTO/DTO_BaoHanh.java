/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class DTO_BaoHanh {
    private String MABH,MAKH,MAHD,MASP,LYDO;
    private Date NGAYLAP;
    private int TRANGTHAI;

    public DTO_BaoHanh() {
    }

    public DTO_BaoHanh(String MABH, String MAKH, String MAHD, String MASP, String LYDO, Date NGAYLAP, int TRANGTHAI) {
        this.MABH = MABH;
        this.MAKH = MAKH;
        this.MAHD = MAHD;
        this.MASP = MASP;
        this.LYDO = LYDO;
        this.NGAYLAP = NGAYLAP;
        this.TRANGTHAI = TRANGTHAI;
    }

    public String getMABH() {
        return MABH;
    }

    public String getMAKH() {
        return MAKH;
    }

    public String getMAHD() {
        return MAHD;
    }

    public String getMASP() {
        return MASP;
    }

    public String getLYDO() {
        return LYDO;
    }

    public Date getNGAYLAP() {
        return NGAYLAP;
    }

    public int getTRANGTHAI() {
        return TRANGTHAI;
    }

    public void setMABH(String MABH) {
        this.MABH = MABH;
    }

    public void setMAKH(String MAKH) {
        this.MAKH = MAKH;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public void setMASP(String MASP) {
        this.MASP = MASP;
    }

    public void setLYDO(String LYDO) {
        this.LYDO = LYDO;
    }

    public void setNGAYLAP(Date NGAYLAP) {
        this.NGAYLAP = NGAYLAP;
    }

    public void setTRANGTHAI(int TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }

    
    
    
}
