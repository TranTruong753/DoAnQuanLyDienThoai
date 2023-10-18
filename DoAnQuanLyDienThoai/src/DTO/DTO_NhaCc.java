/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class DTO_NhaCc {
    private String MANCC,TENNCC,SDTNCC,DIACHI;
    private int TRANGTHAI;

    public DTO_NhaCc() {
    }

    public DTO_NhaCc(String MANCC, String TENNCC, String SDTNCC, String DIACHI, int TRANGTHAI) {
        this.MANCC = MANCC;
        this.TENNCC = TENNCC;
        this.SDTNCC = SDTNCC;
        this.DIACHI = DIACHI;
        this.TRANGTHAI = TRANGTHAI;
    }

    public String getMANCC() {
        return MANCC;
    }

    public String getTENNCC() {
        return TENNCC;
    }

    public String getSDTNCC() {
        return SDTNCC;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public int getTRANGTHAI() {
        return TRANGTHAI;
    }

    public void setMANCC(String MANCC) {
        this.MANCC = MANCC;
    }

    public void setTENNCC(String TENNCC) {
        this.TENNCC = TENNCC;
    }

    public void setSDTNCC(String SDTNCC) {
        this.SDTNCC = SDTNCC;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public void setTRANGTHAI(int TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }
}
