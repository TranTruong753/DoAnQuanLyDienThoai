/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;

public class CenterRenderer extends DefaultTableCellRenderer {
    //Class này dùng căn giữa dòng trong jtable
    public CenterRenderer() {
        setHorizontalAlignment(JLabel.CENTER); // Đặt căn giữa cho nội dung ô cột
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Gọi phương thức cha và trả về component được render
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}

