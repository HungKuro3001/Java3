/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoSlide5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class TestConnection {
    public static void main(String[] args) {
        try {
            String user = "hung1";
            String pass = "1";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=Lab5_SOF203;user=hung1;password=1";
          

            Connection cn = DriverManager.getConnection(url, user, pass);
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(url);
            while (rs.next()) {
                System.err.println();
                
            }
            
            System.out.println("Kết nối được");
        } catch (Exception e) {
            System.out.println("Lỗi");
            e.printStackTrace();
        }
    }
    
}
