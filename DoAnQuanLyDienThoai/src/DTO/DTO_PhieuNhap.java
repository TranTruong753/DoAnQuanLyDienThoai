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
public class DTO_PhieuNhap {
    private String MAHDNH,MANCC,TENNCC;
    private Date NGAYGIAO;
    private double TONGTIEN;
    private int TRANGTHAI;

    public DTO_PhieuNhap() {
    }

    public DTO_PhieuNhap(String MAHDNH, String MANCC, String TENNCC, Date NGAYGIAO, double TONGTIEN, int TRANGTHAI) {
        this.MAHDNH = MAHDNH;
        this.MANCC = MANCC;
        this.TENNCC = TENNCC;
        this.NGAYGIAO = NGAYGIAO;
        this.TONGTIEN = TONGTIEN;
        this.TRANGTHAI = TRANGTHAI;
    }

    public String getMAHDNH() {
        return MAHDNH;
    }

    public String getMANCC() {
        return MANCC;
    }

    public String getTENNCC() {
        return TENNCC;
    }

    public Date getNGAYGIAO() {
        return NGAYGIAO;
    }

    public double getTONGTIEN() {
        return TONGTIEN;
    }

    public int getTRANGTHAI() {
        return TRANGTHAI;
    }

    public void setMAHDNH(String MAHDNH) {
        this.MAHDNH = MAHDNH;
    }

    public void setMANCC(String MANCC) {
        this.MANCC = MANCC;
    }

    public void setTENNCC(String TENNCC) {
        this.TENNCC = TENNCC;
    }

    public void setNGAYGIAO(Date NGAYGIAO) {
        this.NGAYGIAO = NGAYGIAO;
    }

    public void setTONGTIEN(double TONGTIEN) {
        this.TONGTIEN = TONGTIEN;
    }

    public void setTRANGTHAI(int TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }
    
    
}
