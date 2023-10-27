/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import DTO.DTO_BaoHanh;
import DTO.DTO_NhaCc;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class TableBaoHanh {
    public DefaultTableModel setTableKH(List<DTO_BaoHanh> ListItem, String[] listColumn){
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
                DTO_BaoHanh nv = ListItem.get(i);
                obj = new Object[columns];              //Mỗi phần tử trong mảng là một cột
                //obj[0] = (i+1);
                obj[0] = nv.getMABH();
                obj[1] = nv.getMAKH();
                obj[2] = nv.getMAHD();
                obj[3] = nv.getMASP();
                obj[4] = nv.getLYDO();
                obj[5] = nv.getNGAYLAP();
               
//                obj[6] = khachHang.getTrangThai();
                if(nv.getTRANGTHAI()!= 0){
                dtm.addRow(obj);
                }
            }
        }
    
        
        return dtm;
    }
}
