/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Admin
 */
public class DAL_CTPN {
    private DAL_SanPham spDal = new DAL_SanPham();
    public ArrayList<DTO_CTPN> getList() {
        try{
            Connection conn = DAO.getConnection();
            String sql ="select * from CTHDNH";
            ArrayList<DTO_CTPN> list= new ArrayList<>();
            PreparedStatement ps=conn.prepareCall(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                DTO_CTPN nv=new DTO_CTPN();
               nv.setMAHDNH(rs.getString("MAHDNH"));
               nv.setMASP(rs.getString("MASP"));
               
               nv.setTENSP(rs.getString("TENSP"));
               nv.setSL(rs.getInt("SL"));
               nv.setDONGIA(rs.getInt("DONGIA"));
               nv.setTHANHTIEN(rs.getInt("THANHTIEN"));
               list.add(nv);
            }
            ps.close();
            rs.close();
            conn.close();
            return list;
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
       return null ;
    
    }

    
    public boolean addDTO_CTPN(DTO_CTPN s) {
        String sql="insert into CTHDNH(MAHDNH,MASP,TENSP,SL,DONGIA,THANHTIEN)"
               + "VALUES(?,?,?,?,?,?)";
        
        
        try {
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, s.getMAHDNH());
           ps.setString(2, s.getMASP());
           
           ps.setString(3, s.getTENSP());
           ps.setInt(4, s.getSL());
           ps.setDouble(5, s.getDONGIA());
           ps.setDouble(6, s.getTHANHTIEN());
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return false;
    }

    
    
    public boolean updateDTO_CTPN(DTO_CTPN s) {
        String sql="update CTHDNH set MAHDNH=? , MASP=?,TENSP=? ,SL=? ,DONGIA=? ,THANHTIEN=? where MAHDNH=?";     
        try {
            
            Connection conn = DAO.getConnection();
           PreparedStatement ps= conn.prepareStatement(sql);
            //java.util.Date a=  s.getNgaysinh();
           ps.setString(1, s.getMAHDNH());
           ps.setString(2, s.getMASP());
           
           ps.setString(3, s.getTENSP());
           ps.setInt(4, s.getSL());
           ps.setDouble(5, s.getDONGIA());
           
           ps.setDouble(6, s.getTHANHTIEN());
           ps.setString(7, s.getMAHDNH());
           
           return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public int themDS(String maPN,JFileChooser fileChooser, XSSFWorkbook workbook, XSSFSheet sheet){
 
            ArrayList<DTO_CTPN> listCTPN = new ArrayList<>();
            try{
                sheet = workbook.getSheetAt(1);
                DataFormatter dataFormatter = new DataFormatter();
                for (int i = sheet.getFirstRowNum()+1; i <= sheet.getLastRowNum(); i++) 
                {
                    XSSFRow row = sheet.getRow(i);
                    if (row == null) {
                        continue;
                    }
                    DTO_CTPN ctpn = new DTO_CTPN();
                    ctpn.setMAHDNH( maPN); // MAHDNH
                    String maSp = row.getCell(1).getStringCellValue();
                    ctpn.setMASP(maSp);
                    ctpn.setTENSP(row.getCell(2).getStringCellValue());                    
                    int sL = (int) row.getCell(3).getNumericCellValue();
                    ctpn.setSL(sL);                  

                    ctpn.setDONGIA(Double.parseDouble(dataFormatter.formatCellValue(row.getCell(4))));

                    ctpn.setTHANHTIEN(Double.parseDouble(dataFormatter.formatCellValue(row.getCell(5))));
                    listCTPN.add(ctpn);

                    }
                for(DTO_CTPN ct:listCTPN){                 
                    addDTO_CTPN(ct);
                    DTO_SanPham spDto = spDal.timSp2(ct.getMASP());
                    spDal.updateSoLuongSp2( spDto, ct.getSL(), ct.getMASP());
                }
                return 1;

            } catch (Exception e) {
                e.printStackTrace();
        
            }
        
        return 0;
    }
    
}
