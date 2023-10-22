/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import DTO.DTO_CTPN;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class TableCTHDNH {
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
                
                obj[0] = nv.getMASP();
                obj[1] = nv.getTENSP();
                obj[2] = nv.getSL();
                obj[3] = nv.getDONGIA();
                obj[4] = nv.getTHANHTIEN();
                
//                obj[6] = khachHang.getTrangThai();
                
                if(nv.getMAHDNH().equals(MAHDNH)){
                dtm.addRow(obj);
                }
                
            }
        }
       
        
        return dtm;
    }
    
}
