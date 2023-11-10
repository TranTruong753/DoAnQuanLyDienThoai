/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import BUS.BUS_SanPham;
import DTO.DTO_NhanVien;
import DTO.DTO_SanPham;
import DTO.DTO_TaiKhoan;
import GUI_QuanLy.GUI_ContainerPhone;
import GUI_QuanLy.GUI_QuanLySanPham;
import GUI_QuanLy.GUI_ThemThongTinNhanVien;
import GUI_QuanLy.GUI_ThongTinMuaSanPham;
import GUI_QuanLy.GUI_ThongTinNhanVien;
import GUI_QuanLy.GUI_ThongTinTaiKhoan;
import GUI_QuanLy.GUI_TrangChuBanHang;
import GUI_QuanLy.GUI_UpdateThongTinSanPham;
import function.CenterRenderer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
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
public class QuanLyDSBH {
    JTable table;
GUI_QuanLySanPham ql;
private JPanel jpnView;
private JButton btnThem,btnXoa;
public JTextField jtfTim;
private BUS_SanPham spbus = new BUS_SanPham();
private String[] listColumn = 
{"Mã sp","Tên sp","Đơn giá ","Số lượng"};
private TableRowSorter<TableModel> rowSorter = null;
public GUI_TrangChuBanHang panelBanHang;
GUI_ThongTinMuaSanPham ttsp;
public ArrayList<GUI_ContainerPhone> containers = new ArrayList<>();
public JPanel jPanelSPs  ;
public ArrayList<DTO_SanPham> listSp = new ArrayList<>();
List<DTO_SanPham> listItem= new ArrayList<>();
public ArrayList<String> listsl = new ArrayList<>();
public ArrayList<String> listtg = new ArrayList<>();
public ArrayList<String> listslbd = new ArrayList<>();
DTO_SanPham sp = null;//luu sp da chon de xoa


public QuanLyDSBH(JPanel jpnView,GUI_TrangChuBanHang panelBanHang,JButton btnXoa,ArrayList<GUI_ContainerPhone> containers,JPanel jPanelSPs ){
    this.jpnView = jpnView;
    this.btnThem = btnThem;
    this.jtfTim = jtfTim;
    this.btnXoa=btnXoa;
    this.ql=ql;
    this.panelBanHang = panelBanHang;
    this.containers=containers;
    this.jPanelSPs=jPanelSPs;
    
}

    public void setSp(DTO_SanPham sp) {
        this.sp = sp;
    }

    public JTable getTable() {
        return table;
    }

    public List<DTO_SanPham> getListItem() {
        return listItem;
    }

    public ArrayList<String> getListsl() {
        return listsl;
    }

    public ArrayList<String> getListtg() {
        return listtg;
    }

    public ArrayList<String> getListslbd() {
        return listslbd;
    }

    public void setListItem(List<DTO_SanPham> listItem) {
        this.listItem = listItem;
    }

    public void setListsl(ArrayList<String> listsl) {
        this.listsl = listsl;
    }

    public void setListtg(ArrayList<String> listtg) {
        this.listtg = listtg;
    }

    public void setListslbd(ArrayList<String> listslbd) {
        this.listslbd = listslbd;
    }
    





public void setDateToTable(DTO_SanPham sp,int sl,double tg){
    this.ttsp=ttsp;
    int dem=0;
    if(sp!=null)
    {   
        for(int i=0;i<listItem.size();i++)
            if(listItem.get(i).getMaSp().equals(sp.getMaSp())){//khi cap nhap lai sl cua 1 sp 
                if(sl>Integer.parseInt(listsl.get(i)))//kiem tra xem sl cap nhap nay > hay < sl trc do de ap dung ham
                {panelBanHang.setTinhTien(tg,sp.getDonGia(),abs(sl-Integer.parseInt(listsl.get(i))));//cap nhap lai tien khi tang sl 1 sp
                 int SL=Integer.parseInt(listslbd.get(i));
                 listItem.get(i).setSoLuong(SL-sl);
                 
                
                
                
                }

                else
                {panelBanHang.setUpdate(tg,sp.getDonGia(),abs(sl-Integer.parseInt(listsl.get(i))));//cap nhap lai tien khi giam sl 1 sp
                 int SL=Integer.parseInt(listslbd.get(i));
                 listItem.get(i).setSoLuong(SL-sl);
                
                
                }
                listsl.remove(i);
                listsl.add(i,""+sl);//cap nhap lai sl cua list
                panelBanHang.load();
                
                dem=1;
                break;
            }
    
    if(dem==0)           
    {listslbd.add(""+sp.getSoLuong());
    sp.setSoLuong(sp.getSoLuong()-sl);
    listItem.add(sp);
    listsl.add(""+sl);//cai list nay de luu so luong sp khi mua
    listtg.add(""+tg);//cai list nay de luu giam gia cua sp khi mua
    
    
    
    panelBanHang.load();
    panelBanHang.setTinhTien(tg, sp.getDonGia(),sl);}
    }
    DefaultTableModel model = new TableDSBH().setTableSp(listItem, listColumn,listsl);
    table = new JTable(model);

    rowSorter = new TableRowSorter<>(table.getModel());
    table.setRowSorter(rowSorter);
    

    
    //chỉnh bảng
//        table.getColumnModel().getColumn(0).setMaxWidth(120);
//        table.getColumnModel().getColumn(0).setMinWidth(120);
//        table.getColumnModel().getColumn(0).setPreferredWidth(120);
//        table.getTableHeader().setFont(new Font("Arial",Font.BOLD,14));
//        table.getTableHeader().setPreferredSize(new Dimension(50,50));
//        table.setRowHeight(50);
        table.setRowHeight(40);
        table.setFont(new Font("Tahoma",Font.PLAIN,14));
        CenterRenderer centerRendererRow = new CenterRenderer();

        // Áp dụng renderer cho các cột cụ thể (thay thế 'columnIndex' bằng chỉ số cột của bạn)
        table.getColumnModel().getColumn(0).setCellRenderer(centerRendererRow);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRendererRow);
        table.getColumnModel().getColumn(2).setCellRenderer(centerRendererRow);
        table.getColumnModel().getColumn(3).setCellRenderer(centerRendererRow);
         //chỉnh tiêu đề
       JTableHeader header = table.getTableHeader();
       header.setFont(new Font("Tahoma", Font.BOLD, 14));
       header.setPreferredSize(new Dimension(50, 50));
       // Căn giữa tiêu đề theo chiều dọc
       DefaultTableCellRenderer centerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
       centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.validate();
        table.repaint();
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==1 && table.getSelectedRow() != -1){
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    int SRow = table.getSelectedRow();                       //Lay Index dong duoc chon
                    SRow = table.convertRowIndexToModel(SRow);     //Khi sap xep, Index dong duoc chon van dung
                    
                 DTO_SanPham sp = new DTO_SanPham();   
                String key = (String) model.getValueAt(SRow, 0);
                for(DTO_SanPham spFind:spbus.timSp(key)){//tim vi tri sp can xoa
                    if(spFind!=null&&spFind.getMaSp().toString().equals(key)){                         
                        sp = spFind;
                        break;
                    }
                }
                    setSp(sp);//gan gia tri cho this.sp
                    
                }
            }
            
        });
//        table.getTableHeader().setFont(new Font("Arial",Font.BOLD,14));
//        table.getTableHeader().setPreferredSize(new Dimension(50,50));
//        table.setRowHeight(50);
//        table.validate();
//        table.repaint();
        
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
        btnXoa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(sp==null)
                    panelBanHang.showthongbao();
                else{
                for(int i=0;i<listItem.size();i++)
                    if(listItem.get(i).getMaSp().equals(sp.getMaSp()))//tim sp can xoa trong listItem
                    {   panelBanHang.setUpdate(Double.parseDouble(listtg.get(i)), 
                            sp.getDonGia(), Integer.parseInt(listsl.get(i)));// xoa tien cua sp dc chon de xoa voi sl dc luu trong listsl,
                        listItem.get(i).setSoLuong(sp.getSoLuong());
                        panelBanHang.load();                                                                          // giam gia dc luu trong listtg
                        listItem.remove(i);//cap nhap lai cac list
                        listsl.remove(i);
                        listtg.remove(i);
                        
                        setDateToTable(null, 0, 0);//cap nhap lai bang
                        sp=null;
                        break;
                    }}
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnXoa.setBackground(new Color(255,143,246));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnXoa.setBackground(new Color(255,204,255));
            }
            
        });
        
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
