/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import BUS.*;
import DTO.*;
import GUI_QuanLy.*;
import function.CenterRenderer;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
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
public class QuanLySanPhamControllerfix {
    
JTable table;
GUI_QuanLySanPham ql;
private JPanel jpnView;
private JButton btnThem,btnXuat;
public JTextField jtfTim;
private BUS_SanPham spbus = new BUS_SanPham();
private String[] listColumn = 
{"Mã sản phẩm","Tên sản phẩm", "Mã thương hiệu","Màu sắc","Dung lượng","Đơn giá","Khuyến mãi","Số lượng tồn",};
private TableRowSorter<TableModel> rowSorter = null;
public GUI_TrangChuBanHang panelBanHang;

public ArrayList<GUI_ContainerPhone> containers = new ArrayList<>();
public JPanel jPanelSPs  ;
public ArrayList<DTO_SanPham> listSp = new ArrayList<>();


public QuanLySanPhamControllerfix(JPanel jpnView, JButton btnThem, JTextField jtfTim,JButton btnXuat,GUI_QuanLySanPham ql,GUI_TrangChuBanHang panelBanHang ){
    this.jpnView = jpnView;
    this.btnThem = btnThem;
    this.jtfTim = jtfTim;
    this.btnXuat=btnXuat;
    this.ql=ql;
    this.panelBanHang = panelBanHang;
}

public QuanLySanPhamControllerfix(ArrayList<DTO_SanPham> listSp,ArrayList<GUI_ContainerPhone> containers, JPanel jPanelSPs,GUI_TrangChuBanHang panelBanHang) {
        this.listSp.clear();
        this.listSp.addAll(listSp);
        this.jPanelSPs = new JPanel(); 
        this.jPanelSPs = jPanelSPs;
        this.containers.clear();
        this.containers.addAll(containers);
        this.showSp(listSp, containers, jPanelSPs);
        this.panelBanHang=panelBanHang;
       
    }

public void showSp(List<DTO_SanPham> listsp, ArrayList<GUI_ContainerPhone> containers, JPanel jPanelSPs){           
    jPanelSPs.removeAll();     
    jPanelSPs.revalidate(); // Cập nhật giao diện người dùng
    jPanelSPs.repaint(); // Vẽ lại JPanel       
    containers.clear();
//    int soLuong = listsp.size()/3 + 1;
//    int height = (int)soLuong * 317;
    int soLuongSp = listsp.size() ;
    int size = 0;
    if(soLuongSp%3==0){
        size = soLuongSp/3;
    }
    else{
        size = soLuongSp/3 + 1;
    }
    int height = (int)size * 317;
    for(int i = 0;i<listsp.size();i++){           
        GUI_ContainerPhone container = new GUI_ContainerPhone(listsp.get(i));
        containers.add(container);       
    }
    Dimension preferredSize = new Dimension(850, height); 
    jPanelSPs.setPreferredSize(preferredSize);
    for(GUI_ContainerPhone ctn:containers){
        jPanelSPs.add(ctn);
    }

}

public void setDateToTable(){
    List<DTO_SanPham> listItem = spbus.getList();

    DefaultTableModel model = new TableSanPham().setTableSp(listItem, listColumn);
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
    table.getColumnModel().getColumn(6).setCellRenderer(centerRendererRow);
    table.getColumnModel().getColumn(7).setCellRenderer(centerRendererRow);
    table.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getClickCount()==2 && table.getSelectedRow() != -1){
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                int SRow = table.getSelectedRow();                       //Lay Index dong duoc chon
                SRow = table.convertRowIndexToModel(SRow);     //Khi sap xep, Index dong duoc chon van dung

                DTO_SanPham sp = new DTO_SanPham();
                String key = (String) model.getValueAt(SRow, 0);
                for(DTO_SanPham spFind:spbus.timSp(key)){
                    if(spFind!=null&&spFind.getMaSp().toString().equals(key)){                         
                        sp = spFind;
                        break;
                    }
                }

                GUI_UpdateThongTinSanPham spFrame = new GUI_UpdateThongTinSanPham(sp,QuanLySanPhamControllerfix.this,panelBanHang);
                spFrame.setTitle("Thông tin sản phẩm");
                spFrame.setResizable(false);
                spFrame.setLocationRelativeTo(null);
                spFrame.setVisible(true);

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
