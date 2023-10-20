/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI_QuanLy;

import BUS.BUS_SanPham;
import DTO.*;
import function.*;
import java.awt.Frame;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Admin
 */
public class GUI_ThongTinMuaSanPham extends javax.swing.JDialog {
    
    private JPanel parentPanel; // Thêm một trường JPanel
    private funcDungChung fuc = new funcDungChung();
    private ArrayList<String> listMau ;
    private DTO_SanPham spDTO = new DTO_SanPham();
    private BUS_SanPham spBUS = new BUS_SanPham();
    
    public GUI_ThongTinMuaSanPham(JPanel parent, boolean modal, DTO_SanPham sp) {
        super((Frame) SwingUtilities.getWindowAncestor(parent), modal);
        this.parentPanel = parent; // Lưu trữ JPanel làm parentPanel
        this.spDTO = sp ;
        initComponents();
        setLocationRelativeTo(null) ;
        this.loadListMauSacComBox();
        this.viewThongTinSp();
    }
    
    public void viewThongTinSp(){
        jtfMaSp.setEditable(false);
        jtfMaTh.setEditable(false);
        jtfTenSp.setEditable(false);
        jtfDungLuong.setEditable(false);
        jtfDonGia.setEditable(false);
        jtfKhuyenMai.setEditable(false);
        jtfSl.setEditable(false);
        jcbMauSac.setEnabled(false);
        
        jtfMaSp.setText(spDTO.getMaSp().toString());
        jtfMaTh.setText(spDTO.getMaThuongHieu().toString());
        jtfTenSp.setText(spDTO.getTenSp().toString());
        jtfDungLuong.setText(spDTO.getDungLuong());
        jtfDonGia.setText(fuc.doubleToFormattedString(spDTO.getDonGia())+" VNĐ");
        jtfKhuyenMai.setText(fuc.doubleToFormattedString(spDTO.getKhuyenMai())+" VNĐ");
        jtfSl.setText(spDTO.getSoLuong()+"");
        timMauCbb(spDTO.getMauSac(), jcbMauSac);
        
        String imagePath = spDTO.getImg(); // Đường dẫn tới hình ảnh
        int desiredWidth = 300; // Chiều rộng mong muốn
        int desiredHeight = 300; // Chiều cao mong muốn

        try {
            // Đọc hình ảnh từ đường dẫn
            BufferedImage originalImage = ImageIO.read(getClass().getResource(imagePath));

            // Thay đổi kích thước hình ảnh
            Image resizedImage = originalImage.getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);

            // Tạo biểu tượng từ hình ảnh đã thay đổi kích thước
            ImageIcon imageIcon = new ImageIcon(resizedImage);

            // Đặt biểu tượng cho thành phần giao diện người dùng
            jlbHinhAnh.setIcon(imageIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void timMauCbb(String mau, JComboBox<String> jcb) {
    int indexMau = -1;

        for (int i = 0; i < jcb.getItemCount(); i++) {
            String mauComboBox = jcb.getItemAt(i).toString();
            if (mauComboBox.equals(mau)) {
                indexMau = i;
                break;
            }
        }
        if (indexMau != -1) {
            jcb.setSelectedIndex(indexMau);
            jcb.setSelectedItem(jcb.getItemAt(indexMau)); // Hiển thị mục đã chọn
        }
    }
    
    public void loadListMauSacComBox(){
        listMau = new ArrayList<>();
        listMau.add("Danh sách màu");
        for(DTO_SanPham sp:spBUS.getList()){
            String mauSac = sp.getMauSac();       
            // Kiểm tra xem màu này đã tồn tại trong danh sách chưa
            if (!listMau.contains(mauSac)) {
                listMau.add(mauSac);
            }
        }
         // Tạo một DefaultComboBoxModel với danh sách màu
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(listMau.toArray(new String[0]));

        // Đặt model cho JComboBox
        jcbMauSac.setModel(model);
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
        jtfMaSp = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jtfTenSp = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jtfMaTh = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jcbMauSac = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jtfDungLuong = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jtfDonGia = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jtfKhuyenMai = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jtfSl = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jlbHinhAnh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 574));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel8.setOpaque(false);
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Mã SP");
        jLabel25.setPreferredSize(new java.awt.Dimension(110, 17));
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 30));

        jtfMaSp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfMaSp.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel8.add(jtfMaSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Tên SP");
        jLabel26.setPreferredSize(new java.awt.Dimension(110, 17));
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 11, 50, 30));

        jtfTenSp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfTenSp.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel8.add(jtfTenSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

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

        jtfMaTh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfMaTh.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel8.add(jtfMaTh, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Màu Sắc");
        jLabel29.setPreferredSize(new java.awt.Dimension(180, 17));
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 97, -1));

        jcbMauSac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbMauSac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Danh sách màu", " " }));
        jcbMauSac.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel8.add(jcbMauSac, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 200, -1));

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
        jLabel27.setText("Dung lượng");
        jLabel27.setPreferredSize(new java.awt.Dimension(110, 17));
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jtfDungLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfDungLuong.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel8.add(jtfDungLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Đơn giá");
        jLabel30.setPreferredSize(new java.awt.Dimension(110, 17));
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 137, 60, 20));

        jtfDonGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfDonGia.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel8.add(jtfDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

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

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Khuyến mãi");
        jLabel31.setPreferredSize(new java.awt.Dimension(110, 17));
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 187, -1, 30));

        jtfKhuyenMai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfKhuyenMai.setPreferredSize(new java.awt.Dimension(200, 30));
        jtfKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfKhuyenMaiActionPerformed(evt);
            }
        });
        jPanel8.add(jtfKhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("SL tồn kho");
        jLabel32.setPreferredSize(new java.awt.Dimension(125, 17));
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 187, 80, 30));

        jtfSl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfSl.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel8.add(jtfSl, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

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

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cartadd.png"))); // NOI18N
        jButton3.setText("Thêm");
        jButton3.setPreferredSize(new java.awt.Dimension(110, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cartdelete.png"))); // NOI18N
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

        jPanel1.add(jPanel6, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfKhuyenMaiActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
//            java.util.logging.Logger.getLogger(GUI_ThongTinMuaSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUI_ThongTinMuaSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUI_ThongTinMuaSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUI_ThongTinMuaSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                GUI_ThongTinMuaSanPham dialog = new GUI_ThongTinMuaSanPham(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
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
    private javax.swing.JComboBox<String> jcbMauSac;
    private javax.swing.JLabel jlbHinhAnh;
    private javax.swing.JTextField jtfDonGia;
    private javax.swing.JTextField jtfDungLuong;
    private javax.swing.JTextField jtfKhuyenMai;
    private javax.swing.JTextField jtfMaSp;
    private javax.swing.JTextField jtfMaTh;
    private javax.swing.JTextField jtfSl;
    private javax.swing.JTextField jtfTenSp;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}