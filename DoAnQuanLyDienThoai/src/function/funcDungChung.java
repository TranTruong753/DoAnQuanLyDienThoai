/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package function;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class funcDungChung {

    public funcDungChung() {
    }
    
    
    public String doubleToFormattedString(Double number) {
        // Định dạng số thành "xxx,xxx,xxx"
        DecimalFormat df = new DecimalFormat("###,###,###");
        return df.format(number);
    }
    
     public static String dateToString(Date date, String format) {
        if (date == null) {
            return null;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }
       
    public String traVeMacDinh(String number){
        if(number.contains(".")){
            return number.replace(".", "");
        }
        else
            return number.replace(",", "");
    }
    
     public boolean check_BirthDay(String str) {
        Pattern p=Pattern.compile("^[0-9]$");
        if(p.matcher(str).find() )  
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public  boolean checkPassword(String password) {
        // Kiểm tra độ dài của mật khẩu
        if (password.length() < 8) {
            return false;
        }

        // Kiểm tra xem mật khẩu có chứa ít nhất một ký tự chữ hoa
        boolean containsUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                containsUppercase = true;
                break;
            }
        }

        if (!containsUppercase) {
            return false;
        }

        // Kiểm tra xem mật khẩu có chứa ít nhất một ký tự chữ thường
        boolean containsLowercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                containsLowercase = true;
                break;
            }
        }

        if (!containsLowercase) {
            return false;
        }

        // Kiểm tra xem mật khẩu có chứa ít nhất một ký tự số
        boolean containsDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                containsDigit = true;
                break;
            }
        }

        if (!containsDigit) {
            return false;
        }

        // Kiểm tra xem mật khẩu có chứa ít nhất một ký tự đặc biệt
        boolean containsSpecialChar = false;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                containsSpecialChar = true;
                break;
            }
        }

        if (!containsSpecialChar) {
            return false;
        }

        // Mật khẩu hợp lệ nếu tất cả các điều kiện trên đều thỏa mãn
        return true;
    }
    
    /**
     * @param args the command line arguments
     */
   
    
}
