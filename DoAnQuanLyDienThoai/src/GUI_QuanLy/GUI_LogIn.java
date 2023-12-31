/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI_QuanLy;

import BUS.BUS_NhanVien;
import BUS.BUS_TaiKhoan;
import DTO.DTO_NhanVien;
import DTO.DTO_TaiKhoan;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class GUI_LogIn extends javax.swing.JFrame {
   
    
    private DTO_TaiKhoan tk = new DTO_TaiKhoan();
    private DTO_NhanVien nv = new DTO_NhanVien();
    private BUS_TaiKhoan tkBus = new BUS_TaiKhoan();
    private BUS_NhanVien nvBus = new BUS_NhanVien();
    public GUI_LogIn() {       
        initComponents();
        setLocationRelativeTo(null) ;
        btn_login.setBackground(Color.WHITE);     
        btn_close.setBackground(Color.WHITE);
        KeyStroke enterKey = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0);
        btn_login.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(enterKey, "login");
        btn_login.getActionMap().put("login", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_loginActionPerformed(e);
            }
        });       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel_right = new keeptoo.KGradientPanel();
        jPanel6 = new RoundedPanel(100, Color.WHITE);
        jLabel7 = new javax.swing.JLabel();
        jLabel_login = new javax.swing.JLabel();
        jPanel_left = new javax.swing.JPanel();
        jPanel_left_center = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfTK = new javax.swing.JTextField();
        jlbMsgMiss = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfMK = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jlbMsgMissMk = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel_left_bot = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btn_login = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnDoiMK = new javax.swing.JLabel();
        jPanel_left_top = new javax.swing.JPanel();
        btn_close = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(253, 253, 253));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(17, 153, 142)));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));

        kGradientPanel_right.setkEndColor(new java.awt.Color(17, 153, 142));
        kGradientPanel_right.setkStartColor(new java.awt.Color(17, 153, 142));
        kGradientPanel_right.setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel6.setBackground(new java.awt.Color(253, 253, 253));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel7.setBackground(new java.awt.Color(253, 253, 253));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bg-store-350.jpg"))); // NOI18N

        jLabel_login.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_login.setForeground(new java.awt.Color(17, 153, 142));
        jLabel_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_login.setText("DEVSTORE");
        jLabel_login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(17, 153, 142), 2, true));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel_login, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel_login)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout kGradientPanel_rightLayout = new javax.swing.GroupLayout(kGradientPanel_right);
        kGradientPanel_right.setLayout(kGradientPanel_rightLayout);
        kGradientPanel_rightLayout.setHorizontalGroup(
            kGradientPanel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel_rightLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        kGradientPanel_rightLayout.setVerticalGroup(
            kGradientPanel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel_rightLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_left.setBackground(new java.awt.Color(253, 253, 253));
        jPanel_left.setLayout(new java.awt.BorderLayout());

        jPanel_left_center.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_left_center.setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(253, 253, 253));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(7, 1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Login");
        jLabel6.setMaximumSize(new java.awt.Dimension(66, 50));
        jLabel6.setPreferredSize(new java.awt.Dimension(66, 50));
        jPanel2.add(jLabel6);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("User");
        jPanel2.add(jLabel3);

        jtfTK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfTK.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(204, 204, 204)));
        jtfTK.setOpaque(true);
        jPanel2.add(jtfTK);

        jlbMsgMiss.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbMsgMiss.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(jlbMsgMiss);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel2.add(jLabel4);

        jtfMK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfMK.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jtfMK);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        jlbMsgMissMk.setBackground(new java.awt.Color(223, 223, 223));
        jlbMsgMissMk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbMsgMissMk.setForeground(new java.awt.Color(255, 0, 51));
        jPanel3.add(jlbMsgMissMk);

        jCheckBox1.setBackground(new java.awt.Color(253, 253, 253));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox1.setText("Show password");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/invisible.png"))); // NOI18N
        jCheckBox1.setRolloverEnabled(false);
        jCheckBox1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/visible.png"))); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox1);

        jPanel2.add(jPanel3);

        javax.swing.GroupLayout jPanel_left_centerLayout = new javax.swing.GroupLayout(jPanel_left_center);
        jPanel_left_center.setLayout(jPanel_left_centerLayout);
        jPanel_left_centerLayout.setHorizontalGroup(
            jPanel_left_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_left_centerLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel_left_centerLayout.setVerticalGroup(
            jPanel_left_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_left_centerLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel_left.add(jPanel_left_center, java.awt.BorderLayout.CENTER);

        jPanel_left_bot.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_left_bot.setOpaque(false);
        jPanel_left_bot.setPreferredSize(new java.awt.Dimension(468, 100));
        jPanel_left_bot.setLayout(new java.awt.GridLayout(2, 1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);

        btn_login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_login.setText("Đăng nhập");
        btn_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.setPreferredSize(new java.awt.Dimension(150, 35));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel4.add(btn_login);

        jPanel_left_bot.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setOpaque(false);

        btnDoiMK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoiMK.setText("Đổi mật khẩu");
        btnDoiMK.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnDoiMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoiMKMouseClicked(evt);
            }
        });
        jPanel5.add(btnDoiMK);

        jPanel_left_bot.add(jPanel5);

        jPanel_left.add(jPanel_left_bot, java.awt.BorderLayout.PAGE_END);

        jPanel_left_top.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_left_top.setOpaque(false);
        jPanel_left_top.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 0));

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross32.png"))); // NOI18N
        btn_close.setBorder(null);
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_close.setOpaque(true);
        btn_close.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        jPanel_left_top.add(btn_close);

        jPanel_left.add(jPanel_left_top, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel_right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_left, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(kGradientPanel_right, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
            this.jtfMK.setEchoChar((char)0);
        }
        else
            this.jtfMK.setEchoChar('*');
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == btn_login){
            if(jtfTK.getText().isEmpty()){
                jlbMsgMissMk.setText("");
                jlbMsgMiss.setText("Vui lòng nhập Tên người dùng!");
                if(laymk().isEmpty()){
                    jlbMsgMissMk.setText("Vui lòng nhập Mật khẩu!");
                }
            }
            else if(laymk().isEmpty()){
                jlbMsgMiss.setText("");
                jlbMsgMissMk.setText("Vui lòng nhập Mật khẩu!");
                if(jtfTK.getText().isEmpty()){
                    jlbMsgMiss.setText("Vui lòng nhập Tài khoản!");
                }
            }
            if(!jtfTK.getText().isEmpty()&&!laymk().isEmpty()){
                jlbMsgMissMk.setText("");
                jlbMsgMiss.setText("");
                if(timTk(jtfTK.getText(), laymk())){
                    GUI_GiaoDienChinh giaoDienChinh = new GUI_GiaoDienChinh(tk,nv,this);
                    //JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công!");                
                    giaoDienChinh.setVisible(true);
                    this.jtfMK.setText("");
                    this.dispose();
                }
                
            }
            
        }

    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
         if (JOptionPane.showConfirmDialog(this, 
            "Bạn có muốn thoát?", "Close Đăng nhập?", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btn_closeMouseClicked

    private void btnDoiMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMKMouseClicked
        new GUI_SignUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDoiMKMouseClicked

    public String laymk(){
        char[] passwordChars = jtfMK.getPassword();
        String password = new String(passwordChars);
        return password;

    }
    
    public boolean timTk(String tdn, String mk){
        tk = new DTO_TaiKhoan();
        nv = new DTO_NhanVien(); 
        tk = tkBus.login(tdn, mk);
        
        if(tk==null){
            JOptionPane.showMessageDialog(rootPane, "Tài khoản và mật khẩu không đúng mời bạn nhập lại!","Thông báo", JOptionPane.WARNING_MESSAGE);      
            return false;
        }           
        else{
            nv = nvBus.login(tk.getMANV());
            if(nv==null){
                JOptionPane.showMessageDialog(rootPane, "Nhân viên của tài khoản này đã bị xóa khỏi danh sách!","Thông báo", JOptionPane.WARNING_MESSAGE);       
               return false;
            }
                
        }
        return true;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDoiMK;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_login;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_login;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel_left;
    private javax.swing.JPanel jPanel_left_bot;
    private javax.swing.JPanel jPanel_left_center;
    private javax.swing.JPanel jPanel_left_top;
    private javax.swing.JLabel jlbMsgMiss;
    private javax.swing.JLabel jlbMsgMissMk;
    private javax.swing.JPasswordField jtfMK;
    private javax.swing.JTextField jtfTK;
    private keeptoo.KGradientPanel kGradientPanel_right;
    // End of variables declaration//GEN-END:variables
class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
    }
}
