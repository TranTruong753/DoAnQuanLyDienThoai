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
public class DTO_NhanVien {
    private String MANV,TENNV,SDT,DIACHI,GIOITINH;
    private Date NGAYSINH;
    private int TRANGTHAI;

    public DTO_NhanVien(String MANV, String TENNV, String SDT, String DIACHI, String GIOITINH, Date NGAYSINH, int TRANGTHAI) {
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.SDT = SDT;
        this.DIACHI = DIACHI;
        this.GIOITINH = GIOITINH;
        this.NGAYSINH = NGAYSINH;
        this.TRANGTHAI = TRANGTHAI;
    }

    public DTO_NhanVien() {
    }

    public String getMANV() {
        return MANV;
    }

    public String getTENNV() {
        return TENNV;
    }

    public String getSDT() {
        return SDT;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public String getGIOITINH() {
        return GIOITINH;
    }

    public Date getNGAYSINH() {
        return NGAYSINH;
    }

    public int getTRANGTHAI() {
        return TRANGTHAI;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public void setTENNV(String TENNV) {
        this.TENNV = TENNV;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    public void setNGAYSINH(Date NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }

    public void setTRANGTHAI(int TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }
    
}
