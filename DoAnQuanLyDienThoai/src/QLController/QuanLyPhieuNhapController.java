/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import BUS.BUS_PhieuNhap;
import DTO.DTO_PhieuNhap;
import GUI_QuanLy.GUI_QuanLyNCC;

import GUI_QuanLy.GUI_ThongTinPhieuNhap;
import function.CenterRenderer;
import function.funcDungChung;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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
public class QuanLyPhieuNhapController {
    JTable table;
    GUI_QuanLyNCC ql;
    private JPanel jpnView;
    private JButton btnThem,btnXuat;
    private JTextField jtfTim;
    private BUS_PhieuNhap nvbus=new BUS_PhieuNhap();
    private String[] listColumn = {"Mã HDNH","Mã NCC", "Tên NCC","Ngày giao","Tổng tiền"};
    private TableRowSorter<TableModel> rowSorter = null;
    private funcDungChung fuc = new funcDungChung();
    public QuanLyPhieuNhapController(JPanel jpnView, JButton btnThem, JTextField jtfTim, GUI_QuanLyNCC ql){
        this.jpnView = jpnView;
        this.btnThem = btnThem;
        this.jtfTim = jtfTim;
        this.ql=ql;
    }
    public java.sql.Date cover(java.util.Date d){
        return new java.sql.Date(d.getTime());
    }
    public void setDateToTable(){
        List<DTO.DTO_PhieuNhap> listItem = nvbus.getList();
        
        DefaultTableModel model = new TablePhieuPhap().setTableKH(listItem, listColumn);
        table = new JTable(model);
        
        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);
        
        jtfTim.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfTim.getText();
                if(text.trim().length() == 0){
                    rowSorter.setRowFilter(null);
                }else{
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfTim.getText();
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
        //chỉnh bảng
        table.setRowHeight(40);
        table.setFont(new Font("Tahoma",Font.PLAIN,14));
        CenterRenderer centerRendererRow = new CenterRenderer();

        // Áp dụng renderer cho các cột cụ thể (thay thế 'columnIndex' bằng chỉ số cột của bạn)
        table.getColumnModel().getColumn(0).setCellRenderer(centerRendererRow);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRendererRow);
        table.getColumnModel().getColumn(2).setCellRenderer(centerRendererRow);
        table.getColumnModel().getColumn(3).setCellRenderer(centerRendererRow);
        table.getColumnModel().getColumn(4).setCellRenderer(centerRendererRow);    
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==2 && table.getSelectedRow() != -1){
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    int SRow = table.getSelectedRow();                       //Lay Index dong duoc chon
                    SRow = table.convertRowIndexToModel(SRow);     //Khi sap xep, Index dong duoc chon van dung
                    
                    DTO_PhieuNhap PhieuNhap = new DTO_PhieuNhap();
                    PhieuNhap.setMAHDNH((String) model.getValueAt(SRow, 0));
                    PhieuNhap.setMANCC(model.getValueAt(SRow,1).toString());
                    PhieuNhap.setTENNCC(model.getValueAt(SRow, 2) != null ? model.getValueAt(SRow, 2).toString() : "");
                    PhieuNhap.setNGAYGIAO((Date) model.getValueAt(SRow, 3));
                    String tongTien = fuc.traVeMacDinh(model.getValueAt(SRow, 4).toString());
                    PhieuNhap.setTONGTIEN(Double.valueOf(tongTien));
                 //   PhieuNhap.setTONGTIEN((double) model.getValueAt(SRow, 4));
                    PhieuNhap.setTRANGTHAI(1);
                    //PhieuNhap.setTrangThai((int) model.getValueAt(SRow, 6));
                    
                    GUI_ThongTinPhieuNhap KHframe = new GUI_ThongTinPhieuNhap(PhieuNhap,QuanLyPhieuNhapController.this);
                    KHframe.setTitle("Thông tin khách hàng");
                    KHframe.setResizable(false);
                    KHframe.setLocationRelativeTo(null);
                    KHframe.setVisible(true);
                }
            }
            
        });
        //chỉnh tiêu đề
       JTableHeader header = table.getTableHeader();
       header.setFont(new Font("Tahoma", Font.BOLD, 14));
       header.setPreferredSize(new Dimension(50, 50));
       // Căn giữa tiêu đề theo chiều dọc
       DefaultTableCellRenderer centerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
       centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.validate();
        table.repaint();
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add(table);
        scrollPane.setPreferredSize(new Dimension(800,400));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scrollPane);
        jpnView.validate();
        jpnView.repaint();
        }
    
    
}
