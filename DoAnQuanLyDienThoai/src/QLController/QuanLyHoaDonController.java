/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import BUS.BUS_HoaDon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import DTO.*;
import GUI_QuanLy.GUI_ThongTinHoaDon;
import function.*;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Admin
 */
public class QuanLyHoaDonController {
    private TableRowSorter<TableModel> rowSorter ;
    public BUS_HoaDon hdBus = new BUS_HoaDon();
    funcDungChung fuc = new funcDungChung();
    
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
   
       CenterRenderer centerRendererRow = new CenterRenderer();

        // Áp dụng renderer cho các cột cụ thể (thay thế 'columnIndex' bằng chỉ số cột của bạn)
       tbl_HoaDon.getColumnModel().getColumn(0).setCellRenderer(centerRendererRow);
       tbl_HoaDon.getColumnModel().getColumn(1).setCellRenderer(centerRendererRow);
       tbl_HoaDon.getColumnModel().getColumn(2).setCellRenderer(centerRendererRow);
       tbl_HoaDon.getColumnModel().getColumn(3).setCellRenderer(centerRendererRow);
       tbl_HoaDon.getColumnModel().getColumn(4).setCellRenderer(centerRendererRow);
       tbl_HoaDon.getColumnModel().getColumn(5).setCellRenderer(centerRendererRow);
       tbl_HoaDon.getColumnModel().getColumn(6).setCellRenderer(centerRendererRow);
       tbl_HoaDon.getColumnModel().getColumn(7).setCellRenderer(centerRendererRow);
       tbl_HoaDon.getColumnModel().getColumn(8).setCellRenderer(centerRendererRow);
       tbl_HoaDon.getColumnModel().getColumn(9).setCellRenderer(centerRendererRow);
       
       rowSorter = new TableRowSorter<>(tbl_HoaDon.getModel());
       tbl_HoaDon.setRowSorter(rowSorter);
       tbl_HoaDon.validate();
       tbl_HoaDon.repaint();
    }
    // hàm tạo bảng 
    public void loadHoaDonList(List<DTO_HoaDon> hoadon, JTable table) {
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {        //Không được chỉnh sửa hàng và cột của bảng
                return false;
            }
            
        };
        dtm.addColumn("MÃ HĐ");
        dtm.addColumn("MÃ NV");
        dtm.addColumn("MÃ KH");
        dtm.addColumn("Ngày lập");
        dtm.addColumn("Tổng Tiền");
        dtm.addColumn("Giảm giá");
        dtm.addColumn("Tiền thanh toán");
        dtm.addColumn("Tiền khách");
        dtm.addColumn("Tiền thừa");
        dtm.addColumn("Ngày kết thúc bảo hành");
        table.setModel(dtm);
        
        List<DTO_HoaDon> arr = new ArrayList<>() ;
        //arr = empBUS.getAllEmployees();
        arr = hoadon;
        for (int i = 0; i < arr.size(); i++) {
            DTO_HoaDon em = arr.get(i);
            
            String maHd = em.getMaHD();
            String maNv = em.getMaNV();
            String maKh = em.getMaKH();
            Date ngayLap = em.getNgayLap();
            Double tongTien = em.getTongTien();
            Double giamGia = em.getGiamGia();
            Double tienThanhToan = em.getTienThanhToan();
            Double tienKhach = em.getTienKhach();
            Double tienThua = em.getTienThoi();
            Date ngayKtBh = em.getNgayKtBh();
            
            Object[] row = {maHd, maNv, maKh, ngayLap, fuc.doubleToFormattedString(tongTien), fuc.doubleToFormattedString(giamGia), 
                fuc.doubleToFormattedString(tienThanhToan), fuc.doubleToFormattedString(tienKhach), 
                fuc.doubleToFormattedString(tienThua), ngayKtBh };
            dtm.addRow(row);
        }
        changeTable(table);
        
    
    }
    
    public void eventFind(JTextField jTextField1){
        jTextField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jTextField1.getText();
                if(text.trim().length() == 0){
                    rowSorter.setRowFilter(null);
                }else{
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jTextField1.getText();
                if(text.trim().length() == 0){
                    rowSorter.setRowFilter(null);
                }else{
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        });
    }
    
    public void eventClickTable(JTable table){
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==2 && table.getSelectedRow() != -1){
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    int SRow = table.getSelectedRow();                       //Lay Index dong duoc chon
                    SRow = table.convertRowIndexToModel(SRow);     //Khi sap xep, Index dong duoc chon van dung
                    
                    DTO_HoaDon hd = new DTO_HoaDon();
                    hd.setMaHD((String) model.getValueAt(SRow,0));
                    hd.setMaNV((String) model.getValueAt(SRow,1));
                    hd.setMaKH((String) model.getValueAt(SRow,2));
                    hd.setNgayLap((Date) model.getValueAt(SRow, 3));
                    
                    String tongTien = (String)model.getValueAt(SRow, 4);
                    hd.setTongTien(Double.valueOf(fuc.traVeMacDinh(tongTien)));
                    
                    String giamGia = (String)model.getValueAt(SRow, 5);
                    hd.setGiamGia(Double.valueOf(fuc.traVeMacDinh(giamGia)));
                    
                    String tienThanhToan = (String)model.getValueAt(SRow, 6);
                    hd.setTienThanhToan(Double.valueOf(fuc.traVeMacDinh(tienThanhToan)));
                    
                    String tienKhach = (String)model.getValueAt(SRow, 7);
                    hd.setTienKhach(Double.valueOf(fuc.traVeMacDinh(tienKhach)));
                    
                    String tienThoi = (String)model.getValueAt(SRow, 8);
                    hd.setTienThoi(Double.valueOf(fuc.traVeMacDinh(tienThoi))); 
                    
                    hd.setNgayKtBh((Date) model.getValueAt(SRow, 9));
                    hd.setTrangThai(1);
                    
                    GUI_ThongTinHoaDon hdFrame = new GUI_ThongTinHoaDon(hd,QuanLyHoaDonController.this);
                    hdFrame.setTitle("Thông tin hóa đơn");
                    hdFrame.setResizable(false);
                    hdFrame.setLocationRelativeTo(null);
                    hdFrame.setVisible(true);
                    
                }
            }
            
        });
    }
}
