/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTable;

import DTO.DTO_NhanVien;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class TableNhanVien {
    public DefaultTableModel setTableKH(List<DTO_NhanVien> ListItem, String[] listColumn){
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
                DTO_NhanVien nv = ListItem.get(i);
                obj = new Object[columns];              //Mỗi phần tử trong mảng là một cột
                //obj[0] = (i+1);
                obj[0] = nv.getMANV();
                obj[1] = nv.getTENNV();
                obj[2] = nv.getSDT();
                obj[3] = nv.getDIACHI();
                obj[4] = nv.getGIOITINH();
                obj[5] = nv.getNGAYSINH();
//                obj[6] = khachHang.getTrangThai();
                if(nv.getTRANGTHAI()!= 0){
                dtm.addRow(obj);
                }
            }
        }
       
        
        return dtm;
    }
    
}
