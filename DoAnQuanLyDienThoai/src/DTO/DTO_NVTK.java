/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Administrator
 */
public class DTO_NVTK {
    int SL;
    String TENNV;

    public DTO_NVTK(int SL, String TENNV) {
        this.SL = SL;
        this.TENNV = TENNV;
    }

    public DTO_NVTK() {
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public String getTENNV() {
        return TENNV;
    }

    public void setTENNV(String TENNV) {
        this.TENNV = TENNV;
    }

}