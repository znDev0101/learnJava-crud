/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

/**
 *
 * @author ZULFA
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class DataBase {

    /**
     *
     * @return
     * @throws SQLException
     */
    public static Connection  configDB(){
        try{
            String url = "jdbc:mysql://localhost:3306/belajardb";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           Connection cn = DriverManager.getConnection(url,user,pass);
              return cn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
