/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import BUS.BUS_PhieuNhap;
import DTO.DTO_PhieuNhap;
import GUI_QuanLy.GUI_QuanLyNCC;

import GUI_QuanLy.GUI_ThongTinPhieuNhap;
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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class QuanLiPhieuNhapController {
    JTable table;
    GUI_QuanLyNCC ql;
    private JPanel jpnView;
    private JButton btnThem,btnXuat;
    private JTextField jtfTim;
    private BUS_PhieuNhap nvbus=new BUS_PhieuNhap();
    private String[] listColumn = {"Mã HDNH","Mã NCC", "Tên NCC","Ngày giao","Tổng tiền"};
    private TableRowSorter<TableModel> rowSorter = null;
    private funcDungChung fuc = new funcDungChung();
    public QuanLiPhieuNhapController(JPanel jpnView, JButton btnThem, JTextField jtfTim,JButton btnXuat,GUI_QuanLyNCC ql){
        this.jpnView = jpnView;
        this.btnThem = btnThem;
        this.jtfTim = jtfTim;
        this.btnXuat=btnXuat;
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
        table.setFont(new Font("Tahoma",Font.PLAIN,14));
        table.getColumnModel().getColumn(0).setMaxWidth(120);
        table.getColumnModel().getColumn(0).setMinWidth(120);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
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
                    
                    GUI_ThongTinPhieuNhap KHframe = new GUI_ThongTinPhieuNhap(PhieuNhap,QuanLiPhieuNhapController.this);
                    KHframe.setTitle("Thông tin khách hàng");
                    KHframe.setResizable(false);
                    KHframe.setLocationRelativeTo(null);
                    KHframe.setVisible(true);
                }
            }
            
        });
        table.getTableHeader().setFont(new Font("Arial",Font.BOLD,14));
        table.getTableHeader().setPreferredSize(new Dimension(50,50));
        table.setRowHeight(50);
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
