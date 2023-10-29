/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import DTO.DTO_KhuyenMai;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class TableKhuyenMai {
    public DefaultTableModel setTableKH(List<DTO_KhuyenMai> ListItem, String[] listColumn){
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
                DTO_KhuyenMai nv = ListItem.get(i);
                obj = new Object[columns];              //Mỗi phần tử trong mảng là một cột
                //obj[0] = (i+1);
                obj[0] = nv.getMAKM();
                obj[1] = nv.getMASP();
                obj[2] = nv.getTENSP();
                obj[3] = nv.getTENKM();
                obj[4] = nv.getPHANTRAMKM();
                obj[5] = nv.getNGAYBD();
                obj[6] = nv.getNGAYKT();
                if(nv.getTRANGTHAI()!= 0){
                dtm.addRow(obj);
                }
            }
        }
       
        
        return dtm;
    }
}
