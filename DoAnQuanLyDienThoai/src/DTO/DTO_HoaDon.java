/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.*;

/**
 *
 * @author Admin
 */
public class DTO_HoaDon {
    private String maHD ;
    private String maNV ;
    private String maKH ;
    private Date ngayLap ;
    private Double tongTien ;
    private Double giamGia ;
    private Double tienThanhToan ;
    private Double tienKhach ;
    private Double tienThoi ;
    private Date ngayKtBh ;
    private int trangThai ;
    
    static int maSo = 1000 ;
    
    public DTO_HoaDon() {
    }

    public DTO_HoaDon( String maNV, String maKH, Date ngayLap, Double tongTien, Double giamGia, Double tienThanhToan, Double tienKhach, Double tienThoi, Date ngayKtBh, int trangThai) {
        maSo += 1;
        this.maHD = "HD" + maSo;
        this.maNV = maNV;
        this.maKH = maKH;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.giamGia = giamGia;
        this.tienThanhToan = tienThanhToan;
        this.tienKhach = tienKhach;
        this.tienThoi = tienThoi;
        this.ngayKtBh = ngayKtBh;
        this.trangThai = trangThai;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public Double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(Double giamGia) {
        this.giamGia = giamGia;
    }

    public Double getTienThanhToan() {
        return tienThanhToan;
    }

    public void setTienThanhToan(Double tienThanhToan) {
        this.tienThanhToan = tienThanhToan;
    }

    public Double getTienKhach() {
        return tienKhach;
    }

    public void setTienKhach(Double tienKhach) {
        this.tienKhach = tienKhach;
    }

    public Double getTienThoi() {
        return tienThoi;
    }

    public void setTienThoi(Double tienThoi) {
        this.tienThoi = tienThoi;
    }

    public Date getNgayKtBh() {
        return ngayKtBh;
    }

    public void setNgayKtBh(Date ngayKtBh) {
        this.ngayKtBh = ngayKtBh;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
    
    
}
