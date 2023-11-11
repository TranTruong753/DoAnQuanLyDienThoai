/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI_QuanLy;

import BUS.BUS_SanPham;
import DAL.DAL_SanPham;
import DTO.*;
import DTO.*;
import QLController.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Admin
 */
public class GUI_QuanLySanPham extends javax.swing.JPanel {
    
    private GUI_ThemThongTinSanPham themSp ;
    private QuanLySanPhamControllerfix qlf ;
    private BUS_SanPham spBus = new BUS_SanPham();
    private GUI_TrangChuBanHang panelBanHang ;
    
    public GUI_QuanLySanPham(GUI_TrangChuBanHang panelBanHang) {
        initComponents();       
        qlf = new QuanLySanPhamControllerfix(jPanel9, btnThem, jtfTim,btnXuatfile,this, panelBanHang);
        qlf.setDateToTable();
        this.panelBanHang = panelBanHang;
    }

    public QuanLySanPhamControllerfix getQlf() {
        return qlf;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuanlySanPham = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jtfTim = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnNhapfile = new javax.swing.JButton();
        btnXuatfile = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jpnView = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        QuanlySanPham.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(1432, 70));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jtfTim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfTim.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(204, 204, 204)));
        jtfTim.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel6.add(jtfTim);

        QuanlySanPham.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(17, 153, 142));
        jPanel7.setPreferredSize(new java.awt.Dimension(1432, 20));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1432, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        QuanlySanPham.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel8.setBackground(new java.awt.Color(17, 153, 142));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel8.setPreferredSize(new java.awt.Dimension(230, 529));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/themSanPham2.png"))); // NOI18N
        btnThem.setText("THÊM SP ");
        btnThem.setPreferredSize(new java.awt.Dimension(170, 50));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel8.add(btnThem);

        btnNhapfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNhapfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addFile.png"))); // NOI18N
        btnNhapfile.setText("NHẬP FILE");
        btnNhapfile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNhapfile.setPreferredSize(new java.awt.Dimension(170, 50));
        btnNhapfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapfileActionPerformed(evt);
            }
        });
        jPanel8.add(btnNhapfile);

        btnXuatfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXuatfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/xuatFile.png"))); // NOI18N
        btnXuatfile.setText("XUẤT FILE");
        btnXuatfile.setPreferredSize(new java.awt.Dimension(170, 50));
        btnXuatfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatfileActionPerformed(evt);
            }
        });
        jPanel8.add(btnXuatfile);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("THƯƠNG HIỆU");
        jButton1.setPreferredSize(new java.awt.Dimension(170, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1);

        QuanlySanPham.add(jPanel8, java.awt.BorderLayout.LINE_END);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        QuanlySanPham.add(jPanel9, java.awt.BorderLayout.CENTER);

        add(QuanlySanPham, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        themSp = new GUI_ThemThongTinSanPham(qlf,this.panelBanHang);
        themSp.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnNhapfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapfileActionPerformed
    if(evt.getSource()==btnNhapfile){
        try {
            spBus.themDS();
        } catch (IOException ex) {
            Logger.getLogger(GUI_QuanLySanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
            qlf.setDateToTable();    
            panelBanHang.load();
        }
    }//GEN-LAST:event_btnNhapfileActionPerformed

    private void btnXuatfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatfileActionPerformed
    try{    
                    System.out.println("xuat");
                    XSSFWorkbook workbook =new XSSFWorkbook();
                    XSSFSheet sheet =workbook.createSheet("Sản phẩm");
                    XSSFRow headerRow = sheet.createRow(0);
                    XSSFRow row=null;
                    Cell cell=null;
                    
                    cell=headerRow.createCell(0,CellType.STRING);
                    cell.setCellValue("STT");
                    cell=headerRow.createCell(1,CellType.STRING);
                    cell.setCellValue("Mã sản phẩm");
                    cell=headerRow.createCell(2,CellType.STRING);
                    cell.setCellValue("Tên sản phẩm");
                    cell=headerRow.createCell(3,CellType.STRING);
                    cell.setCellValue("Mã thương hiệu");
                    cell=headerRow.createCell(4,CellType.STRING);
                    cell.setCellValue("Màu sắc");
                    cell=headerRow.createCell(5,CellType.STRING);
                    cell.setCellValue("Dung lượng");
                    cell=headerRow.createCell(6,CellType.STRING);
                    cell.setCellValue("Đơn giá");                 
                    cell=headerRow.createCell(7,CellType.STRING);
                    cell.setCellValue("Số lượng tồn");
                    cell=headerRow.createCell(8,CellType.STRING);
                    cell.setCellValue("Đường dẫn hình ảnh");
//                    row =sheet.createRow(7);
                    DAL_SanPham sanPhamService = new DAL_SanPham();
                    List<DTO_SanPham> listItem= sanPhamService.getList();
                    List<DTO_SanPham> listItem1=new ArrayList<>();
                    for (int i=0;i<listItem.size();i++){
                        if(listItem.get(i).getTrangThai()==1)
                            listItem1.add(listItem.get(i));
                    }
                    if (listItem1 != null){
                        int s=listItem1.size();
                        
                        for (int i=0;i<s;i++){
                            DTO_SanPham sanpham=  listItem1.get(i);
                            if(sanpham.getTrangThai()==1){
                            row =sheet.createRow(i+1);
                            cell=row.createCell(0,CellType.NUMERIC);
                            cell.setCellValue(i+1);
                            cell=row.createCell(1,CellType.STRING);
                            cell.setCellValue(sanpham.getMaSp());
                            cell=row.createCell(2,CellType.STRING);
                            cell.setCellValue(sanpham.getTenSp());
                            cell=row.createCell(3,CellType.STRING);
                            cell.setCellValue(sanpham.getMaThuongHieu());
                            cell=row.createCell(4,CellType.STRING);
                            cell.setCellValue(sanpham.getMauSac());
                            cell=row.createCell(5,CellType.STRING);
                            cell.setCellValue(sanpham.getDungLuong());
                            cell=row.createCell(6,CellType.STRING);
                            cell.setCellValue(sanpham.getDonGia());
                            cell=row.createCell(7,CellType.STRING);
                            cell.setCellValue(sanpham.getSoLuong());
                            cell=row.createCell(8,CellType.STRING);
                            cell.setCellValue(sanpham.getImg());
                            }
                        }

                       JFileChooser fileChooser = new JFileChooser();
                        FileNameExtensionFilter filter = new FileNameExtensionFilter("File Excel", "xlsx");
                        fileChooser.setFileFilter(filter);

                        int returnValue = fileChooser.showSaveDialog(null);
                        if (returnValue == JFileChooser.APPROVE_OPTION) {
                            String filePath = fileChooser.getSelectedFile().getAbsolutePath();

                            // Đảm bảo đuôi file .xlsx
                            if (!filePath.endsWith(".xlsx")) {
                                filePath += ".xlsx";
                            }

                            // Lưu workbook ra file theo đường dẫn và tên file của người dùng đã chọn
                            FileOutputStream fileOut;
                            try {
                                fileOut = new FileOutputStream(filePath);
                                workbook.write(fileOut);
                                fileOut.close();
                                workbook.close();
                                JOptionPane.showMessageDialog(null, "Xuất thành công", "Thông báo", JOptionPane.WARNING_MESSAGE);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        } 
                    }
                    

                }catch (Exception h){
                    h.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Xuất thất bại", "Thông báo", JOptionPane.WARNING_MESSAGE);
                }
    }//GEN-LAST:event_btnXuatfileActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GUI_DanhSachThuongHieu guiDsTh = new GUI_DanhSachThuongHieu(this, true);
        guiDsTh.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel QuanlySanPham;
    private javax.swing.JButton btnNhapfile;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXuatfile;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jpnView;
    private javax.swing.JTextField jtfTim;
    // End of variables declaration//GEN-END:variables
}
