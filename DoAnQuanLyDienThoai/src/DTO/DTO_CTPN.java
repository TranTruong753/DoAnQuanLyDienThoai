/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class DTO_CTPN {
    private String MAHDNH,MASP,TENSP;
    private int SL;
    private double DONGIA,THANHTIEN;

    public DTO_CTPN(String MAHDNH, String MASP, String TENSP, int SL, double DONGIA, double THANHTIEN) {
        this.MAHDNH = MAHDNH;
        this.MASP = MASP;
        this.TENSP = TENSP;
        this.SL = SL;
        this.DONGIA = DONGIA;
        this.THANHTIEN = THANHTIEN;
    }

    public DTO_CTPN() {
    }

    public String getMAHDNH() {
        return MAHDNH;
    }

    public String getMASP() {
        return MASP;
    }

    public String getTENSP() {
        return TENSP;
    }

    public int getSL() {
        return SL;
    }

    public double getDONGIA() {
        return DONGIA;
    }

    public double getTHANHTIEN() {
        return THANHTIEN;
    }

    public void setMAHDNH(String MAHDNH) {
        this.MAHDNH = MAHDNH;
    }

    public void setMASP(String MASP) {
        this.MASP = MASP;
    }

    public void setTENSP(String TENSP) {
        this.TENSP = TENSP;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public void setDONGIA(double DONGIA) {
        this.DONGIA = DONGIA;
    }

    public void setTHANHTIEN(double THANHTIEN) {
        this.THANHTIEN = THANHTIEN;
    }
    
    
    
    
}
