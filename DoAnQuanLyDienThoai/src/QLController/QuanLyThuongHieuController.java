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
public class QuanLyThuongHieuController {
    JTable table;
 //   GUI_QuanLyNCC ql;
    private JPanel jpnView;
    private JTextField jtfTim;
    private BUS_ThuongHieu thbus=new BUS_ThuongHieu();
    private DTO_ThuongHieu thDto = new DTO_ThuongHieu();
    private String[] listColumn = {"Mã Thương Hiệu","Tên Thương hiệu"};
    private TableRowSorter<TableModel> rowSorter = null;
   // private JTextField jtfMaTh,jtfTenTh ;

    public QuanLyThuongHieuController( JPanel jpnView, JTextField jtfTim) {
        this.table = table;
        this.jpnView = jpnView;
        this.jtfTim = jtfTim;
       
        this.setDateToTable();
    }
    
    
    
    
    public void setDateToTable(){
        List<DTO_ThuongHieu> listItem = thbus.getList();
        
        DefaultTableModel model = new TableThuongHieu().setTableTh(listItem, listColumn);
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
         table.getColumnModel().getColumn(0).setMaxWidth(100);
        table.getColumnModel().getColumn(0).setMinWidth(100);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRendererRow);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==2 && table.getSelectedRow() != -1){
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    int SRow = table.getSelectedRow();                       //Lay Index dong duoc chon
                    SRow = table.convertRowIndexToModel(SRow);     //Khi sap xep, Index dong duoc chon van dung


                    thDto.setMATH(model.getValueAt(SRow, 0).toString());
                    thDto.setTENTH(model.getValueAt(SRow, 1).toString()); 
               


                }
            }

        });
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
        scrollPane.setPreferredSize(new Dimension(jpnView.getWidth(),jpnView.getHeight()));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scrollPane);
        jpnView.validate();
        jpnView.repaint();
    }
    
}
