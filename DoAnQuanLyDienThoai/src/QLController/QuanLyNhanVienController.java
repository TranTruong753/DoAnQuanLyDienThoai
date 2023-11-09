/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import BUS.BUS_NhanVien;
import DTO.DTO_NhanVien;
import GUI_QuanLy.GUI_QuanLyNhanVien;
import GUI_QuanLy.GUI_ThemThongTinNhanVien;
import GUI_QuanLy.GUI_ThongTinNhanVien;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import function.CenterRenderer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
public class QuanLyNhanVienController {
    JTable table;
    GUI_QuanLyNhanVien ql;
    private JPanel jpnView;
    private JButton btnThem,btnXuat;
    private JTextField jtfTim;
    private BUS_NhanVien nvbus=new BUS_NhanVien();
    private String[] listColumn = {"Mã nhân viên","Tên nhân viên", "Số điện thoại","Địa chỉ","Giới tính","Ngày sinh"};
    private TableRowSorter<TableModel> rowSorter = null;

    public QuanLyNhanVienController(JPanel jpnView, JButton btnThem, JTextField jtfTim,JButton btnXuat,GUI_QuanLyNhanVien ql){
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
        List<DTO.DTO_NhanVien> listItem = nvbus.getList();
        
        DefaultTableModel model = new TableNhanVien().setTableKH(listItem, listColumn);
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
        table.getColumnModel().getColumn(5).setCellRenderer(centerRendererRow);
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==2 && table.getSelectedRow() != -1){
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    int SRow = table.getSelectedRow();                       //Lay Index dong duoc chon
                    SRow = table.convertRowIndexToModel(SRow);     //Khi sap xep, Index dong duoc chon van dung                   
                    DTO_NhanVien NhanVien = new DTO_NhanVien();
                    NhanVien.setMANV((String) model.getValueAt(SRow, 0));
                    NhanVien.setTENNV(model.getValueAt(SRow,1).toString());
                    NhanVien.setSDT(model.getValueAt(SRow, 2) != null ? model.getValueAt(SRow, 2).toString() : "");
                    NhanVien.setDIACHI(model.getValueAt(SRow, 3).toString());
                    NhanVien.setGIOITINH(model.getValueAt(SRow, 4).toString());
                    NhanVien.setNGAYSINH((java.util.Date) model.getValueAt(SRow, 5));
                    //NhanVien.setTrangThai((int) model.getValueAt(SRow, 6));
                    
                    GUI_ThongTinNhanVien KHframe = new GUI_ThongTinNhanVien(NhanVien,QuanLyNhanVienController.this);
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
    public void setEvent(){
        btnThem.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                GUI_ThemThongTinNhanVien frame =new GUI_ThemThongTinNhanVien(QuanLyNhanVienController.this);
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
