/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import BUS.*;
import DTO.*;
import function.funcDungChung;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class QuanLyCTHDController {
    private TableRowSorter<TableModel> rowSorter ;
    public BUS_CTHD hdBus = new BUS_CTHD();
    public funcDungChung fuc = new funcDungChung();
    
    //FUCTION 
    // tùy chỉnh giao diện bảng 
    public void changeTable(JTable tbl_HoaDon){
        // Điều chỉnh chiều rộng của các cột tại đây
        //tbl_HoaDon.getColumnModel().getColumn(0).setPreferredWidth(200); // Ví dụ: Đặt chiều rộng của cột 0 là 100 pixels
        //tbl_HoaDon.getColumnModel().getColumn(1).setPreferredWidth(200); // Ví dụ: Đặt chiều rộng của cột 1 là 80 pixels
        // Thực hiện tương tự cho các cột còn lại
        // Điều chỉnh chiều cao của các dòng
       tbl_HoaDon.setRowHeight(40);

       // Điều chỉnh font và chiều rộng của tiêu đề
       JTableHeader header = tbl_HoaDon.getTableHeader();
       header.setFont(new Font("Tahoma", Font.BOLD, 14));
       header.setPreferredSize(new Dimension(50, 50));

       // Căn giữa tiêu đề theo chiều dọc
       DefaultTableCellRenderer centerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
       centerRenderer.setHorizontalAlignment(JLabel.CENTER);   
       
       rowSorter = new TableRowSorter<>(tbl_HoaDon.getModel());
       tbl_HoaDon.setRowSorter(rowSorter);
       tbl_HoaDon.validate();
       tbl_HoaDon.repaint();
    }
    // hàm tạo bảng 
    public void loadHoaDonList(List<DTO_CTHD> cthd,JTable table) {
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {        //Không được chỉnh sửa hàng và cột của bảng
                return false;
            }
            
        };
        dtm.addColumn("MÃ HĐ");
        dtm.addColumn("MÃ SP");
        dtm.addColumn("TÊN SP");
        dtm.addColumn("SỐ LƯỢNG");
        dtm.addColumn("ĐƠN GIÁ");
        dtm.addColumn("THÀNH TIÊN");
        table.setModel(dtm);
        
        List<DTO_CTHD> arr = new ArrayList<>() ;
        //arr = empBUS.getAllEmployees();
        arr = cthd;
        for (int i = 0; i < arr.size(); i++) {
            DTO_CTHD ct = arr.get(i);
            
            String maHd = ct.getMaHD();
            String maSp = ct.getMaSp();
            String tenSp = ct.getTenSp();
            int soLuong = ct.getSoLuong();
            Double donGia = ct.getDonGia();
            Double thanhTien = ct.getThanhTien();
            
            
            Object[] row = {maHd, maSp, tenSp, soLuong, fuc.doubleToFormattedString(donGia), fuc.doubleToFormattedString(thanhTien)};
            dtm.addRow(row);
        }
        changeTable(table);
        
    
    }
    
}
