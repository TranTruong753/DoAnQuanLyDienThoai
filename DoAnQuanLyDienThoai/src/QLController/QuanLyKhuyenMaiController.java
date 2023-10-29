/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import BUS.BUS_KhuyenMai;
import DTO.DTO_KhuyenMai;
import GUI_QuanLy.GUI_QuanLyKhuyenMai;

import GUI_QuanLy.GUI_ThongTinKhuyenMai;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
public class QuanLyKhuyenMaiController {
    JTable table;
    GUI_QuanLyKhuyenMai ql;
    private JPanel jpnView;
    private JButton btnThem,btnXuat;
    private JTextField jtfTim;
    private BUS_KhuyenMai nvbus=new BUS_KhuyenMai();
    private String[] listColumn = {"Mã KM","Mã SP", "Tên SP","Tên KM","Phần trăm KM","Ngày BĐ","Ngày KT"};
    private TableRowSorter<TableModel> rowSorter = null;

    public QuanLyKhuyenMaiController(JPanel jpnView, JButton btnThem, JTextField jtfTim,GUI_QuanLyKhuyenMai ql){
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
        List<DTO.DTO_KhuyenMai> listItem = nvbus.getList();
        
        DefaultTableModel model = new TableKhuyenMai().setTableKH(listItem, listColumn);
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
        
        table.getColumnModel().getColumn(0).setMaxWidth(120);
        table.getColumnModel().getColumn(0).setMinWidth(120);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        
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
    public void setEvent(){
        btnThem.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                GUI_ThongTinKhuyenMai frame =new GUI_ThongTinKhuyenMai(QuanLyKhuyenMaiController.this);
                frame.setTitle("Thông tin nhân viên thêm");
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnThem.setBackground(new Color(255,143,246));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnThem.setBackground(new Color(255,204,255));
            }
            
        });
    }
}
