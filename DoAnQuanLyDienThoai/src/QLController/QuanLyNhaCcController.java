/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import BUS.BUS_NhaCc;
import BUS.BUS_NhanVien;
import DTO.DTO_NhaCc;
import DTO.DTO_NhanVien;
import GUI_QuanLy.GUI_QuanLyNCC;
import GUI_QuanLy.GUI_QuanLyNhanVien;
import GUI_QuanLy.GUI_ThemThongTinNcc;
import GUI_QuanLy.GUI_ThemThongTinNhanVien;
import GUI_QuanLy.GUI_ThongTinNcc;
import GUI_QuanLy.GUI_ThongTinNhanVien;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
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
public class QuanLyNhaCcController {
    JTable table;
    GUI_QuanLyNCC ql;
    private JPanel jpnView;
    private JButton btnThem,btnXuat;
    private JTextField jtfTim;
    private BUS_NhaCc nccbus=new BUS_NhaCc();
    private String[] listColumn = {"Mã NCC","Tên NCC", "Số điện thoại","Địa chỉ"};
    private TableRowSorter<TableModel> rowSorter = null;

    public QuanLyNhaCcController(JPanel jpnView, JButton btnThem, JTextField jtfTim,JButton btnXuat,GUI_QuanLyNCC ql){
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
        List<DTO_NhaCc> listItem = nccbus.getList();
        
        DefaultTableModel model = new TableNhaCC().setTableKH(listItem, listColumn);
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
                    
                    DTO_NhaCc NhanVien = new DTO_NhaCc();
                    NhanVien.setMANCC((String) model.getValueAt(SRow, 0));
                    NhanVien.setTENNCC(model.getValueAt(SRow,1).toString());
                    NhanVien.setSDTNCC(model.getValueAt(SRow, 2).toString());
                    NhanVien.setDIACHI(model.getValueAt(SRow, 3).toString());
                    
                    //NhanVien.setTrangThai((int) model.getValueAt(SRow, 6));
                    
                    GUI_ThongTinNcc KHframe = new GUI_ThongTinNcc(NhanVien,QuanLyNhaCcController.this);
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
    public void setEvent(){
        btnThem.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                GUI_ThemThongTinNcc frame =new GUI_ThemThongTinNcc(QuanLyNhaCcController.this);
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
       btnXuat.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 String path="";
             JFileChooser j=new JFileChooser();
             j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
             int x=j.showSaveDialog(table);
             if(x==JFileChooser.APPROVE_OPTION)
             {
                 path=j.getSelectedFile().getPath();
                 
             }
             
             Document doc=new Document(PageSize.A4, 20, 20, 20, 20);
             try {
                 PdfWriter.getInstance(doc, new FileOutputStream(path+"\\"+"DSNhanVien.pdf"));
                 
                 doc.open();
                 
 
                // Tạo đối tượng Font cho chữ in đậm
                com.lowagie.text.Font boldFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 24);
  
                com.lowagie.text.Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12);
                // Tạo đối tượng Paragraph với văn bản "HOA DON MUA HANG" và định dạng chữ in đậm
                Paragraph centerText = new Paragraph("Danh Sách Nhân Viên", boldFont);
                centerText.setAlignment(Element.ALIGN_CENTER);

                // Thêm đối tượng Paragraph vào tài liệu
                 
                 SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                 float[] columnWidths = {1.5f, 2.5f, 1.5f, 1.5f, 1.5f};
                 PdfPTable b1 = new PdfPTable(columnWidths);
                 
                
                 //PdfPTable b1=new PdfPTable(5);
                 b1.addCell("MANCC");
                  b1.addCell("TENNCC");
                   b1.addCell("SDT");
                    b1.addCell("DIACHI");
                     
                     
                 for (int i = 0; i < table.getRowCount(); i++) {
                     String MANCC=table.getValueAt(i, 0).toString();
                     String TENNCC=table.getValueAt(i, 1).toString();
                     String SDT= table.getValueAt(i, 2).toString();
                     String DIACHI=table.getValueAt(i, 3).toString();
                     
                     
                     b1.addCell(MANCC);
                     b1.addCell(TENNCC);
                     b1.addCell(SDT);
                     b1.addCell(DIACHI);
                     
                     
            
                 }
                 doc.add(b1);
                 
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(QuanLyNhanVienController.class.getName()).log(Level.SEVERE, null, ex);
                 JOptionPane.showMessageDialog(null, "Xuất thất bại", "Thông báo", JOptionPane.WARNING_MESSAGE);
             } catch (DocumentException ex) {
                 Logger.getLogger(QuanLyNhanVienController.class.getName()).log(Level.SEVERE, null, ex);
                 JOptionPane.showMessageDialog(null, "Xuất thất bại", "Thông báo", JOptionPane.WARNING_MESSAGE);
             }  catch (IOException ex) {
                    Logger.getLogger(QuanLyNhanVienController.class.getName()).log(Level.SEVERE, null, ex);
                }
           doc.close();
             

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
