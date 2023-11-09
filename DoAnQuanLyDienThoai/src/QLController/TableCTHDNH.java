/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import DTO.DTO_CTPN;
import function.funcDungChung;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class TableCTHDNH {
    funcDungChung fuc = new funcDungChung();
    public DefaultTableModel setTableKH(List<DTO_CTPN> ListItem, String[] listColumn,String MAHDNH){
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {        //Không được chỉnh sửa hàng và cột của bảng
                return false;
            }
            
        };
        dtm.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = null;
        int rows = ListItem.size();
        if(rows > 0){
            for(int i = 0;i<rows;i++){
                DTO_CTPN nv = ListItem.get(i);
                obj = new Object[columns];              //Mỗi phần tử trong mảng là một cột
                //obj[0] = (i+1);
                
                obj[0] = nv.getMAHDNH();
                obj[1] = nv.getMASP();
                obj[2] = nv.getTENSP();
                obj[3] = nv.getSL();
                obj[4] = fuc.doubleToFormattedString(nv.getDONGIA());
                obj[5] = fuc.doubleToFormattedString(nv.getTHANHTIEN());
                
//                obj[6] = khachHang.getTrangThai();
                
                if(nv.getMAHDNH().equals(MAHDNH)){
                dtm.addRow(obj);
                }
                
            }
        }
       
        
        return dtm;
    }
    
    public DefaultTableModel setTablePN(List<DTO_CTPN> ListItem, String[] listColumn){
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {        //Không được chỉnh sửa hàng và cột của bảng
                return false;
            }
            
        };
        dtm.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = null;
        int rows = ListItem.size();
        if(rows > 0){
            for(int i = 0;i<rows;i++){
                DTO_CTPN nv = ListItem.get(i);
                obj = new Object[columns];              //Mỗi phần tử trong mảng là một cột
                //obj[0] = (i+1);
                
                obj[0] = nv.getMAHDNH();
                obj[1] = nv.getMASP();
                obj[2] = nv.getTENSP();
                obj[3] = nv.getSL();
                obj[4] = fuc.doubleToFormattedString(nv.getDONGIA());
                obj[5] = fuc.doubleToFormattedString(nv.getTHANHTIEN());
                
//                obj[6] = khachHang.getTrangThai();
                
               
                dtm.addRow(obj);
                
                
            }
        }
       
        
        return dtm;
    }
    
}
