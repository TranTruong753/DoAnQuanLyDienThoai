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
public class DTO_KhuyenMai {
    private String MAKM,MASP,TENKM,TENSP;
    private int PHANTRAMKM,TRANGTHAI;
    private Date NGAYBD,NGAYKT;

    public DTO_KhuyenMai() {
    }

    public String getMAKM() {
        return MAKM;
    }

    public String getMASP() {
        return MASP;
    }

    public String getTENKM() {
        return TENKM;
    }

    public String getTENSP() {
        return TENSP;
    }

    public int getPHANTRAMKM() {
        return PHANTRAMKM;
    }

    public int getTRANGTHAI() {
        return TRANGTHAI;
    }

    public Date getNGAYBD() {
        return NGAYBD;
    }

    public Date getNGAYKT() {
        return NGAYKT;
    }

    public DTO_KhuyenMai(String MAKM, String MASP, String TENKM, String TENSP, int PHANTRAMKM, int TRANGTHAI, Date NGAYBD, Date NGAYKT) {
        this.MAKM = MAKM;
        this.MASP = MASP;
        this.TENKM = TENKM;
        this.TENSP = TENSP;
        this.PHANTRAMKM = PHANTRAMKM;
        this.TRANGTHAI = TRANGTHAI;
        this.NGAYBD = NGAYBD;
        this.NGAYKT = NGAYKT;
    }

    public void setMAKM(String MAKM) {
        this.MAKM = MAKM;
    }

    public void setMASP(String MASP) {
        this.MASP = MASP;
    }

    public void setTENKM(String TENKM) {
        this.TENKM = TENKM;
    }

    public void setTENSP(String TENSP) {
        this.TENSP = TENSP;
    }

    public void setPHANTRAMKM(int PHANTRAMKM) {
        this.PHANTRAMKM = PHANTRAMKM;
    }

    public void setTRANGTHAI(int TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }

    public void setNGAYBD(Date NGAYBD) {
        this.NGAYBD = NGAYBD;
    }

    public void setNGAYKT(Date NGAYKT) {
        this.NGAYKT = NGAYKT;
    }
    
}
