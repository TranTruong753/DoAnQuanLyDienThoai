/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI_QuanLy;

import BUS.BUS_NhanVien;
import BUS.BUS_TaiKhoan;
import DAL.DAL_NhanVien;
import DAL.DAL_TaiKhoan;
import DTO.DTO_NhanVien;
import DTO.DTO_TaiKhoan;
import QLController.QuanLyNhanVienController;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class GUI_ThemThongTinNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form GUI_ThongTinNhanVien2
     */
    QuanLyNhanVienController ql;
    BUS_TaiKhoan tk=new BUS_TaiKhoan();
    BUS_NhanVien nvbus=new BUS_NhanVien();
    public GUI_ThemThongTinNhanVien(QuanLyNhanVienController ql) {
        initComponents();
        setLocationRelativeTo(null) ;
        this.ql=ql;
        int t =nvbus.getList().size()+1;
        int h=t;
            if(t<10)
                jtfMANV.setText("NV0"+t);
            else
                jtfMANV.setText("NV"+t);  
    }
    public java.sql.Date cover(java.util.Date d){
        return new java.sql.Date(d.getTime());
    }
    public boolean check_NumberPhone(String str) {
      Pattern p_Viettel=Pattern.compile("^03[2-9][0-9]{8}$");
      Pattern p_Mobifone=Pattern.compile("^07(0|9|7|6|8)[0-9]{7}$");
      Pattern p_Vinaphone=Pattern.compile("^08[1-5][0-9]{7}$");
      Pattern p_Vietnamobile=Pattern.compile("^05(6|8)[0-9]{7}$");
      Pattern p_Gmobile=Pattern.compile("^059[0-9]{7}$");
        
        
        if(str.length()==10 && str.indexOf("0")==0 )
        {
            return true;
            
        }else
        {
            return false;
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtGioiTinh = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jtfMANV = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jtfTENNV = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jtfSDT = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jcalendar = new com.toedter.calendar.JDateChooser();
        jPanel10 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jrdNAM = new javax.swing.JRadioButton();
        jrdNU = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDIACHI = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jbtthem = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(694, 489));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(680, 574));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel8.setOpaque(false);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Mã Nhân Viên");
        jLabel25.setPreferredSize(new java.awt.Dimension(110, 17));

        jtfMANV.setEnabled(false);
        jtfMANV.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Tên Nhân viên");
        jLabel26.setPreferredSize(new java.awt.Dimension(110, 17));

        jtfTENNV.setPreferredSize(new java.awt.Dimension(200, 30));

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

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("SĐT");
        jLabel27.setPreferredSize(new java.awt.Dimension(110, 17));

        jtfSDT.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Ngày sinh");
        jLabel30.setPreferredSize(new java.awt.Dimension(110, 17));

        jcalendar.setPreferredSize(new java.awt.Dimension(200, 30));

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

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Giới tính");
        jLabel31.setPreferredSize(new java.awt.Dimension(110, 17));

        gbtGioiTinh.add(jrdNAM);
        jrdNAM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrdNAM.setText("Nam");

        gbtGioiTinh.add(jrdNU);
        jrdNU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrdNU.setText("Nữ");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Địa chỉ");
        jLabel33.setPreferredSize(new java.awt.Dimension(110, 17));

        jtaDIACHI.setColumns(20);
        jtaDIACHI.setRows(5);
        jtaDIACHI.setPreferredSize(new java.awt.Dimension(200, 80));
        jScrollPane1.setViewportView(jtaDIACHI);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jtfMANV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jtfTENNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jtfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jcalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jrdNAM)
                                .addGap(18, 18, 18)
                                .addComponent(jrdNU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfMANV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTENNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jrdNAM)
                        .addComponent(jrdNU)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.BorderLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(17, 153, 142));
        kGradientPanel1.setkStartColor(new java.awt.Color(17, 153, 142));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1000, 70));

        jLabel5.setPreferredSize(new java.awt.Dimension(32, 32));
        kGradientPanel1.add(jLabel5);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NHÂN VIÊN");
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 44));
        kGradientPanel1.add(jLabel1);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross32.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel4);

        jPanel4.add(kGradientPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(17, 153, 142));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        jbtthem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/themNhanVien.png"))); // NOI18N
        jbtthem.setText("Thêm");
        jbtthem.setPreferredSize(new java.awt.Dimension(110, 40));
        jbtthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtthemActionPerformed(evt);
            }
        });
        jPanel5.add(jbtthem);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/xoaNhanVien.png"))); // NOI18N
        jButton4.setText("Hủy");
        jButton4.setPreferredSize(new java.awt.Dimension(100, 40));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);

        jPanel2.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:    
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked
    private static boolean is18YearsOld(Date dateOfBirth, Date currentDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfBirth);
        calendar.add(Calendar.YEAR, 18);

        return currentDate.compareTo(calendar.getTime()) >= 0;
    }
    private void jbtthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtthemActionPerformed
     if(evt.getSource()==jbtthem){
         Calendar currentCalendar = Calendar.getInstance();
         if(jtfTENNV.getText().equals("") || jtaDIACHI.getText().equals("") || (!jrdNAM.isSelected() && !jrdNU.isSelected()) || jcalendar.getDate()==null)
             JOptionPane.showMessageDialog(rootPane, "Thông tin chưa đầy đủ !");
         else
             if(!is18YearsOld(jcalendar.getDate(), currentCalendar.getTime()))
                 JOptionPane.showMessageDialog(rootPane, "Nhân viên chưa đủ tuổi !");
          else
             if(!check_NumberPhone(jtfSDT.getText()))
            JOptionPane.showMessageDialog(rootPane, "Số điện thoại không hợp lệ !");
            else{
                 DTO_NhanVien nv =new DTO_NhanVien();
                 nv.setMANV(jtfMANV.getText());
                 nv.setTENNV(jtfTENNV.getText());
                 nv.setSDT(jtfSDT.getText());
                 nv.setDIACHI(jtaDIACHI.getText());
                 if(jrdNAM.isSelected())
                     nv.setGIOITINH("Nam");
                 else
                     nv.setGIOITINH("Nữ");
                 nv.setNGAYSINH(cover(jcalendar.getDate()));
                 nv.setTRANGTHAI(1);
                 if(nvbus.addNhanVien(nv))
                 {JOptionPane.showMessageDialog(rootPane, "Thêm nhân viên thành công !");
                  DTO_TaiKhoan tkadd =new DTO_TaiKhoan();
                    tkadd.setTENDN(jtfMANV.getText());
                    tkadd.setMANV(jtfMANV.getText());
                    tkadd.setMK("123456789Aa@");
                    tkadd.setPQ("Nhân viên");
                    tk.addTaiKhoan(tkadd);
                  ql.setDateToTable();
                  int t =nvbus.getList().size()+1;
       
                  if(t<10)
                    jtfMANV.setText("NV0"+t);
                  else
                    jtfMANV.setText("NV"+t);
                  jtfTENNV.setText("");
                  jtfSDT.setText("");
                  jtaDIACHI.setText("");
                  jcalendar.setDate(null);
                  
  
                 }
                 
             
         }
     }
    }//GEN-LAST:event_jbtthemActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup gbtGioiTinh;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtthem;
    private com.toedter.calendar.JDateChooser jcalendar;
    private javax.swing.JRadioButton jrdNAM;
    private javax.swing.JRadioButton jrdNU;
    private javax.swing.JTextArea jtaDIACHI;
    private javax.swing.JTextField jtfMANV;
    private javax.swing.JTextField jtfSDT;
    private javax.swing.JTextField jtfTENNV;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
