/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class DTO_SanPham {
    private String maSp,tenSp,maThuongHieu,mauSac,dungLuong,img;
    private Double donGia,khuyenMai;
    private int soLuong,trangThai;
    
    static int maSo = 1000;
    
    public DTO_SanPham() {
    }

    public DTO_SanPham( String tenSp, String maThuongHieu, String mauSac, String dungLuong, String img, Double donGia, Double khuyenMai, int soLuong, int trangThai) {
        maSo++;
        this.maSp = maThuongHieu + maSo;
        this.tenSp = tenSp;
        this.maThuongHieu = maThuongHieu;
        this.mauSac = mauSac;
        this.dungLuong = dungLuong;
        this.img = img;
        this.donGia = donGia;
        this.khuyenMai = khuyenMai;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getMaThuongHieu() {
        return maThuongHieu;
    }

    public void setMaThuongHieu(String maThuongHieu) {
        this.maThuongHieu = maThuongHieu;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Double getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(Double khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
