/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoSlide5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Administrator
 */
public class NewClass {
    public static void main(String[] args) {
          String connectionUrl = "jdbc:sqlserver://localhost;databaseName=Lab5_SOF203;user=hung1;password=1";

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String SQL = "SELECT * FROM HOCSINH";
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString("TenHS"));
              
            }
              rs.close();
            stmt.close();
        }
        // Handle any errors that may have occurred.%
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
