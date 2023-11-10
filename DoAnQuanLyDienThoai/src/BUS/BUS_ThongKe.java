/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.DAL_ThongKe;
import DTO.DTO_CTHD;
import DTO.DTO_HoaDon;
import DTO.DTO_NVTK;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class BUS_ThongKe {
    DAL_ThongKe hdi = new DAL_ThongKe();
    public List<DTO_HoaDon> getListDoanhThuTheoNgay() {
        return hdi.getListDoanhThuTheoNgay();
    }
    public List<DTO_NVTK> getListTopNhanVien() {
        return hdi.getListTopNhanVien();
    }
    public List<DTO_CTHD> getListTopSanPham() {
        return hdi.getListTopSanPham();
    }
    public DTO_NVTK getNhanVien(String maNv){
        return hdi.getNhanVien(maNv);
    }
}
    

