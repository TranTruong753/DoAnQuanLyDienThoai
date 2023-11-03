/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI_QuanLy;

import BUS.BUS_NhaCc;
import DAL.DAL_NhanVien;
import DTO.DTO_NhaCc;
import DTO.DTO_NhanVien;
import QLController.QuanLyPhieuNhapController;
import QLController.QuanLyNhaCcController;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
public class GUI_QuanLyNCC extends javax.swing.JPanel {
    
    //private GUI_HoaDonXacNhanNhapHang nhapHang ;
    private  GUI_XacNhanNhapHang xnNhapHang;
    private GUI_ThemThongTinNcc themNcc ;
    /**
     * Creates new form GUI_QuanLyNCC
     */
     private BUS_NhaCc nccbus=new BUS_NhaCc();
     QuanLyNhaCcController controller;
     QuanLyPhieuNhapController controllerpn;
    public GUI_QuanLyNCC() {
        initComponents();
        controller = new QuanLyNhaCcController(jpnView, btnThem, jtfTim,btnXuatfile,this);
        controller.setDateToTable();
        controller.setEvent();
        controllerpn=new QuanLyPhieuNhapController(jpnView1, btnNhap, jtfTim1, btnXuat1, this);
        controllerpn.setDateToTable();
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
        QuanlyNhaCungCap = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jtfTim = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnNhapfile = new javax.swing.JButton();
        btnXuatfile = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jpnView = new javax.swing.JPanel();
        QuanlyHoaDonGiaoHang = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jtfTim1 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btnNhap = new javax.swing.JButton();
        btnXuat1 = new javax.swing.JButton();
        btnXuat = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jpnView1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1250, 789));
        setLayout(new java.awt.BorderLayout());

        QuanlyNhaCungCap.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(1432, 70));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jtfTim.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel6.add(jtfTim);

        QuanlyNhaCungCap.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(17, 153, 142));
        jPanel7.setPreferredSize(new java.awt.Dimension(1432, 20));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        QuanlyNhaCungCap.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel8.setBackground(new java.awt.Color(17, 153, 142));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel8.setPreferredSize(new java.awt.Dimension(230, 529));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/themKieu1.png"))); // NOI18N
        btnThem.setText("THÊM");
        btnThem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThem.setPreferredSize(new java.awt.Dimension(140, 50));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel8.add(btnThem);

        btnNhapfile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNhapfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addFile.png"))); // NOI18N
        btnNhapfile.setText("NHẬP FILE");
        btnNhapfile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNhapfile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNhapfile.setPreferredSize(new java.awt.Dimension(140, 50));
        btnNhapfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapfileActionPerformed(evt);
            }
        });
        jPanel8.add(btnNhapfile);

        btnXuatfile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXuatfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/xuatFile.png"))); // NOI18N
        btnXuatfile.setText("XUẤT FILE");
        btnXuatfile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnXuatfile.setPreferredSize(new java.awt.Dimension(140, 50));
        btnXuatfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatfileActionPerformed(evt);
            }
        });
        jPanel8.add(btnXuatfile);

        QuanlyNhaCungCap.add(jPanel8, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        QuanlyNhaCungCap.add(jPanel2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab(" Quản lý nhà cung cấp", QuanlyNhaCungCap);

        QuanlyHoaDonGiaoHang.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel9.setPreferredSize(new java.awt.Dimension(1432, 70));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jtfTim1.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel9.add(jtfTim1);

        QuanlyHoaDonGiaoHang.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(17, 153, 142));
        jPanel10.setPreferredSize(new java.awt.Dimension(1432, 20));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        QuanlyHoaDonGiaoHang.add(jPanel10, java.awt.BorderLayout.PAGE_END);

        jPanel11.setBackground(new java.awt.Color(17, 153, 142));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel11.setPreferredSize(new java.awt.Dimension(230, 529));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        btnNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/themSanPham2.png"))); // NOI18N
        btnNhap.setText("NHẬP HÀNG");
        btnNhap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNhap.setPreferredSize(new java.awt.Dimension(140, 50));
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });
        jPanel11.add(btnNhap);

        btnXuat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/xuatFile.png"))); // NOI18N
        btnXuat1.setText("XUẤT FILE");
        btnXuat1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnXuat1.setPreferredSize(new java.awt.Dimension(140, 50));
        jPanel11.add(btnXuat1);

        btnXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addFile.png"))); // NOI18N
        btnXuat.setText("NHẬP FILE");
        btnXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnXuat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnXuat.setPreferredSize(new java.awt.Dimension(140, 50));
        jPanel11.add(btnXuat);

        QuanlyHoaDonGiaoHang.add(jPanel11, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hóa đơn giao hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        javax.swing.GroupLayout jpnView1Layout = new javax.swing.GroupLayout(jpnView1);
        jpnView1.setLayout(jpnView1Layout);
        jpnView1Layout.setHorizontalGroup(
            jpnView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jpnView1Layout.setVerticalGroup(
            jpnView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnView1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnView1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        QuanlyHoaDonGiaoHang.add(jPanel4, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Hóa đơn giao hàng", QuanlyHoaDonGiaoHang);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapActionPerformed
        // TODO add your handling code here:
//        nhapHang = new GUI_HoaDonXacNhanNhapHang();
//        nhapHang.setVisible(true);
          xnNhapHang = new GUI_XacNhanNhapHang(this, true);
          xnNhapHang.setVisible(true);
    }//GEN-LAST:event_btnNhapActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
     
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnNhapfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapfileActionPerformed
       nccbus.themDS();
            controller.setDateToTable();
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
                    cell.setCellValue("Mã nhà cung cấp");
                    cell=headerRow.createCell(2,CellType.STRING);
                    cell.setCellValue("Tên nhà cung cấp");
                    cell=headerRow.createCell(3,CellType.STRING);
                    cell.setCellValue("Số điện thoại");
                    cell=headerRow.createCell(4,CellType.STRING);
                    cell.setCellValue("địa chỉ");
//                    row =sheet.createRow(7);
                    BUS_NhaCc ncc =new BUS_NhaCc();
                    List<DTO_NhaCc> listItem= ncc.getList();
                    List<DTO_NhaCc> listItem1=new ArrayList<>();
                    for (int i=0;i<listItem.size();i++){
                        if(listItem.get(i).getTRANGTHAI()==1)
                            listItem1.add(listItem.get(i));
                    }
                    if (listItem1 != null){
                        int s=listItem1.size();
                        
                        for (int i=0;i<s;i++){
                            DTO_NhaCc sanpham=  listItem1.get(i);
                            if(sanpham.getTRANGTHAI()==1){
                            row =sheet.createRow(i+1);
                            cell=row.createCell(0,CellType.NUMERIC);
                            cell.setCellValue(i+1);
                            cell=row.createCell(1,CellType.STRING);
                            cell.setCellValue(sanpham.getMANCC());
                            cell=row.createCell(2,CellType.STRING);
                            cell.setCellValue(sanpham.getTENNCC());
                            cell=row.createCell(3,CellType.STRING);
                            cell.setCellValue(sanpham.getSDTNCC());
                            cell=row.createCell(4,CellType.STRING);
                            cell.setCellValue(sanpham.getDIACHI());}
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel QuanlyHoaDonGiaoHang;
    private javax.swing.JPanel QuanlyNhaCungCap;
    private javax.swing.JButton btnNhap;
    private javax.swing.JButton btnNhapfile;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXuat;
    private javax.swing.JButton btnXuat1;
    private javax.swing.JButton btnXuatfile;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpnView;
    private javax.swing.JPanel jpnView1;
    private javax.swing.JTextField jtfTim;
    private javax.swing.JTextField jtfTim1;
    // End of variables declaration//GEN-END:variables
}
