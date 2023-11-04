/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;


import BUS.BUS_CTPN;
import BUS.BUS_SanPham;
import DTO.DTO_CTPN;
import DTO.DTO_PhieuNhap;
import DTO.DTO_SanPham;

import GUI_QuanLy.GUI_QuanLyNCC;
import function.funcDungChung;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class QuanLyCTHDNHController {
    JTable table;
    GUI_QuanLyNCC ql;
    private JPanel jpnView;
    private JComboBox<String> jcbNcc;
    private JButton btnThem,btnXuat;
    private JButton btnSua, btnXoa ;
    private JTextField jtfTim, jtfMaSp,jtfTenSp,jtfSoLuong,jtfGiaNhap;
    private BUS_CTPN ctnpbus=new BUS_CTPN();
    private BUS_SanPham spbus = new BUS_SanPham();
    private String[] listColumn = {"Mã PNH","Mã SP", "Tên SP","Số lượng","Đơn Giá","Thành tiền"};
    private TableRowSorter<TableModel> rowSorter = null;
    private funcDungChung fun = new funcDungChung();
    String MAHDNH;
//    private ArrayList<DTO_CTPN> listCtPn ;
    
    public QuanLyCTHDNHController(JPanel jpnView, JTextField jtfMaSp, 
    JTextField jtfTenSp,JTextField jtfSoLuong, JTextField jtfGiaNhap, JButton btnThem,JButton btnSua, JButton btnXoa,JComboBox<String> jcbNcc 
     ){
        this.jpnView = jpnView; 
        this.btnThem = btnThem;
        this.btnSua = btnSua;
        this.btnXoa = btnXoa;
        this.jtfMaSp = jtfMaSp;
        this.jtfTenSp = jtfTenSp;
        this.jtfSoLuong = jtfSoLuong;
        this.jtfGiaNhap = jtfGiaNhap;
        this.jcbNcc = jcbNcc;


    }
    
    public QuanLyCTHDNHController(JPanel jpnView,String MAHDNH){
        this.jpnView = jpnView;
//        this.btnThem = btnThem;
//        this.jtfTim = jtfTim;
//        this.btnXuat=btnXuat;
        this.ql=ql;
        this.MAHDNH=MAHDNH;
    }
    public java.sql.Date cover(java.util.Date d){
        return new java.sql.Date(d.getTime());
    }
    public void setDateToTable(){
        List<DTO.DTO_CTPN> listItem = ctnpbus.getList();
        
        DefaultTableModel model = new TableCTHDNH().setTableKH(listItem, listColumn,MAHDNH);
        table = new JTable(model);
        
        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);
        
        
        table.setFont(new Font("Tahoma",Font.PLAIN,14));
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
        scrollPane.setPreferredSize(new Dimension(666,322));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scrollPane);
        jpnView.validate();
        jpnView.repaint();
        }
    
    public void setDateToTablePN(List<DTO.DTO_CTPN> listItem){
        
        
        DefaultTableModel model = new TableCTHDNH().setTablePN(listItem, listColumn);
        table = new JTable(model);
        
        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);
        
        
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

                DTO_CTPN dsCtpn = new DTO_CTPN();
                String key = (String) model.getValueAt(SRow, 1);
                for(DTO_CTPN ctnp:listItem){
                    if(ctnp!=null&&ctnp.getMASP().toString().equals(key)){                         
                        dsCtpn = ctnp;
                        break;
                    }
                }
                btnThem.setEnabled(false);
                jcbNcc.setEnabled(false);
                btnXoa.setEnabled(true);
                btnSua.setEnabled(true);
                jtfMaSp.setEnabled(false);
                jtfTenSp.setEnabled(false);
                jtfSoLuong.setEnabled(true);
                jtfGiaNhap.setEnabled(true);
                jtfMaSp.setText(dsCtpn.getMASP());
                jtfTenSp.setText(dsCtpn.getTENSP());
                jtfSoLuong.setText(dsCtpn.getSL()+"");
                String giaNhap = fun.traVeMacDinh((String) model.getValueAt(SRow, 4));
//                DecimalFormat decimalFormat = new DecimalFormat("#");
//                String formattedSo = decimalFormat.format(Long.parseLong(giaNhap));
                jtfGiaNhap.setText(giaNhap);
               // timNccCbb():



            }
        }

    });
    table.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                table.clearSelection();
            }
        });
        
        table.getTableHeader().setFont(new Font("Arial",Font.BOLD,14));
        table.getTableHeader().setPreferredSize(new Dimension(50,50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add(table);
        scrollPane.setPreferredSize(new Dimension(666,322));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scrollPane);
        jpnView.validate();
        jpnView.repaint();
    }
    
     public void timNccCbb(String ncc, JComboBox<String> jcb) {
    int index = -1;

        for (int i = 0; i < jcb.getItemCount(); i++) {
            String mauComboBox = jcb.getItemAt(i).toString();
            if (mauComboBox.equals(ncc)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            jcb.setSelectedIndex(index);
            jcb.setSelectedItem(jcb.getItemAt(index)); // Hiển thị mục đã chọn
        }
    }
    
}
