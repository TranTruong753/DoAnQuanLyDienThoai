/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.*;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.microsoft.sqlserver.jdbc.SQLServerStatementColumnEncryptionSetting;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DAO {
     public static Connection getConnection(){
        try {
            Connection cons=null;                  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUrl = "jdbc:sqlserver://localhost:1433;DatabaseName = QLDT;encrypt=false";
            String username = "sa";
            String password = "123456";           
            cons = (Connection) DriverManager.getConnection(dbUrl, username, password);
            return cons;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
//    public static void main(String[] args) throws SQLException {
//        Connection c=getConnection();
//        System.out.println(c.toString());
//        c.close();
//    }
}
