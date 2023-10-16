/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package function;

import java.text.DecimalFormat;

/**
 *
 * @author Admin
 */
public class funcDungChung {
    
    public String doubleToFormattedString(Double number) {
        // Định dạng số thành "xxx,xxx,xxx"
        DecimalFormat df = new DecimalFormat("###,###,###");
        return df.format(number);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
