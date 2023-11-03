/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import DTO.DTO_SanPham;
import function.funcDungChung;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class TableDSBH {
    private funcDungChung fuc = new funcDungChung();
    public DefaultTableModel setTableSp(List<DTO_SanPham> ListItem, String[] listColumn,ArrayList<String> listsl){
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
                DTO_SanPham sp = ListItem.get(i);
                obj = new Object[columns];              //Mỗi phần tử trong mảng là một cột
                //obj[0] = (i+1);
                obj[0] = sp.getMaSp();
                obj[1] = sp.getTenSp();
                
                obj[2] = fuc.doubleToFormattedString(sp.getDonGia());
//                obj[6] = fuc.doubleToFormattedString(sp.getKhuyenMai());
                obj[3] =listsl.get(i);
                
             
                
                if(sp.getTrangThai()!= 0){
                dtm.addRow(obj);
                }
                
                
               
            }
        }
       
        
        return dtm;
    }
    
}
