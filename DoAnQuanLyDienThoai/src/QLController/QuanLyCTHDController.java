/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import BUS.*;
import DTO.*;
import function.*;
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
    public void changeTable(JTable tbl_CTHD){
        // Điều chỉnh chiều rộng của các cột tại đây
       tbl_CTHD.setRowHeight(40);

       // Điều chỉnh font và chiều rộng của tiêu đề
       JTableHeader header = tbl_CTHD.getTableHeader();
       header.setFont(new Font("Tahoma", Font.BOLD, 14));
       header.setPreferredSize(new Dimension(50, 50));

       // Căn giữa tiêu đề theo chiều dọc
       DefaultTableCellRenderer centerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
       centerRenderer.setHorizontalAlignment(JLabel.CENTER);   
       
       CenterRenderer centerRendererRow = new CenterRenderer();
       // Áp dụng renderer cho các cột cụ thể (thay thế 'columnIndex' bằng chỉ số cột của bạn)
       tbl_CTHD.getColumnModel().getColumn(0).setCellRenderer(centerRendererRow);
       tbl_CTHD.getColumnModel().getColumn(1).setCellRenderer(centerRendererRow);
       tbl_CTHD.getColumnModel().getColumn(2).setCellRenderer(centerRendererRow);
       tbl_CTHD.getColumnModel().getColumn(3).setCellRenderer(centerRendererRow);
       tbl_CTHD.getColumnModel().getColumn(4).setCellRenderer(centerRendererRow);
       tbl_CTHD.getColumnModel().getColumn(5).setCellRenderer(centerRendererRow);
 
       
       rowSorter = new TableRowSorter<>(tbl_CTHD.getModel());
       tbl_CTHD.setRowSorter(rowSorter);
       tbl_CTHD.validate();
       tbl_CTHD.repaint();
    }
    // hàm tạo bảng 
    public void loadCTHoaDonList(List<DTO_CTHD> cthd,JTable table) {
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
