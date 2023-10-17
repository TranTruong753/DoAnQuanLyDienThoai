/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI_QuanLy;

import BUS.BUS_TaiKhoan;
import DAL.DAL_NhanVien;
import DTO.DTO_NhanVien;
import DTO.DTO_TaiKhoan;
import QLController.QuanLyNhanVienController;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
public class GUI_QuanLyNhanVien extends javax.swing.JPanel {
    private  GUI_ThemThongTinNhanVien themNV;
    /**
     * Creates new form GUI_QuanLyNhanVien
     */
    BUS_TaiKhoan tk = new BUS_TaiKhoan();
    DAL_NhanVien nvbus=new DAL_NhanVien();
    QuanLyNhanVienController controller ;
    public GUI_QuanLyNhanVien() {
        initComponents();
        controller = new QuanLyNhanVienController(jpnView, btnThem, jtfTim,btnXuatfile,this);
        controller.setDateToTable();
        controller.setEvent();    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuanlyNhanVien = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jtfTim = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnNhapfile = new javax.swing.JButton();
        btnXuatfile = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jpnView = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        QuanlyNhanVien.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(1432, 70));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jtfTim.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel6.add(jtfTim);

        QuanlyNhanVien.add(jPanel6, java.awt.BorderLayout.PAGE_START);

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

        QuanlyNhanVien.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel8.setBackground(new java.awt.Color(17, 153, 142));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel8.setPreferredSize(new java.awt.Dimension(230, 529));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/themNhanVien.png"))); // NOI18N
        btnThem.setText("THÊM ");
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

        QuanlyNhanVien.add(jPanel8, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

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

        QuanlyNhanVien.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(QuanlyNhanVien, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnNhapfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapfileActionPerformed
        if(evt.getSource()==btnNhapfile){
            nvbus.themDS();
            controller.setDateToTable();
            List<DTO_NhanVien> listItem = nvbus.getList();
            List<DTO_TaiKhoan> listtk = tk.getList();
            for(int i=0;i<listItem.size();i++){
                int dem=0;
                for(int j=0;j<listtk.size();j++){
                    if(listItem.get(i).getMANV().equals(listtk.get(j).getMANV()))
                    { dem=1;break;}
                }
                if(dem==0){
                    DTO_TaiKhoan tkadd =new DTO_TaiKhoan();
                    tkadd.setTENDN(listItem.get(i).getMANV());
                    tkadd.setMANV(listItem.get(i).getMANV());
                    tkadd.setMK("123456789Aa@");
                    tkadd.setPQ("Nhân viên");
                    tk.addTaiKhoan(tkadd);
                    
                }
            }
            
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
                    cell.setCellValue("Mã nhân viên");
                    cell=headerRow.createCell(2,CellType.STRING);
                    cell.setCellValue("Tên nhân viên");
                    cell=headerRow.createCell(3,CellType.STRING);
                    cell.setCellValue("Số điện thoại");
                    cell=headerRow.createCell(4,CellType.STRING);
                    cell.setCellValue("địa chỉ");
                    cell=headerRow.createCell(5,CellType.STRING);
                    cell.setCellValue("Giới tính");
                    cell=headerRow.createCell(6,CellType.STRING);
                    cell.setCellValue("Ngày sinh");
//                    row =sheet.createRow(7);
                    DAL_NhanVien sanPhamService = new DAL_NhanVien();
                    List<DTO_NhanVien> listItem= sanPhamService.getList();
                    List<DTO_NhanVien> listItem1=new ArrayList<>();
                    for (int i=0;i<listItem.size();i++){
                        if(listItem.get(i).getTRANGTHAI()==1)
                            listItem1.add(listItem.get(i));
                    }
                    if (listItem1 != null){
                        int s=listItem1.size();
                        
                        for (int i=0;i<s;i++){
                            DTO_NhanVien sanpham=  listItem1.get(i);
                            if(sanpham.getTRANGTHAI()==1){
                            row =sheet.createRow(i+1);
                            cell=row.createCell(0,CellType.NUMERIC);
                            cell.setCellValue(i+1);
                            cell=row.createCell(1,CellType.STRING);
                            cell.setCellValue(sanpham.getMANV());
                            cell=row.createCell(2,CellType.STRING);
                            cell.setCellValue(sanpham.getTENNV());
                            cell=row.createCell(3,CellType.STRING);
                            cell.setCellValue(sanpham.getSDT());
                            cell=row.createCell(4,CellType.STRING);
                            cell.setCellValue(sanpham.getDIACHI());
                            cell=row.createCell(5,CellType.STRING);
                            cell.setCellValue(sanpham.getGIOITINH());
                            cell=row.createCell(6,CellType.STRING);
                            cell.setCellValue(sanpham.getNGAYSINH().toString());}
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
    private javax.swing.JPanel QuanlyNhanVien;
    private javax.swing.JButton btnNhapfile;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXuatfile;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jpnView;
    private javax.swing.JTextField jtfTim;
    // End of variables declaration//GEN-END:variables
}
