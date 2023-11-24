/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI_QuanLy;

import BUS.*;
import BUS.*;
import DTO.*;
import QLController.*;
import function.funcDungChung;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Admin
 */
public class GUI_XacNhanNhapHang extends javax.swing.JDialog {
   ;
    private JPanel parentPanel; // Thêm một trường JPanel
    private QuanLySanPhamControllerfix qlSp ;
    private QuanLyCTHDNHController qlNh ;
    private funcDungChung fun = new funcDungChung();
    private ArrayList<String> listNcc ;
    private ArrayList<DTO_CTPN> listCtPn = new ArrayList<>();
    private BUS_PhieuNhap pnBus = new BUS_PhieuNhap();
    private BUS_CTPN ctpnBus = new BUS_CTPN();
    private BUS_NhaCc nccBus = new BUS_NhaCc();
    private BUS_SanPham spBus = new BUS_SanPham();
    private DTO_SanPham spDto = new DTO_SanPham();
    private QuanLyPhieuNhapController controllerpn;
    private GUI_GiaoDienChinh gd;
    
    
    public GUI_XacNhanNhapHang(JPanel parent, boolean modal, QuanLyPhieuNhapController controllerpn, GUI_GiaoDienChinh gd ) {
        super((Frame) SwingUtilities.getWindowAncestor(parent), modal);
        this.parentPanel = parent; // Lưu trữ JPanel làm parentPanel
        initComponents();
        this.setLocationRelativeTo(null);
        this.loadListTenNccComBox();
        this.gd = gd;
        this.controllerpn = controllerpn;
        this.qlSp = new QuanLySanPhamControllerfix(jpnViewSanPham, jtfTim, btnThem, btnXoa, btnSua, jtfMaSp, jtfTenSp, jtfSoLuong, jtfGiaNhap,spDto);
        this.qlSp.setDateToTableChoPhieuNhap();
        this.qlNh = new QuanLyCTHDNHController(jpnViewPhieuNhap, jtfMaSp,jtfTenSp, jtfSoLuong, jtfGiaNhap,  btnThem, btnSua,  btnXoa, jcbNcc);        
    }

    public String capNhatMaPNH(){
            String maPn = "";                   
            int soThuTuMa = pnBus.getList().size()+1;
            if(soThuTuMa<10){
                maPn = "HDN00" + soThuTuMa;
            }
            else{
                maPn = "HDN0" + soThuTuMa;
            }             
        return maPn ;
    }
    
    public void loadListTenNccComBox(){
        listNcc = new ArrayList<>();
        listNcc.add("Danh sách nhà cung cấp");
        for(DTO_NhaCc ncc:nccBus.getList()){
            String tenNcc = ncc.getTENNCC();                 
            if (!listNcc.contains(tenNcc)) {
                listNcc.add(tenNcc);
            }
        }       
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(listNcc.toArray(new String[0]));
        jcbNcc.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jpnViewSanPham = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jtfTim = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jpnViewPhieuNhap = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfMaSp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfSoLuong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfTenSp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbNcc = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jtfGiaNhap = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        btnHuy = new javax.swing.JButton();
        btnNhapHang = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jlbTongThanhTien = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 813));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setPreferredSize(new java.awt.Dimension(811, 427));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jpnViewSanPham.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpnViewSanPhamLayout = new javax.swing.GroupLayout(jpnViewSanPham);
        jpnViewSanPham.setLayout(jpnViewSanPhamLayout);
        jpnViewSanPhamLayout.setHorizontalGroup(
            jpnViewSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jpnViewSanPhamLayout.setVerticalGroup(
            jpnViewSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );

        jPanel8.add(jpnViewSanPham, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel9.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        jtfTim.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel9.add(jtfTim);

        jPanel7.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setPreferredSize(new java.awt.Dimension(811, 370));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setLayout(new java.awt.BorderLayout());

        jpnViewPhieuNhap.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpnViewPhieuNhapLayout = new javax.swing.GroupLayout(jpnViewPhieuNhap);
        jpnViewPhieuNhap.setLayout(jpnViewPhieuNhapLayout);
        jpnViewPhieuNhapLayout.setHorizontalGroup(
            jpnViewPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jpnViewPhieuNhapLayout.setVerticalGroup(
            jpnViewPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel11.add(jpnViewPhieuNhap, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel12.setPreferredSize(new java.awt.Dimension(900, 150));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 10));

        jPanel14.setPreferredSize(new java.awt.Dimension(620, 130));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã sản phẩm:");
        jLabel2.setPreferredSize(new java.awt.Dimension(95, 30));
        jPanel14.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jtfMaSp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfMaSp.setEnabled(false);
        jtfMaSp.setPreferredSize(new java.awt.Dimension(130, 30));
        jPanel14.add(jtfMaSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nhập số lượng:");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel14.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jtfSoLuong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfSoLuong.setEnabled(false);
        jtfSoLuong.setPreferredSize(new java.awt.Dimension(100, 30));
        jtfSoLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfSoLuongKeyTyped(evt);
            }
        });
        jPanel14.add(jtfSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tên sản phẩm:");
        jLabel4.setPreferredSize(new java.awt.Dimension(95, 30));
        jPanel14.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jtfTenSp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfTenSp.setEnabled(false);
        jtfTenSp.setPreferredSize(new java.awt.Dimension(130, 30));
        jPanel14.add(jtfTenSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nhà cung cấp:");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel14.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jcbNcc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcbNcc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Danh sách nhà cung cấp", "Item 2", "Item 3", "Item 4" }));
        jcbNcc.setPreferredSize(new java.awt.Dimension(165, 30));
        jPanel14.add(jcbNcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 170, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Nhập giá sản phẩm (giá của 1 sản phẩm):");
        jLabel10.setPreferredSize(new java.awt.Dimension(45, 30));
        jPanel14.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 270, -1));

        jtfGiaNhap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfGiaNhap.setEnabled(false);
        jtfGiaNhap.setPreferredSize(new java.awt.Dimension(73, 30));
        jtfGiaNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfGiaNhapKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfGiaNhapKeyTyped(evt);
            }
        });
        jPanel14.add(jtfGiaNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 270, -1));

        jPanel13.add(jPanel14);

        jPanel12.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel15.setPreferredSize(new java.awt.Dimension(150, 0));
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 7));

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem.setText("THÊM");
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.setPreferredSize(new java.awt.Dimension(120, 40));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel15.add(btnThem);

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSua.setText("SỬA");
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua.setPreferredSize(new java.awt.Dimension(120, 40));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel15.add(btnSua);

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa.setText("XÓA");
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.setPreferredSize(new java.awt.Dimension(120, 40));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel15.add(btnXoa);

        jPanel12.add(jPanel15, java.awt.BorderLayout.LINE_END);

        jPanel10.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel7.add(jPanel10, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(17, 153, 142));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("XÁC NHẬN NHẬP HÀNG");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross32.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setPreferredSize(new java.awt.Dimension(32, 32));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel16.setBackground(new java.awt.Color(17, 153, 142));
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/xoaSanPham.png"))); // NOI18N
        btnHuy.setText("HỦY");
        btnHuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHuy.setPreferredSize(new java.awt.Dimension(100, 50));
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel16.add(btnHuy);

        btnNhapHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/themSanPham2.png"))); // NOI18N
        btnNhapHang.setText("NHẬP HÀNG");
        btnNhapHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNhapHang.setPreferredSize(new java.awt.Dimension(160, 50));
        btnNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapHangActionPerformed(evt);
            }
        });
        jPanel16.add(btnNhapHang);

        jPanel4.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel17.setPreferredSize(new java.awt.Dimension(1000, 40));
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 5));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Tổng tiền:");
        jPanel17.add(jLabel6);

        jlbTongThanhTien.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlbTongThanhTien.setText("Số tiền");
        jPanel17.add(jlbTongThanhTien);

        jPanel4.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setPreferredSize(new java.awt.Dimension(20, 650));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel6.setPreferredSize(new java.awt.Dimension(20, 650));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here: 
        DTO_CTPN ctpn = new DTO_CTPN();
        Double tongThanhTien = 0.0;     
        if(checkdkThemSp()){
            ctpn.setMAHDNH(capNhatMaPNH());
            ctpn.setMASP(jtfMaSp.getText());
            ctpn.setTENSP(jtfTenSp.getText());
            ctpn.setSL(Integer.parseInt(jtfSoLuong.getText()));
            ctpn.setDONGIA(Double.parseDouble(jtfGiaNhap.getText()));
            Double thanhTien = ctpn.getSL() * ctpn.getDONGIA();
            ctpn.setTHANHTIEN(thanhTien);

            boolean isUpdated = false;
            for (DTO_CTPN checkpn : listCtPn) {
                if (checkpn.getMASP().equals(ctpn.getMASP())) {
                    // Nếu phần tử đã tồn tại, cập nhật lại thông tin
                    isUpdated = true;
                    if (JOptionPane.showConfirmDialog(this, 
                        "Bạn có muốn thay thế Sản phẩm nhập hiện tại trong danh sách?", "Sản phẩm nhập bị trùng!", 
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION)
                     {
                         break;
                     }
                    else{
                        checkpn.setSL(ctpn.getSL());
                        checkpn.setDONGIA(ctpn.getDONGIA());
                        checkpn.setTHANHTIEN(ctpn.getTHANHTIEN());
                        JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");                        
                        break; 
                    }
                   
                }            
            }
            if (!isUpdated) {
                // Nếu phần tử chưa tồn tại, thêm vào danh sách
                listCtPn.add(ctpn);
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");                
            }       
            qlNh.setDateToTablePN(listCtPn);
            jcbNcc.setEnabled(false);
            jtfSoLuong.setEnabled(false);
            jtfGiaNhap.setEnabled(false);
            
            jtfMaSp.setText("");
            jtfTenSp.setText("");
            jtfGiaNhap.setText("");
            for (DTO_CTPN checkpn : listCtPn) {              
                tongThanhTien += checkpn.getTHANHTIEN();
            }
            jlbTongThanhTien.setText(fun.doubleToFormattedString(tongThanhTien));
           
        }
        
      
            
       
    }//GEN-LAST:event_btnThemActionPerformed

    public boolean checkdkThemSp(){           
        if(jtfMaSp.getText().equals("")||jtfTenSp.getText().equals("")){
              JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn sản phẩm!","Thông báo", JOptionPane.WARNING_MESSAGE);
              return false;
        }
        if(jtfSoLuong.getText().equals("")||jtfGiaNhap.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Thông tin chưa đầy đủ!","Thông báo", JOptionPane.WARNING_MESSAGE);
                return false;
        }
        Double soLuong = Double.valueOf(jtfSoLuong.getText());
        Double giaNhap = Double.valueOf(jtfGiaNhap.getText());
        if(soLuong==0){
            JOptionPane.showMessageDialog(rootPane, "Số lượng phải lơn hơn 0!","Thông báo", JOptionPane.WARNING_MESSAGE);
            return false;
        }       
        if(giaNhap==0){
              JOptionPane.showMessageDialog(rootPane, "Giá nhập phải lơn hơn 0!","Thông báo", JOptionPane.WARNING_MESSAGE);
              return false;
        }                           
        if(jcbNcc.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn nhà cung cấp !","Thông báo", JOptionPane.WARNING_MESSAGE);
            return false;
        }     
        return true;
    }   
    private void jtfGiaNhapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfGiaNhapKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtfGiaNhapKeyReleased

    private void jtfGiaNhapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfGiaNhapKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }       
    }//GEN-LAST:event_jtfGiaNhapKeyTyped

    private void jtfSoLuongKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSoLuongKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }      
    }//GEN-LAST:event_jtfSoLuongKeyTyped

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(listCtPn.size()>=1){
            if(checkdkThemSp()){
                String maSp = jtfMaSp.getText();
                Double tongThanhTien = 0.0;
                Double dongia = Double.parseDouble(jtfGiaNhap.getText());

                int soLuong = Integer.parseInt(jtfSoLuong.getText());
                Double thanhTien = soLuong * dongia;
                for (DTO_CTPN checkpn : listCtPn) {
                        if (checkpn.getMASP().equals(maSp)) {
                            checkpn.setSL(soLuong);
                            checkpn.setDONGIA(dongia);
                            checkpn.setTHANHTIEN(thanhTien);                           
                            break;
                        } 
                       
                    }
                
                qlNh.setDateToTablePN(listCtPn);
                JOptionPane.showMessageDialog(rootPane, "Sửa thành công!");
                jcbNcc.setEnabled(false);
                jtfSoLuong.setEnabled(false);
                jtfGiaNhap.setEnabled(false);

                jtfMaSp.setText("");
                jtfTenSp.setText("");
                jtfGiaNhap.setText("");
                jlbTongThanhTien.setText(fun.doubleToFormattedString(tongThanhTien));
                loadTongGia(tongThanhTien,jlbTongThanhTien);
            }
            
            
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Danh sách nhập hàng rỗng!","Thông báo", JOptionPane.WARNING_MESSAGE);      
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if(listCtPn.size()>=1){
            if(checkdkThemSp()){
              Double tongThanhTien = 0.0;
              String maSp = jtfMaSp.getText();
              for (DTO_CTPN checkpn : listCtPn) {
                    if (checkpn.getMASP().equals(maSp)) {                      
                        listCtPn.remove(checkpn);
                        break;
                    } 

                }
              qlNh.setDateToTablePN(listCtPn);
              JOptionPane.showMessageDialog(rootPane, "Xóa thành công!");
              jcbNcc.setEnabled(false);
              jtfSoLuong.setEnabled(false);
              jtfGiaNhap.setEnabled(false);

              jtfMaSp.setText("");
              jtfTenSp.setText("");
              jtfGiaNhap.setText("");  
              loadTongGia(tongThanhTien,jlbTongThanhTien);
              
              if(listCtPn.size()<1){
                  jcbNcc.setSelectedIndex(0);
                  jcbNcc.setEnabled(true);
              }
            }
            
              
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Danh sách nhập hàng rỗng!","Thông báo", JOptionPane.WARNING_MESSAGE);
        }
            
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapHangActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, 
        "Xác nhận nhập hàng!", "Xác nhận!", 
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
        {
            if(listCtPn.size()>0){
                taoPNvaoSQL();
            }
            else
                JOptionPane.showMessageDialog(null, "Danh sách nhập rỗng! Vui lòng chọn sản phẩm để nhập hàng", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    
    }//GEN-LAST:event_btnNhapHangActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed
    public void taoPNvaoSQL(){
        DTO_SanPham spDto = new DTO_SanPham();     
        if(jcbNcc.getSelectedIndex()!=0){         
            String tenNcc = jcbNcc.getSelectedItem().toString();
            String maNcc = null ;
            for(DTO_NhaCc Ncc:nccBus.timNcc(tenNcc)){              
                maNcc = Ncc.getMANCC();              
            }
            String maPn = capNhatMaPNH();
            Date ngayTaoPn = new Date(System.currentTimeMillis());
            double tongTienPn = Double.valueOf(fun.traVeMacDinh(jlbTongThanhTien.getText()));
            DTO_PhieuNhap pn = new DTO_PhieuNhap(maPn, maNcc, tenNcc, ngayTaoPn, tongTienPn, 1);
            if(pnBus.addPhieuNhap(pn)){
                if(listCtPn.size()>0){
                    boolean checkNhapHang = false;
                    for(DTO_CTPN ctpn:listCtPn){
                        ctpnBus.addCTPN(ctpn);
                        checkNhapHang = updateSoluong(spDto,ctpn.getMASP(),ctpn.getSL());
                    }
                    System.out.println("1"+checkNhapHang);
                    if(checkNhapHang){                        
                         controllerpn.setDateToTable();
                         gd.getPanelSPvaKM().getGuiSanPham().getQlf().setDateToTable();
                         gd.getPanelBanHang().load();
                         JOptionPane.showMessageDialog(null, "Nhập Hàng thành công!");
                         this.dispose();
                    }
                }
            }
            else
                JOptionPane.showMessageDialog(null, "Nhập Hàng thất bại!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            
        }
        
    }
    public boolean updateSoluong(DTO_SanPham spDto,String maSp, int sL){
        spDto = spBus.timSp2(maSp);
        if(spBus.updateSoLuongSp2(sL, maSp, spDto)){
            return true;
        }
        return false;
    }
    public void loadTongGia(Double tongThanhTien, JLabel textTongGiaTien){
        
        for (DTO_CTPN checkpn : listCtPn) {              
                tongThanhTien += checkpn.getTHANHTIEN();
        }
         textTongGiaTien.setText(fun.doubleToFormattedString(tongThanhTien));
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnNhapHang;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JComboBox<String> jcbNcc;
    private javax.swing.JLabel jlbTongThanhTien;
    private javax.swing.JPanel jpnViewPhieuNhap;
    private javax.swing.JPanel jpnViewSanPham;
    private javax.swing.JTextField jtfGiaNhap;
    private javax.swing.JTextField jtfMaSp;
    private javax.swing.JTextField jtfSoLuong;
    private javax.swing.JTextField jtfTenSp;
    private javax.swing.JTextField jtfTim;
    // End of variables declaration//GEN-END:variables
}
