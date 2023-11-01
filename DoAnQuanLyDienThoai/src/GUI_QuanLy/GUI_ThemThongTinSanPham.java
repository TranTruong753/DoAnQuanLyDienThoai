/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI_QuanLy;

import BUS.*;
import DTO.*;
import QLController.*;
import function.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



public class GUI_ThemThongTinSanPham extends javax.swing.JFrame {

    /**
     * Creates new form GUI_UpdateThongTinSanPham2
     */
    private String path="";
    private DTO_SanPham spDTO = new DTO_SanPham();
    private BUS_SanPham spBUS = new BUS_SanPham();
    private BUS_ThuongHieu thbus=new BUS_ThuongHieu();
    private QuanLySanPhamControllerfix qlf ;
    private ArrayList<DTO_SanPham> listSp = new ArrayList<>();
    private ArrayList<DTO_ThuongHieu> listth = new ArrayList<>();
    public GUI_TrangChuBanHang panelBanHang;   
    private ArrayList<String>  listTh ;
    

    
    public GUI_ThemThongTinSanPham( QuanLySanPhamControllerfix qlf,GUI_TrangChuBanHang panelBanHang ) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.qlf = qlf;
        this.loadListMaTh();
        listSp=(ArrayList<DTO_SanPham>) spBUS.getList();
        listth=thbus.getList();
        this.panelBanHang = panelBanHang;
        this.jtfMASP.setText(capNhatMaSp(jcbMaTh.getSelectedItem().toString()));
    }
    
    public void loadListMaTh(){
        listTh = new ArrayList<>();
        listTh.add("Danh sách mã thương hiệu");
        for(DTO_ThuongHieu th:thbus.getList()){
             String maTh = th.getMATH();      
            // Kiểm tra xem màu này đã tồn tại trong danh sách chưa
            if (!listTh.contains(maTh)) {
                listTh.add(maTh);
            }
        }
         // Tạo một DefaultComboBoxModel với danh sách màu
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(listTh.toArray(new String[0]));

        // Đặt model cho JComboBox
        jcbMaTh.setModel(model);
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jtfMASP = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jtfTENSP = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jcbMaTh = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jtfDUNGLUONG = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jtfDONGIA = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jtfMAUSAC = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jtfRam = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jlbHinhAnh = new javax.swing.JLabel();
        btnchon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 574));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(680, 300));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Mã SP");
        jLabel25.setPreferredSize(new java.awt.Dimension(110, 17));
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 30));

        jtfMASP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfMASP.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel8.add(jtfMASP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Tên SP");
        jLabel26.setPreferredSize(new java.awt.Dimension(110, 17));
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 11, 50, 30));

        jtfTENSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfTENSP.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel8.add(jtfTENSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(650, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Mã TH");
        jLabel28.setPreferredSize(new java.awt.Dimension(50, 17));
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 67, -1, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Màu Sắc");
        jLabel29.setPreferredSize(new java.awt.Dimension(180, 17));
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 97, -1));

        jcbMaTh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbMaTh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Danh sách màu", " " }));
        jcbMaTh.setPreferredSize(new java.awt.Dimension(80, 30));
        jcbMaTh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMaThActionPerformed(evt);
            }
        });
        jPanel8.add(jcbMaTh, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 200, -1));

        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(650, 30));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Dung lượng(Gb)");
        jLabel27.setPreferredSize(new java.awt.Dimension(110, 17));
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 30));

        jtfDUNGLUONG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfDUNGLUONG.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel8.add(jtfDUNGLUONG, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Đơn giá");
        jLabel30.setPreferredSize(new java.awt.Dimension(110, 17));
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 137, 60, 20));

        jtfDONGIA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfDONGIA.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel8.add(jtfDONGIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(650, 30));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jtfMAUSAC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfMAUSAC.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel8.add(jtfMAUSAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Ram(Gb)");
        jLabel31.setPreferredSize(new java.awt.Dimension(110, 17));
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jtfRam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfRam.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel8.add(jtfRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jPanel2.add(jPanel8);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.BorderLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(17, 153, 142));
        kGradientPanel1.setkStartColor(new java.awt.Color(17, 153, 142));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1000, 70));
        kGradientPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SẢN PHẨM");
        jLabel1.setPreferredSize(new java.awt.Dimension(950, 64));
        kGradientPanel1.add(jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross32.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel2);

        jPanel3.add(kGradientPanel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(17, 153, 142));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/themSanPham2.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setPreferredSize(new java.awt.Dimension(110, 40));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel5.add(btnThem);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/xoaSanPham.png"))); // NOI18N
        jButton2.setText("Hủy");
        jButton2.setPreferredSize(new java.awt.Dimension(110, 40));
        jPanel5.add(jButton2);

        jPanel1.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(300, 530));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hình ảnh", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(300, 350));
        jPanel7.setLayout(new java.awt.BorderLayout());
        jPanel7.add(jlbHinhAnh, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7);

        btnchon.setText("Chọn");
        btnchon.setPreferredSize(new java.awt.Dimension(100, 40));
        btnchon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchonActionPerformed(evt);
            }
        });
        jPanel6.add(btnchon);

        jPanel1.add(jPanel6, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String capNhatMaSp(String maTh){
        String maSp = "";
        if(jcbMaTh.getSelectedIndex()!=0){
            listSp = spBUS.timThTrongSp(jcbMaTh.getSelectedItem().toString());
            int soThuTuMa = listSp.size()+1;
            if(soThuTuMa<10){
                maSp = jcbMaTh.getSelectedItem().toString() + "0" + soThuTuMa;
            }
            else{
                maSp = jcbMaTh.getSelectedItem().toString() + soThuTuMa;
            }
        }
        
        return maSp ;
        
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
      
       
        
        if(jtfMASP.getText().equals("") || jtfTENSP.getText().equals("") || jtfMAUSAC.getText().equals("")
                || jtfDUNGLUONG.getText().equals("")|| jtfDONGIA.getText().equals("") || jcbMaTh.getSelectedItem()==null ||
                jtfDUNGLUONG.getText().matches("\\d+")==false || jtfDONGIA.getText().matches("\\d+")==false
                ||jcbMaTh.getSelectedIndex()==0||jtfRam.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Thông tin chưa hợp lệ", "Thông báo", JOptionPane.WARNING_MESSAGE);
        else
            if(path.equals(""))
                JOptionPane.showMessageDialog(null, "Hãy chọn hình ảnh", "Thông báo", JOptionPane.WARNING_MESSAGE);
            else if(spBUS.timSp(jtfMASP.getText()).size()!=0)
                JOptionPane.showMessageDialog(null, "Mã sản phẩm bị trùng", "Thông báo", JOptionPane.WARNING_MESSAGE);
       
                
            else{
                spDTO.setMaSp(jtfMASP.getText());
                spDTO.setTenSp(jtfTENSP.getText());               
                spDTO.setMauSac(jtfMAUSAC.getText());
                spDTO.setMaThuongHieu(jcbMaTh.getSelectedItem().toString());
                String cauHinh = jtfRam.getText() + "GB-" +jtfDUNGLUONG.getText() +"GB";
                spDTO.setDungLuong(cauHinh);
                spDTO.setDonGia(Double.parseDouble(jtfDONGIA.getText()));
                spDTO.setImg(path);
                spDTO.setSoLuong(0);
                spDTO.setTrangThai(1);
                if(spBUS.addSanPham(spDTO))
                {
                    JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    qlf.setDateToTable();
                    panelBanHang.load();
                    this.dispose();
                }
                else
                    JOptionPane.showMessageDialog(null, "Thêm thất bại", "Thông báo", JOptionPane.WARNING_MESSAGE);
                
                    
            }
    }//GEN-LAST:event_btnThemActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnchonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode (JFileChooser.FILES_ONLY); //chi hien thi f
        int returnValue = fileChooser.showOpenDialog(this);
        if(returnValue==JFileChooser.APPROVE_OPTION)
        {
            File file=fileChooser.getSelectedFile();
            String path1=file.getAbsolutePath();
            System.out.println(path1);
            path = file.getAbsolutePath();
            int desiredWidth = 300; // Chiều rộng mong muốn
            int desiredHeight = 200; // Chiều cao mong muốn
            
                 try {
            // Kiểm tra định dạng tệp hình ảnh
            if (isImageFile(file)) {
                File imageFile = new File(path1);
                BufferedImage originalImage = ImageIO.read(imageFile);

                // Thay đổi kích thước hình ảnh
                Image resizedImage = originalImage.getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);

                // Tạo biểu tượng từ hình ảnh đã thay đổi kích thước
                ImageIcon imageIcon = new ImageIcon(resizedImage);

                // Đặt biểu tượng cho thành phần giao diện người dùng
                jlbHinhAnh.setIcon(imageIcon);
            } else {
                System.out.println("Tệp không phải là hình ảnh hợp lệ.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            
    
        }                 
    }//GEN-LAST:event_btnchonActionPerformed

    private void jcbMaThActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMaThActionPerformed
        // TODO add your handling code here:
        jtfMASP.setText(capNhatMaSp(jcbMaTh.getSelectedItem().toString()));
    }//GEN-LAST:event_jcbMaThActionPerformed

    private boolean isImageFile(File file) {
    String name = file.getName().toLowerCase();
    return name.endsWith(".jpg") || name.endsWith(".jpeg") || name.endsWith(".png") || name.endsWith(".gif") || name.endsWith(".bmp");
}
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
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GUI_ThemThongTinSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUI_ThemThongTinSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUI_ThemThongTinSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUI_ThemThongTinSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUI_ThemThongTinSanPham().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnchon;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JComboBox<String> jcbMaTh;
    private javax.swing.JLabel jlbHinhAnh;
    private javax.swing.JTextField jtfDONGIA;
    private javax.swing.JTextField jtfDUNGLUONG;
    private javax.swing.JTextField jtfMASP;
    private javax.swing.JTextField jtfMAUSAC;
    private javax.swing.JTextField jtfRam;
    private javax.swing.JTextField jtfTENSP;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
