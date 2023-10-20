/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import BUS.*;
import DTO.*;
import GUI_QuanLy.GUI_UpdateThongTinSanPham;
import function.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class QuanLySanPhamController {
    private TableRowSorter<TableModel> rowSorter ;
    private BUS_SanPham spBus = new BUS_SanPham();
    public ArrayList<DTO_SanPham> listSp = new ArrayList<>();
    public JTable jtable ;

    public QuanLySanPhamController() {
    }
 
    public QuanLySanPhamController(ArrayList<DTO_SanPham> listSp,JTable jtb) {
        this.jtable = jtb;
        this.listSp.addAll(listSp) ;
        this.loadSanPhamList(listSp,jtb);
    }
    
    
    funcDungChung fuc = new funcDungChung();
    //FUCTION 
    // tùy chỉnh giao diện bảng 
    public void changeTable(JTable tbl_Sp){       
       tbl_Sp.setRowHeight(40);
       // Điều chỉnh font và chiều rộng của tiêu đề
       JTableHeader header = tbl_Sp.getTableHeader();
       header.setFont(new Font("Tahoma", Font.BOLD, 14));
       header.setPreferredSize(new Dimension(50, 50));
       // Căn giữa tiêu đề theo chiều dọc
       DefaultTableCellRenderer centerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
       centerRenderer.setHorizontalAlignment(JLabel.CENTER);   
  
       CenterRenderer centerRendererRow = new CenterRenderer();

        // Áp dụng renderer cho các cột cụ thể (thay thế 'columnIndex' bằng chỉ số cột của bạn)
       tbl_Sp.getColumnModel().getColumn(0).setCellRenderer(centerRendererRow);
       tbl_Sp.getColumnModel().getColumn(1).setCellRenderer(centerRendererRow);
       tbl_Sp.getColumnModel().getColumn(2).setCellRenderer(centerRendererRow);
       tbl_Sp.getColumnModel().getColumn(3).setCellRenderer(centerRendererRow);
       tbl_Sp.getColumnModel().getColumn(4).setCellRenderer(centerRendererRow);
       tbl_Sp.getColumnModel().getColumn(5).setCellRenderer(centerRendererRow);
       tbl_Sp.getColumnModel().getColumn(6).setCellRenderer(centerRendererRow);
       tbl_Sp.getColumnModel().getColumn(7).setCellRenderer(centerRendererRow);
       
       rowSorter = new TableRowSorter<>(tbl_Sp.getModel());
       tbl_Sp.setRowSorter(rowSorter);
       tbl_Sp.validate();
       tbl_Sp.repaint();
    }
    
    // hàm tạo bảng 
    public void loadSanPhamList(List<DTO_SanPham> sanPham, JTable table) {
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {        //Không được chỉnh sửa hàng và cột của bảng
                return false;
            }
            
        };
        dtm.addColumn("Mã SP");
        dtm.addColumn("Tên SP");
        dtm.addColumn("Mã Thương Hiệu");
        dtm.addColumn("Màu Sắc");
        dtm.addColumn("Dung Lượng");
        dtm.addColumn("Đơn Giá");
        dtm.addColumn("Khuyến Mãi");
        dtm.addColumn("Số Lượng Tồn Kho");
        
        table.setModel(dtm);
        
        List<DTO_SanPham> arr = new ArrayList<>() ;
        //arr = empBUS.getAllEmployees();
        arr = sanPham;
        for (int i = 0; i < arr.size(); i++) {
            DTO_SanPham sp = arr.get(i);
            
            String maSp = sp.getMaSp();
            String tenSp = sp.getTenSp();
            String maTh = sp.getMaThuongHieu();
            String mauSac = sp.getMauSac();
            String dungLuong = sp.getDungLuong();
            Double donGia = sp.getDonGia();
            Double khuyenMai = sp.getKhuyenMai();
            int soLuongTonKho = sp.getSoLuong();
            
            Object[] row = {maSp,tenSp,maTh,mauSac,dungLuong,
             fuc.doubleToFormattedString(donGia),fuc.doubleToFormattedString(khuyenMai)
            ,soLuongTonKho};
            
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
                    
                    DTO_SanPham sp = new DTO_SanPham();
                    String key = (String) model.getValueAt(SRow, 0);
                    for(DTO_SanPham spFind:spBus.timSp(key)){
                        if(spFind!=null&&spFind.getMaSp().toString().equals(key)){                         
                            sp = spFind;
                            break;
                        }
                    }
                    
                    GUI_UpdateThongTinSanPham spFrame = new GUI_UpdateThongTinSanPham(sp,QuanLySanPhamController.this);
                    spFrame.setTitle("Thông tin sản phẩm");
                    spFrame.setResizable(false);
                    spFrame.setLocationRelativeTo(null);
                    spFrame.setVisible(true);
                    
                }
            }
            
        });
    }
}
