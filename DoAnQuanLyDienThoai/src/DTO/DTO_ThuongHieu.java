/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class DTO_ThuongHieu {
    private String MATH,TENTH;
    private int TRANGTHAI;

    public DTO_ThuongHieu() {
    }

    public DTO_ThuongHieu(String MATH, String TENTH, int TRANGTHAI) {
        this.MATH = MATH;
        this.TENTH = TENTH;
        this.TRANGTHAI = TRANGTHAI;
    }

    public String getMATH() {
        return MATH;
    }

    public String getTENTH() {
        return TENTH;
    }

    public int getTRANGTHAI() {
        return TRANGTHAI;
    }

    public void setMATH(String MATH) {
        this.MATH = MATH;
    }

    public void setTENTH(String TENTH) {
        this.TENTH = TENTH;
    }

    public void setTRANGTHAI(int TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }
}
