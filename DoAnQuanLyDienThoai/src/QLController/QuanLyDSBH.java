/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import BUS.BUS_SanPham;
import DTO.DTO_SanPham;
import DTO.DTO_TaiKhoan;
import GUI_QuanLy.GUI_ContainerPhone;
import GUI_QuanLy.GUI_QuanLySanPham;
import GUI_QuanLy.GUI_ThongTinMuaSanPham;
import GUI_QuanLy.GUI_ThongTinTaiKhoan;
import GUI_QuanLy.GUI_TrangChuBanHang;
import GUI_QuanLy.GUI_UpdateThongTinSanPham;
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
public class QuanLyDSBH {
    JTable table;
GUI_QuanLySanPham ql;
private JPanel jpnView;
private JButton btnThem,btnXuat;
public JTextField jtfTim;
private BUS_SanPham spbus = new BUS_SanPham();
private String[] listColumn = 
{"Mã sp","Tên sp","Đơn giá ","Số lượng"};
private TableRowSorter<TableModel> rowSorter = null;
public GUI_TrangChuBanHang panelBanHang;

public ArrayList<GUI_ContainerPhone> containers = new ArrayList<>();
public JPanel jPanelSPs  ;
public ArrayList<DTO_SanPham> listSp = new ArrayList<>();
List<DTO_SanPham> listItem= new ArrayList<>();


public QuanLyDSBH(JPanel jpnView,GUI_TrangChuBanHang panelBanHang ){
    this.jpnView = jpnView;
    this.btnThem = btnThem;
    this.jtfTim = jtfTim;
    this.btnXuat=btnXuat;
    this.ql=ql;
    this.panelBanHang = panelBanHang;
}





public void setDateToTable(DTO_SanPham sp,int sl){
    if(sp!=null)
    listItem.add(sp);

    DefaultTableModel model = new TableDSBH().setTableSp(listItem, listColumn,sl);
    table = new JTable(model);

    rowSorter = new TableRowSorter<>(table.getModel());
    table.setRowSorter(rowSorter);

    
    //chỉnh bảng
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
}
