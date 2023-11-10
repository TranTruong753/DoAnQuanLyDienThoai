/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.DTO_CTHD;
import DTO.DTO_HoaDon;
import DTO.DTO_NVTK;
import DTO.DTO_TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class DAL_ThongKe {
        public List<DTO_HoaDon> getListDoanhThuTheoNgay() {
        Connection cons = DAO.getConnection();
        String sql = "SELECT NGAYLAP, SUM(TIENTHANHTOAN) as TIENTHANHTOAN FROM HoaDon where TRANGTHAI = 1 GROUP BY NGAYLAP;";
        List<DTO_HoaDon> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DTO_HoaDon hd = new DTO_HoaDon();
                //int thang = rs.getInt("Thang");
                //ThongKe tk = new ThongKe();
                //Date Thang = rs.getDate("NgayLap");
                hd.setNgayLap(rs.getDate("NgayLap"));
                //hd.setNgaylap(new Date(0, thang, 0));
                //tk.setngaylap(Thang);
                hd.setTienThanhToan(rs.getDouble("TienThanhToan"));
                //tk.setTienThanhToan(rs.getInt("TienThanhToan"));
                list.add(hd);
                //list.add(tk);
            }
            ps.close();
            cons.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    
    }

    public List<DTO_CTHD> getListTopSanPham() {
        Connection cons = DAO.getConnection();
        String sql = "SELECT TOP 5 TENSP, SUM(SL) as SL\n" +
                     "FROM CTHD\n" +
                     "GROUP BY TENSP\n" +
                     "ORDER BY SL DESC;";
        
        //String sql = "SELECT sp.MaNhom, nsp.TenNhom, SUM(SLTon) as SLTon FROM SanPham sp JOIN NhomSanPham nsp ON sp.MaNhom = nsp.MaNhom WHERE sp.TrangThai = 1 GROUP BY sp.MaNhom, nsp.TenNhom";
        List<DTO_CTHD> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DTO_CTHD cthd = new DTO_CTHD();
                cthd.setMaSp(rs.getString("TENSP"));
                cthd.setSoLuong(rs.getInt("SL"));
                list.add(cthd);
            }
            ps.close();
            cons.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
        public List<DTO_NVTK> getListTopNhanVien() {
        Connection cons = DAO.getConnection();
        String sql = "SELECT TOP 3 nv.TENNV, COUNT(hd.MANV) as SL\n" +
                    "FROM HoaDon as hd, NhanVien as nv\n" +
                    "WHERE hd.MANV = nv.MANV\n" +
                    "GROUP BY nv.TENNV\n" +
                    "ORDER BY SL DESC;";
        
        //String sql = "SELECT sp.MaNhom, nsp.TenNhom, SUM(SLTon) as SLTon FROM SanPham sp JOIN NhomSanPham nsp ON sp.MaNhom = nsp.MaNhom WHERE sp.TrangThai = 1 GROUP BY sp.MaNhom, nsp.TenNhom";
        List<DTO_NVTK> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DTO_NVTK nvtk = new DTO_NVTK();
                nvtk.setTENNV(rs.getString("TENNV"));
                nvtk.setSL(rs.getInt("SL"));
                list.add(nvtk);
            }
            ps.close();
            cons.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
        
    public DTO_NVTK getNhanVien(String maNv) {
        Connection cons = DAO.getConnection();
        String sql = "SELECT nv.TENNV, COUNT(hd.MANV) as SL\n" +
                    "FROM HoaDon as hd, NhanVien as nv\n" +
                    "WHERE hd.MANV = nv.MANV AND nv.MANV LIKE ?\n" +
                    "GROUP BY nv.TENNV\n" +
                    "ORDER BY SL DESC;";
        
       DTO_NVTK nvtk = null;
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ps.setString(1, maNv);         
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nvtk = new DTO_NVTK();
                nvtk.setTENNV(rs.getString("TENNV"));
                nvtk.setSL(rs.getInt("SL"));
            }
            ps.close();
            cons.close();
            return nvtk;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        DAL_ThongKe tk = new DAL_ThongKe();
        DTO_NVTK nv = new DTO_NVTK();
        nv = tk.getNhanVien("NV005");
        System.out.println(nv.getSL());
    }
}

