/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class DTO_KhachHang {
    private String MAKH,TENKH,SDTKH;
    private int TRANGTHAI;

    public DTO_KhachHang(String MAKH, String TENKH, String SDTKH, int TRANGTHAI) {
        this.MAKH = MAKH;
        this.TENKH = TENKH;
        this.SDTKH = SDTKH;
        this.TRANGTHAI = TRANGTHAI;
    }

    public DTO_KhachHang() {
    }
    
    
    public String getMAKH() {
        return MAKH;
    }

    public String getTENKH() {
        return TENKH;
    }

    public String getSDTKH() {
        return SDTKH;
    }

    public int getTRANGTHAI() {
        return TRANGTHAI;
    }

    public void setMAKH(String MAKH) {
        this.MAKH = MAKH;
    }

    public void setTENKH(String TENKH) {
        this.TENKH = TENKH;
    }

    public void setSDTKH(String SDTKH) {
        this.SDTKH = SDTKH;
    }

    public void setTRANGTHAI(int TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }
    
    
}
