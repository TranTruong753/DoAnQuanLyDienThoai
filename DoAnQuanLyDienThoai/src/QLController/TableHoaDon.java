/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

import DTO.*;
import function.funcDungChung;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class TableHoaDon {
     funcDungChung fuc = new funcDungChung();
    public DefaultTableModel setTableHd(List<DTO_HoaDon> ListItem, String[] listColumn){
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
                DTO_HoaDon nv = ListItem.get(i);
                obj = new Object[columns];              //Mỗi phần tử trong mảng là một cột
                //obj[0] = (i+1);
                obj[0] = nv.getMaHD();
                obj[1] = nv.getMaNV();
                obj[2] = nv.getMaKH();
                obj[3] = nv.getNgayLap();
                obj[4] = fuc.doubleToFormattedString(nv.getTongTien());
                obj[5] = fuc.doubleToFormattedString(nv.getGiamGia());
                obj[6] = fuc.doubleToFormattedString(nv.getTienThanhToan());
                obj[7] = fuc.doubleToFormattedString(nv.getTienKhach());
                obj[8] = fuc.doubleToFormattedString(nv.getTienThoi());
                obj[9] = nv.getNgayKtBh();

//                obj[6] = khachHang.getTrangThai();
                
                if(nv.getTrangThai()!= 0){
                    dtm.addRow(obj);
                }
                
            }
        }
       
        
        return dtm;
    }
}
