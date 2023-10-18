/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI_QuanLy;

import BUS.BUS_NhaCc;
import DTO.DTO_NhaCc;
import DTO.DTO_NhanVien;
import QLController.QuanLyNhaCcController;
import java.util.Calendar;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class GUI_ThongTinNcc extends javax.swing.JFrame {

    /**
     * Creates new form GUI_ThongTinNcc2
     */
    QuanLyNhaCcController ql;
    DTO_NhaCc nv= new DTO_NhaCc();
    private BUS_NhaCc nccbus=new BUS_NhaCc();
    public GUI_ThongTinNcc(DTO_NhaCc ncc,QuanLyNhaCcController ql) {
        initComponents();
        this.setLocationRelativeTo(null);
        jtfMANCC.setText(ncc.getMANCC());
        jtfTENNCC.setText(ncc.getTENNCC());
        jtfSDT.setText(ncc.getSDTNCC());
        jtfDIACHI.setText(ncc.getDIACHI());
        this.ql=ql;
        
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
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jtfMANCC = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jtfTENNCC = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jtfSDT = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfDIACHI = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnLuu = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(734, 400));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel1formComponentHidden(evt);
            }
        });
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(697, 400));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(697, 300));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel8.setOpaque(false);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Mã Nhà cung cấp");
        jLabel25.setPreferredSize(new java.awt.Dimension(110, 17));

        jtfMANCC.setEnabled(false);
        jtfMANCC.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Tên Nhà cung cấp");
        jLabel26.setPreferredSize(new java.awt.Dimension(110, 17));

        jtfTENNCC.setEnabled(false);
        jtfTENNCC.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("SĐT ");
        jLabel27.setPreferredSize(new java.awt.Dimension(110, 17));

        jtfSDT.setEnabled(false);
        jtfSDT.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Địa chỉ");
        jLabel33.setPreferredSize(new java.awt.Dimension(110, 17));

        jtfDIACHI.setColumns(20);
        jtfDIACHI.setRows(5);
        jtfDIACHI.setEnabled(false);
        jtfDIACHI.setPreferredSize(new java.awt.Dimension(200, 80));
        jScrollPane1.setViewportView(jtfDIACHI);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfMANCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jtfTENNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfMANCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jtfTENNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(32, 32, 32)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel8);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.BorderLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(17, 153, 142));
        kGradientPanel1.setkStartColor(new java.awt.Color(17, 153, 142));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1000, 70));
        kGradientPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NHÀ CUNG CẤP");
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 44));
        jLabel1.setPreferredSize(new java.awt.Dimension(650, 44));
        kGradientPanel1.add(jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross32.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel2);

        jPanel4.add(kGradientPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(17, 153, 142));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        btnLuu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/luuFile.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.setPreferredSize(new java.awt.Dimension(100, 40));
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel5.add(btnLuu);

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/chinhSua1.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setPreferredSize(new java.awt.Dimension(100, 40));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel5.add(btnSua);

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Xoa32.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setPreferredSize(new java.awt.Dimension(100, 40));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel5.add(btnXoa);

        jPanel2.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1formComponentHidden

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        jtfTENNCC.setEnabled(true);
        jtfSDT.setEnabled(true);
        jtfDIACHI.setEnabled(true);
    }//GEN-LAST:event_btnSuaActionPerformed
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
    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if(evt.getSource()==btnLuu){
        
         if(jtfTENNCC.getText().equals("") || jtfDIACHI.getText().equals("") )
             JOptionPane.showMessageDialog(rootPane, "Thông tin chưa đầy đủ !");
          else
             if(!check_NumberPhone(jtfSDT.getText()))
            JOptionPane.showMessageDialog(rootPane, "Số điện thoại không hợp lệ !");    
             else{
                    DTO_NhaCc NhanVien = new DTO_NhaCc();
                    NhanVien.setMANCC(jtfMANCC.getText());
                    NhanVien.setTENNCC(jtfTENNCC.getText());
                    NhanVien.setSDTNCC(jtfSDT.getText());
                    NhanVien.setDIACHI(jtfDIACHI.getText());
                    NhanVien.setTRANGTHAI(1);
                    if(nccbus.updateNhaCc(NhanVien))
                            {JOptionPane.showMessageDialog(rootPane, "Chỉnh sửa thành công !");
                            ql.setDateToTable();
                            this.setVisible(false);}
                    else
                            JOptionPane.showMessageDialog(rootPane, "Chỉnh sửa thất bại !");
                            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        nv.setTRANGTHAI(0);
        if(nccbus.updateNhaCc(nv))
               {JOptionPane.showMessageDialog(rootPane, "Xóa thành công !");
                ql.setDateToTable();
                this.setVisible(false);}
             else
                JOptionPane.showMessageDialog(rootPane, "Xóa thất bại !");
        
    }//GEN-LAST:event_btnXoaActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtfDIACHI;
    private javax.swing.JTextField jtfMANCC;
    private javax.swing.JTextField jtfSDT;
    private javax.swing.JTextField jtfTENNCC;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
