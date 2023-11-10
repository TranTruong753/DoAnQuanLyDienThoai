/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI_QuanLy;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import BUS.*;
import DTO.DTO_NhanVien;
import DTO.DTO_TaiKhoan;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class GUI_GiaoDienChinh extends javax.swing.JFrame {

    // lưu chữa biến GUI
    private GUI_TrangChuBanHang panelBanHang  = new GUI_TrangChuBanHang(this);
    private GUI_QuanLyNVvaTK panelNVvaTK = new GUI_QuanLyNVvaTK();
    private GUI_QuanLySPvaKM panelSPvaKM = new GUI_QuanLySPvaKM(panelBanHang);
    private GUI_QuanLyHoaDon panelHoaDon = new GUI_QuanLyHoaDon();
    private GUI_QuanLyKHvaBH panelKHvaBH = new GUI_QuanLyKHvaBH();
    private GUI_QuanLyNCC panelNCC = new GUI_QuanLyNCC(this);
    private GUI_QuanLyThongKe panelThongKe;
    private GUI_QuanLyThongTinDangNhap panelThongTinDangNhap;
    
    private BUS_TaiKhoan tkbus = new BUS_TaiKhoan(); 
    private DTO_TaiKhoan tkDto ;
    private DTO_NhanVien nvDto ;
    // biến màu          
    public Color ColorMain,ColorClick,sidebar ;
    
    // biến sự kiện
    public boolean clickOnOffMenu1 = false ;
    public boolean clickOnOffMenu2 = false ;
    public boolean clickOnOffMenu3 = false ;
    public boolean clickOnOffMenu4 = false ;
    public boolean clickOnOffMenu5 = false ;
    public boolean clickOnOffMenu6 = false ;
    public boolean clickOnOffMenu7 = false ;
    public boolean clickOnOffMenu8 = false ;
    /**
     * Creates new form GUI_GiaoDienChinh
     */
    public GUI_GiaoDienChinh(DTO_TaiKhoan tkDto, DTO_NhanVien nvDto) {
        this.setUndecorated(true);      
        initComponents();       
        this.setLocationRelativeTo(null) ;   
        this.settingColor();           
        this.tkDto = tkDto;
        this.nvDto = nvDto;
        this.addMenu();
        phanQuyen(this.tkDto);
    }
    
    public void phanQuyen(DTO_TaiKhoan tkDto){
        if(tkDto.getPQ().equals("ql")){           
            hienThi(true,true,true,true,true,true,true,true);
        }
        else if(tkDto.getPQ().equals("nv")){
            hienThi(true,false,false,true,true,false,true,true);
        }
        else{
            hienThi(false,false,true,false,false,false,false,true);
        }
    }
    
    public void hienThi(boolean bh,boolean sp, boolean nv, boolean kh, boolean hd, boolean ncc, boolean tk, boolean ttk ){
        jPanelMenu1.setVisible(bh);
        jPanelMenu2.setVisible(sp);
        jPanelMenu3.setVisible(nv);
        jPanelMenu4.setVisible(kh);
        jPanelMenu5.setVisible(hd);
        jPanelMenu6.setVisible(ncc);
        jPanelMenu7.setVisible(tk);
        jPanelMenu8.setVisible(ttk);
       
    }
    
//    public GUI_GiaoDienChinh(String tk) {
//        this.setUndecorated(true);      
//        initComponents();       
//        this.setLocationRelativeTo(null) ;   
//        this.settingColor();    
//       // this.addMenu();  
//        this.settingColor();   
//        String manv = null;
//        ArrayList<DTO_TaiKhoan> taiKhoan = tkbus.getList();
//        for(DTO_TaiKhoan x:taiKhoan)
//            if(x.getTENDN().equals(tk)){
//                manv=x.getMANV();
//                break;
//            }
//        this.addMenu(manv);  
//    }
    //FUNCITION

    public GUI_QuanLySPvaKM getPanelSPvaKM() {
        return panelSPvaKM;
    }

    public GUI_TrangChuBanHang getPanelBanHang() {
        return panelBanHang;
    }
    
    
public void addMenu()
{   
    panelThongKe = new GUI_QuanLyThongKe(tkDto,nvDto);
    panelThongTinDangNhap = new GUI_QuanLyThongTinDangNhap(tkDto,nvDto);
    jTabbedPane1.add(panelBanHang,1);
    jTabbedPane1.add(panelSPvaKM,2);
    jTabbedPane1.add(panelNVvaTK,3);
    jTabbedPane1.add(panelKHvaBH,4);
    jTabbedPane1.add(panelHoaDon,5);
    jTabbedPane1.add(panelNCC,6);
    jTabbedPane1.add(panelThongKe,7);
    jTabbedPane1.add(panelThongTinDangNhap,8);
    
}  
 


 public void settingColor(){
    // jCheckBox1.setOpaque(false);
     ColorMain = new Color(17,153,142);
     ColorClick = new Color(17,153,142) ;
     sidebar = new Color(102,102,102);
    
 }

 public void clickChangeColor(JPanel panelMenu, Color colorMenu) 
 {
    jPanelMenu1.setBackground(sidebar);
    jPanelMenu2.setBackground(sidebar);
    jPanelMenu3.setBackground(sidebar);
    jPanelMenu4.setBackground(sidebar);
    jPanelMenu5.setBackground(sidebar);
    jPanelMenu6.setBackground(sidebar);
    jPanelMenu7.setBackground(sidebar);
    jPanelMenu8.setBackground(sidebar);
    panelMenu.setBackground(colorMenu);
 }

 public void visibleJPanelMenu1Title(boolean visibleOnOff){
     jPanelMenu1Title.setVisible(visibleOnOff);
     jPanelMenu2Title.setVisible(visibleOnOff);
     jPanelMenu3Title.setVisible(visibleOnOff);
     jPanelMenu4Title.setVisible(visibleOnOff);
     jPanelMenu5Title.setVisible(visibleOnOff);
     jPanelMenu6Title.setVisible(visibleOnOff);
     jPanelMenu7Title.setVisible(visibleOnOff);
     jPanelMenu8Title.setVisible(visibleOnOff);
 }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelMain = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanelMenuAll = new javax.swing.JPanel();
        jPanelSidebar = new javax.swing.JPanel();
        jPanelMenu1 = new javax.swing.JPanel();
        jPanelMenu1Title = new javax.swing.JPanel();
        jLabelTitleMenu1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelMenu2 = new javax.swing.JPanel();
        jPanelMenu2Title = new javax.swing.JPanel();
        jLabelTitleMenu2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelMenu3 = new javax.swing.JPanel();
        jPanelMenu3Title = new javax.swing.JPanel();
        jLabelTitleMenu3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelMenu4 = new javax.swing.JPanel();
        jPanelMenu4Title = new javax.swing.JPanel();
        jLabelTitleMenu4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelMenu5 = new javax.swing.JPanel();
        jPanelMenu5Title = new javax.swing.JPanel();
        jLabelTitleMenu5 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanelMenu6 = new javax.swing.JPanel();
        jPanelMenu6Title = new javax.swing.JPanel();
        jLabelTitleMenu6 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanelMenu7 = new javax.swing.JPanel();
        jPanelMenu7Title = new javax.swing.JPanel();
        jLabelTitleMenu7 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanelMenu8 = new javax.swing.JPanel();
        jPanelMenu8Title = new javax.swing.JPanel();
        jLabelTitleMenu8 = new javax.swing.JLabel();
        jLabelTitleMenu9 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 861));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(17, 153, 142));
        jPanel3.setPreferredSize(new java.awt.Dimension(1500, 100));

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("DEVSTORE");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross32.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1204, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabelTitle))
                .addGap(0, 56, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanelMain.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 153, 142)));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanel4);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -4, 1300, 770));

        jPanelMain.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanelMenuAll.setBackground(new java.awt.Color(102, 102, 102));
        jPanelMenuAll.setPreferredSize(new java.awt.Dimension(250, 760));
        jPanelMenuAll.setLayout(new java.awt.BorderLayout());

        jPanelSidebar.setBackground(new java.awt.Color(102, 102, 102));
        jPanelSidebar.setMinimumSize(new java.awt.Dimension(0, 681));
        jPanelSidebar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelSidebarMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelSidebarMouseMoved(evt);
            }
        });
        jPanelSidebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelSidebarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelSidebarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelSidebarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelSidebarMouseReleased(evt);
            }
        });

        jPanelMenu1.setBackground(new java.awt.Color(102, 102, 102));
        jPanelMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu1.setPreferredSize(new java.awt.Dimension(250, 80));
        jPanelMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenu1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelMenu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelMenu1MouseExited(evt);
            }
        });
        jPanelMenu1.setLayout(new java.awt.BorderLayout());

        jPanelMenu1Title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanelMenu1Title.setOpaque(false);
        jPanelMenu1Title.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 25));

        jLabelTitleMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitleMenu1.setText("QUẢN LÍ BÁN HÀNG");
        jPanelMenu1Title.add(jLabelTitleMenu1);

        jPanelMenu1.add(jPanelMenu1Title, java.awt.BorderLayout.CENTER);

        jPanel11.setMinimumSize(new java.awt.Dimension(80, 90));
        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(80, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/shopping-cart.png"))); // NOI18N
        jPanel11.add(jLabel1);

        jPanelMenu1.add(jPanel11, java.awt.BorderLayout.LINE_START);

        jPanelMenu2.setBackground(new java.awt.Color(102, 102, 102));
        jPanelMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu2.setPreferredSize(new java.awt.Dimension(250, 80));
        jPanelMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenu2MouseClicked(evt);
            }
        });
        jPanelMenu2.setLayout(new java.awt.BorderLayout());

        jPanelMenu2Title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanelMenu2Title.setOpaque(false);
        jPanelMenu2Title.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 25));

        jLabelTitleMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitleMenu2.setText("QUẢN LÍ SẢN PHẨM");
        jPanelMenu2Title.add(jLabelTitleMenu2);

        jPanelMenu2.add(jPanelMenu2Title, java.awt.BorderLayout.CENTER);

        jPanel12.setOpaque(false);
        jPanel12.setPreferredSize(new java.awt.Dimension(80, 90));
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 5));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/received.png"))); // NOI18N
        jPanel12.add(jLabel2);

        jPanelMenu2.add(jPanel12, java.awt.BorderLayout.LINE_START);

        jPanelMenu3.setBackground(new java.awt.Color(102, 102, 102));
        jPanelMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu3.setPreferredSize(new java.awt.Dimension(250, 80));
        jPanelMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenu3MouseClicked(evt);
            }
        });
        jPanelMenu3.setLayout(new java.awt.BorderLayout());

        jPanelMenu3Title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanelMenu3Title.setOpaque(false);
        jPanelMenu3Title.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 25));

        jLabelTitleMenu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitleMenu3.setText("QUẢN LÍ NHÂN VIÊN");
        jPanelMenu3Title.add(jLabelTitleMenu3);

        jPanelMenu3.add(jPanelMenu3Title, java.awt.BorderLayout.CENTER);

        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(80, 90));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 5));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/receptionist.png"))); // NOI18N
        jPanel13.add(jLabel3);

        jPanelMenu3.add(jPanel13, java.awt.BorderLayout.LINE_START);

        jPanelMenu4.setBackground(new java.awt.Color(102, 102, 102));
        jPanelMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu4.setPreferredSize(new java.awt.Dimension(250, 80));
        jPanelMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenu4MouseClicked(evt);
            }
        });
        jPanelMenu4.setLayout(new java.awt.BorderLayout());

        jPanelMenu4Title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanelMenu4Title.setOpaque(false);
        jPanelMenu4Title.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jLabelTitleMenu4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitleMenu4.setText("KHÁCH HÀNG ");
        jPanelMenu4Title.add(jLabelTitleMenu4);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("& BẢO HÀNH");
        jPanelMenu4Title.add(jLabel10);

        jPanelMenu4.add(jPanelMenu4Title, java.awt.BorderLayout.CENTER);

        jPanel15.setOpaque(false);
        jPanel15.setPreferredSize(new java.awt.Dimension(80, 90));
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 5));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/satisfaction.png"))); // NOI18N
        jPanel15.add(jLabel4);

        jPanelMenu4.add(jPanel15, java.awt.BorderLayout.LINE_START);

        jPanelMenu5.setBackground(new java.awt.Color(102, 102, 102));
        jPanelMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu5.setPreferredSize(new java.awt.Dimension(250, 80));
        jPanelMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenu5MouseClicked(evt);
            }
        });
        jPanelMenu5.setLayout(new java.awt.BorderLayout());

        jPanelMenu5Title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanelMenu5Title.setOpaque(false);
        jPanelMenu5Title.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 25));

        jLabelTitleMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitleMenu5.setText("QUẢN LÍ HÓA ĐƠN");
        jPanelMenu5Title.add(jLabelTitleMenu5);

        jPanelMenu5.add(jPanelMenu5Title, java.awt.BorderLayout.CENTER);

        jPanel17.setOpaque(false);
        jPanel17.setPreferredSize(new java.awt.Dimension(80, 90));
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 5));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/hoaDOn.png"))); // NOI18N
        jPanel17.add(jLabel6);

        jPanelMenu5.add(jPanel17, java.awt.BorderLayout.LINE_START);

        jPanelMenu6.setBackground(new java.awt.Color(102, 102, 102));
        jPanelMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu6.setPreferredSize(new java.awt.Dimension(250, 80));
        jPanelMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenu6MouseClicked(evt);
            }
        });
        jPanelMenu6.setLayout(new java.awt.BorderLayout());

        jPanelMenu6Title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanelMenu6Title.setOpaque(false);
        jPanelMenu6Title.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 25));

        jLabelTitleMenu6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitleMenu6.setText("QUẢN LÍ NCC");
        jPanelMenu6Title.add(jLabelTitleMenu6);

        jPanelMenu6.add(jPanelMenu6Title, java.awt.BorderLayout.CENTER);

        jPanel19.setOpaque(false);
        jPanel19.setPreferredSize(new java.awt.Dimension(80, 90));
        jPanel19.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 5));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/control.png"))); // NOI18N
        jPanel19.add(jLabel7);

        jPanelMenu6.add(jPanel19, java.awt.BorderLayout.LINE_START);

        jPanelMenu7.setBackground(new java.awt.Color(102, 102, 102));
        jPanelMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu7.setPreferredSize(new java.awt.Dimension(250, 80));
        jPanelMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenu7MouseClicked(evt);
            }
        });
        jPanelMenu7.setLayout(new java.awt.BorderLayout());

        jPanelMenu7Title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanelMenu7Title.setOpaque(false);
        jPanelMenu7Title.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 25));

        jLabelTitleMenu7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitleMenu7.setText("QUẢN LÍ THÔNG KÊ");
        jPanelMenu7Title.add(jLabelTitleMenu7);

        jPanelMenu7.add(jPanelMenu7Title, java.awt.BorderLayout.CENTER);

        jPanel21.setOpaque(false);
        jPanel21.setPreferredSize(new java.awt.Dimension(80, 90));
        jPanel21.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 5));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/trend.png"))); // NOI18N
        jPanel21.add(jLabel8);

        jPanelMenu7.add(jPanel21, java.awt.BorderLayout.LINE_START);

        jPanelMenu8.setBackground(new java.awt.Color(102, 102, 102));
        jPanelMenu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu8.setPreferredSize(new java.awt.Dimension(250, 80));
        jPanelMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenu8MouseClicked(evt);
            }
        });
        jPanelMenu8.setLayout(new java.awt.BorderLayout());

        jPanelMenu8Title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanelMenu8Title.setOpaque(false);
        jPanelMenu8Title.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 15));

        jLabelTitleMenu8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitleMenu8.setText("THÔNG TIN ");
        jPanelMenu8Title.add(jLabelTitleMenu8);

        jLabelTitleMenu9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitleMenu9.setText("ĐĂNG NHẬP");
        jPanelMenu8Title.add(jLabelTitleMenu9);

        jPanelMenu8.add(jPanelMenu8Title, java.awt.BorderLayout.CENTER);

        jPanel23.setOpaque(false);
        jPanel23.setPreferredSize(new java.awt.Dimension(80, 90));
        jPanel23.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 5));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/nguoidangnhap.png"))); // NOI18N
        jPanel23.add(jLabel9);

        jPanelMenu8.add(jPanel23, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanelSidebarLayout = new javax.swing.GroupLayout(jPanelSidebar);
        jPanelSidebar.setLayout(jPanelSidebarLayout);
        jPanelSidebarLayout.setHorizontalGroup(
            jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSidebarLayout.createSequentialGroup()
                .addGroup(jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMenu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMenu8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMenu5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMenu7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMenu6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelSidebarLayout.setVerticalGroup(
            jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanelMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanelMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanelMenu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanelMenu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanelMenu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanelMenu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanelMenu8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelMenuAll.add(jPanelSidebar, java.awt.BorderLayout.CENTER);

        jPanelMain.add(jPanelMenuAll, java.awt.BorderLayout.LINE_START);

        jPanel1.add(jPanelMain, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenu1MouseClicked
        // TODO add your handling code here:
//        this.jTabbedPane1.remove(1);
//        panelBanHang = new GUI_TrangChuBanHang();
//        this.jTabbedPane1.add(panelBanHang, 1);
        clickChangeColor(jPanelMenu1,ColorClick);
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jPanelMenu1MouseClicked

    private void jPanelMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenu2MouseClicked
        // TODO add your handling code here:
        clickChangeColor(jPanelMenu2,ColorClick);
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jPanelMenu2MouseClicked

    private void jPanelMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenu3MouseClicked
        // TODO add your handling code here:
        clickChangeColor(jPanelMenu3,ColorClick);
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jPanelMenu3MouseClicked

    private void jPanelMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenu4MouseClicked
        // TODO add your handling code here:
        clickChangeColor(jPanelMenu4,ColorClick);
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jPanelMenu4MouseClicked

    private void jPanelMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenu5MouseClicked
        // TODO add your handling code here:
        clickChangeColor(jPanelMenu5,ColorClick);
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jPanelMenu5MouseClicked

    private void jPanelMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenu6MouseClicked
        // TODO add your handling code here:
        clickChangeColor(jPanelMenu6,ColorClick);
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jPanelMenu6MouseClicked

    private void jPanelMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenu7MouseClicked
        // TODO add your handling code here:
        clickChangeColor(jPanelMenu7,ColorClick);
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_jPanelMenu7MouseClicked

    private void jPanelMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenu8MouseClicked
        // TODO add your handling code here:
        clickChangeColor(jPanelMenu8,ColorClick);
        jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_jPanelMenu8MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
         if (JOptionPane.showConfirmDialog(this, 
            "Bạn có muốn thoát ứng dụng?", "Close Đăng nhập?", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
         {
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            System.exit(0);
        }
        else
          this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);			
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanelSidebarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSidebarMouseEntered
        // TODO add your handling code here: 
    }//GEN-LAST:event_jPanelSidebarMouseEntered

    private void jPanelSidebarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSidebarMouseExited
        // TODO add your handling code here:  
    }//GEN-LAST:event_jPanelSidebarMouseExited

    private void jPanelSidebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSidebarMousePressed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jPanelSidebarMousePressed

    private void jPanelSidebarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSidebarMouseReleased
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jPanelSidebarMouseReleased

    private void jPanelSidebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSidebarMouseDragged
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jPanelSidebarMouseDragged

    private void jPanelSidebarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSidebarMouseMoved
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPanelSidebarMouseMoved

    private void jPanelMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenu1MouseEntered
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jPanelMenu1MouseEntered

    private void jPanelMenu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenu1MouseExited
        // TODO add your handling code here:      
    }//GEN-LAST:event_jPanelMenu1MouseExited

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GUI_GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUI_GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUI_GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUI_GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//               new GUI_GiaoDienChinh().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitleMenu1;
    private javax.swing.JLabel jLabelTitleMenu2;
    private javax.swing.JLabel jLabelTitleMenu3;
    private javax.swing.JLabel jLabelTitleMenu4;
    private javax.swing.JLabel jLabelTitleMenu5;
    private javax.swing.JLabel jLabelTitleMenu6;
    private javax.swing.JLabel jLabelTitleMenu7;
    private javax.swing.JLabel jLabelTitleMenu8;
    private javax.swing.JLabel jLabelTitleMenu9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMenu1;
    private javax.swing.JPanel jPanelMenu1Title;
    private javax.swing.JPanel jPanelMenu2;
    private javax.swing.JPanel jPanelMenu2Title;
    private javax.swing.JPanel jPanelMenu3;
    private javax.swing.JPanel jPanelMenu3Title;
    private javax.swing.JPanel jPanelMenu4;
    private javax.swing.JPanel jPanelMenu4Title;
    private javax.swing.JPanel jPanelMenu5;
    private javax.swing.JPanel jPanelMenu5Title;
    private javax.swing.JPanel jPanelMenu6;
    private javax.swing.JPanel jPanelMenu6Title;
    private javax.swing.JPanel jPanelMenu7;
    private javax.swing.JPanel jPanelMenu7Title;
    private javax.swing.JPanel jPanelMenu8;
    private javax.swing.JPanel jPanelMenu8Title;
    private javax.swing.JPanel jPanelMenuAll;
    private javax.swing.JPanel jPanelSidebar;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
