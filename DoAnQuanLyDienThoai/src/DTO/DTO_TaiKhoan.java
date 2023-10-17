/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class DTO_TaiKhoan {
    private String TENDN,MANV,MK,PQ;
    private int TRANGTHAI;
    public DTO_TaiKhoan() {
    }

    public DTO_TaiKhoan(String TENDN, String MANV, String MK, String PQ,int TRANGTHAI) {
        this.TENDN = TENDN;
        this.MANV = MANV;
        this.MK = MK;
        this.PQ = PQ;
        this.TRANGTHAI=TRANGTHAI;
    }

    public void setTRANGTHAI(int TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }

    public int getTRANGTHAI() {
        return TRANGTHAI;
    }

    public String getTENDN() {
        return TENDN;
    }

    public String getMANV() {
        return MANV;
    }

    public String getMK() {
        return MK;
    }

    public String getPQ() {
        return PQ;
    }

    public void setTENDN(String TENDN) {
        this.TENDN = TENDN;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }

    public void setPQ(String PQ) {
        this.PQ = PQ;
    }
    
}
