/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI_QuanLy;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class GUI_QuanLySPvaKM extends javax.swing.JPanel {
    public GUI_QuanLySanPham guiSanPham ;
    public GUI_QuanLyKhuyenMai guiKhuyenMai = new GUI_QuanLyKhuyenMai();
    GUI_TrangChuBanHang panelBanHang;
    /**
     * Creates new form GUI_QuanLySPvaKM
     */
    public GUI_QuanLySPvaKM(GUI_TrangChuBanHang panelBanHang) {
        initComponents();
        this.panelBanHang=panelBanHang;
        guiSanPham = new GUI_QuanLySanPham(panelBanHang);
        jTabbedPane1.addTab(" Quản lý Sản Phẩm", guiSanPham);
        jTabbedPane1.addTab("Quản lý Khuyến Mãi", guiKhuyenMai);
//        
    }

    public GUI_QuanLySanPham getGuiSanPham() {
        return guiSanPham;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();

        setPreferredSize(new java.awt.Dimension(1250, 789));
        setLayout(new java.awt.BorderLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
