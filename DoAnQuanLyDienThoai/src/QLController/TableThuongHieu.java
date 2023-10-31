/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import DTO.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class TableThuongHieu {
    public DefaultTableModel setTableTh(List<DTO_ThuongHieu> ListItem, String[] listColumn){
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
                DTO_ThuongHieu th = ListItem.get(i);
                obj = new Object[columns];              //Mỗi phần tử trong mảng là một cột
              
                obj[0] = th.getMATH();
                obj[1] = th.getTENTH();
              
             
                
                if(th.getTRANGTHAI()!= 0){
                dtm.addRow(obj);
                }
                
                
               
            }
        }
       
        
        return dtm;
    }
}
