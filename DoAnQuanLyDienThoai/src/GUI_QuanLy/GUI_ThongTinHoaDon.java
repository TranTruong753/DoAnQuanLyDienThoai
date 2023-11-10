/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI_QuanLy;

import BUS.*;
import DTO.*;
import DTO.*;
import QLController.*;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import static com.lowagie.text.PageSize.A4;
import function.*;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class GUI_ThongTinHoaDon extends javax.swing.JFrame {

   
    funcDungChung fuc = new funcDungChung();
    QuanLyCTHDController qlcthd = new QuanLyCTHDController();
    QuanLyHoaDonController ql ;
    DTO_HoaDon hd = new DTO_HoaDon();
    DTO_CTHD cthd = new DTO_CTHD();  
    private BUS_CTHD cthdbus = new BUS_CTHD();
    
    public GUI_ThongTinHoaDon(DTO_HoaDon hd,QuanLyHoaDonController ql) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.ql = ql ;
        this.hd = hd ;
        qlcthd.loadCTHoaDonList(cthdbus.timCthd(hd.getMaHD().toString()), tblCTHD);
        this.viewThongTinHd();
    }

    public void viewThongTinHd(){
        jtfMaHd.setEditable(false);
        jtfMaNv.setEditable(false);
        jtfMaKh.setEditable(false);
        jtfTongTien.setEditable(false);
        jtfTongThanhToan.setEditable(false);
        jtfKhachDua.setEditable(false);
        jtfThoiLai.setEditable(false);
        jtfGiamGia.setEditable(false);
        jdcNgayLap.setEnabled(false);
        jdcNgayKtBh.setEnabled(false);
        
        jtfMaHd.setText(hd.getMaHD().toString());
        jtfMaNv.setText(hd.getMaNV().toString());
        jtfMaKh.setText(hd.getMaKH().toString()); 
        
        String tongTien = fuc.doubleToFormattedString(hd.getTongTien());
        jtfTongTien.setText(tongTien);
        
        String tongTienThanhToan = fuc.doubleToFormattedString(hd.getTienThanhToan());
        jtfTongThanhToan.setText(tongTienThanhToan);
        
        String khachDua = fuc.doubleToFormattedString(hd.getTienKhach());
        jtfKhachDua.setText(khachDua);
        
        String thoiLai = fuc.doubleToFormattedString(hd.getTienThoi());    
        jtfThoiLai.setText(thoiLai);
        
        String giamGia = fuc.doubleToFormattedString(hd.getGiamGia());    
        jtfGiamGia.setText(giamGia);
        
        jdcNgayLap.setDate(hd.getNgayLap()); 
        jdcNgayKtBh.setDate(hd.getNgayKtBh());
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
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCTHD = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfMaHd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfMaNv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfMaKh = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jdcNgayLap = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfTongTien = new javax.swing.JTextField();
        jtfKhachDua = new javax.swing.JTextField();
        jtfThoiLai = new javax.swing.JTextField();
        jtfGiamGia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jdcNgayKtBh = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jtfTongThanhToan = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 633));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.BorderLayout());

        tblCTHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Số lượng", "Giá"
            }
        ));
        jScrollPane1.setViewportView(tblCTHD);

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(17, 153, 142));
        jPanel6.setPreferredSize(new java.awt.Dimension(1000, 70));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/luuFile.png"))); // NOI18N
        jButton2.setText("Lưu");
        jButton2.setPreferredSize(new java.awt.Dimension(110, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/xuatFile.png"))); // NOI18N
        jButton3.setText("Xuất");
        jButton3.setPreferredSize(new java.awt.Dimension(110, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3);

        jPanel2.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(330, 330));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mã HĐ");
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 30));

        jtfMaHd.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mã NV");
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 30));

        jtfMaNv.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mã KH");
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 30));

        jtfMaKh.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ngày lập");
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 30));

        jdcNgayLap.setDateFormatString("YYYY-MM-d");
        jdcNgayLap.setPreferredSize(new java.awt.Dimension(88, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tổng tiền");
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Khách đưa");
        jLabel9.setPreferredSize(new java.awt.Dimension(50, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Thói lại");
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Tiền thanh toán:");
        jLabel8.setPreferredSize(new java.awt.Dimension(50, 30));

        jtfTongTien.setPreferredSize(new java.awt.Dimension(64, 30));

        jtfKhachDua.setPreferredSize(new java.awt.Dimension(73, 30));

        jtfThoiLai.setPreferredSize(new java.awt.Dimension(73, 30));

        jtfGiamGia.setPreferredSize(new java.awt.Dimension(73, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Ngày kết thúc bảo hành");
        jLabel11.setPreferredSize(new java.awt.Dimension(50, 30));

        jdcNgayKtBh.setDateFormatString("YYYY-MM-d");
        jdcNgayKtBh.setPreferredSize(new java.awt.Dimension(88, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Tiền được giảm giá:");
        jLabel12.setPreferredSize(new java.awt.Dimension(50, 30));

        jtfTongThanhToan.setPreferredSize(new java.awt.Dimension(71, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtfGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(32, 32, 32)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfMaNv, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                .addComponent(jtfMaHd, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jdcNgayLap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfMaKh, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtfTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfThoiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtfTongThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcNgayKtBh, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfMaHd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMaNv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfMaKh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTongThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfThoiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcNgayKtBh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel2.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 70));
        jPanel3.setLayout(new java.awt.BorderLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(17, 153, 142));
        kGradientPanel1.setkStartColor(new java.awt.Color(17, 153, 142));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1001, 70));
        kGradientPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("HÓA ĐƠN");
        jLabel7.setPreferredSize(new java.awt.Dimension(900, 44));
        kGradientPanel1.add(jLabel7);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross32.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel10);

        jPanel3.add(kGradientPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
       this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {        
            xuatHoaDon();
        } catch (DocumentException ex) {
            Logger.getLogger(GUI_ThongTinHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcNgayKtBh;
    private com.toedter.calendar.JDateChooser jdcNgayLap;
    private javax.swing.JTextField jtfGiamGia;
    private javax.swing.JTextField jtfKhachDua;
    private javax.swing.JTextField jtfMaHd;
    private javax.swing.JTextField jtfMaKh;
    private javax.swing.JTextField jtfMaNv;
    private javax.swing.JTextField jtfThoiLai;
    private javax.swing.JTextField jtfTongThanhToan;
    private javax.swing.JTextField jtfTongTien;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tblCTHD;
    // End of variables declaration//GEN-END:variables
  public void xuatHoaDon() throws DocumentException{
      // Create a JFileChooser object
    JFileChooser fileChooser = new JFileChooser();
    // Show the dialog box to select the directory
    int userSelection = fileChooser.showSaveDialog(null);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        // Get the selected directory
        File fileToSave = fileChooser.getSelectedFile();
        //Font chữ
        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.NORMAL);
        Font font2 = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
        
        //biến
        String maHoaDon = jtfMaHd.getText();
        String maNhanVien = jtfMaNv.getText();
        String maKhachHang = jtfMaKh.getText();
        String tongTien = jtfTongTien.getText();
        String tongTienThanhToan = jtfTongThanhToan.getText();
        String giamGia = jtfGiamGia.getText();
        String khachDua = jtfKhachDua.getText();
        String thoiLai = jtfThoiLai.getText();
        String ngayLap = fuc.dateToString(hd.getNgayLap(),"yyyy-MM-dd");
        String ngayktBh = fuc.dateToString(hd.getNgayKtBh(), "yyyy-MM-dd");


        //tạo bảng
        float tableWidth = 595f; // Kích thước trang A4 (595 points)
        float[] columnWidths = {1, 2, 2, 2, 1, 2, 2}; // Tỷ lệ chiều rộng cho từng cột
        PdfPTable table = new PdfPTable(columnWidths);
        table.setTotalWidth(tableWidth);
        
             
        // Thêm các tiêu đề cho các cột trong bảng
        PdfPCell cell = new PdfPCell(new Phrase("STT", font2));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("MA HD", font2));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("MA SP", font2));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("NAME SP", font2));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("SL", font2));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("DON GIA", font2));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("THANH TIEN", font2));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell);

        // Thêm các dòng dữ liệu vào bảng
        for (int i = 0; i < tblCTHD.getRowCount(); i++) {
            String maHd = tblCTHD.getValueAt(i, 0).toString();
            String maSp = tblCTHD.getValueAt(i, 1).toString();
            String tenSp = tblCTHD.getValueAt(i, 2).toString();
            String soLuong = tblCTHD.getValueAt(i, 3).toString();
            String donGia = tblCTHD.getValueAt(i, 4).toString();
            String thanhTien = tblCTHD.getValueAt(i, 5).toString();
            
            cell = new PdfPCell(new Phrase(i+1+"",font));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(maHd,font));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase(maSp,font));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase(tenSp,font));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase(soLuong,font));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(donGia,font));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(thanhTien,font));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);
        }
        
        // thong tin hoa don
   
        PdfPTable tableNvKh = new PdfPTable(1);
        
        cell = new PdfPCell(new Phrase("Ma NV:      " + maNhanVien +"\n",font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        tableNvKh.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Ma KH:      " + maKhachHang +"\n",font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        tableNvKh.addCell(cell);
        
        //bang gia tien
        PdfPTable tableThanhtoan = new PdfPTable(2);
     
        cell = new PdfPCell(new Phrase("Tong Tien:  ",font));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        tableThanhtoan.addCell(cell);
        
        cell = new PdfPCell(new Phrase(tongTien + " VND",font));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        tableThanhtoan.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Tong Tien Thanh toan:  ",font));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        tableThanhtoan.addCell(cell);
        
        cell = new PdfPCell(new Phrase(tongTienThanhToan + " VND",font));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        tableThanhtoan.addCell(cell);
                   
        cell = new PdfPCell(new Phrase("Giam Gia:   ",font));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        tableThanhtoan.addCell(cell);
        
        cell = new PdfPCell(new Phrase(giamGia + " VND",font));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        tableThanhtoan.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Khach tra: ",font));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        tableThanhtoan.addCell(cell);
        
        cell = new PdfPCell(new Phrase(khachDua + " VND",font));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        tableThanhtoan.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Tien Thua: ",font));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        tableThanhtoan.addCell(cell);
        
        cell = new PdfPCell(new Phrase(thoiLai + " VND",font));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        tableThanhtoan.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Thoi gian ket thuc bao hanh: ",font));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        tableThanhtoan.addCell(cell);
        
        cell = new PdfPCell(new Phrase(ngayktBh,font));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        tableThanhtoan.addCell(cell);
        // Tạo đối tượng Document để lưu hóa đơn vào file PDF
        com.itextpdf.text.Document document = new com.itextpdf.text.Document(PageSize.A4);

        try {
            PdfWriter.getInstance(document, new FileOutputStream(fileToSave.getAbsolutePath() + ".pdf"));
            document.open();

            // Thêm tiêu đề của hóa đơn
            Paragraph paragraph = new Paragraph(maHoaDon, FontFactory.getFont(FontFactory.TIMES_BOLD, 24));
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            
            document.add(new Paragraph("\n"));
            
            Paragraph paragraphNgayIn = new Paragraph("NGAY LAP HOA DON: " + ngayLap, font);
            paragraphNgayIn.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraphNgayIn);
            document.add(new Paragraph("\n"));
            // tạo ké gạch
            LineSeparator lineSeparator = new LineSeparator();
            lineSeparator.setLineColor(BaseColor.LIGHT_GRAY);
            lineSeparator.setLineWidth(0.5f);
            document.add(lineSeparator);
 
            Paragraph paragraphDanhSachCthd = new Paragraph("               DANH SACH SAN PHAM: ",font);
            paragraphDanhSachCthd.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraphDanhSachCthd);
            document.add(new Paragraph("\n"));         
            document.add(table);       
            document.add(new Paragraph("\n"));       
            document.add(lineSeparator);        
            Paragraph paragraphThongTinHoaDon = new Paragraph("               THONG TIN HOA DON: ",font);
            paragraphThongTinHoaDon.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraphThongTinHoaDon);
            document.add(new Paragraph("\n"));
            document.add(tableNvKh);
            document.add(tableThanhtoan);
            document.add(new Paragraph("\n"));      
            // tạo ké gạch
            document.add(lineSeparator);
            document.add(new Paragraph("\n"));
            document.close();
            JOptionPane.showMessageDialog(null, "Xuất thành công", "Thông báo", JOptionPane.WARNING_MESSAGE);
              
            } 
        catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Xuất thất bại", "Thông báo", JOptionPane.WARNING_MESSAGE);
             
        }
    }
  }
}
