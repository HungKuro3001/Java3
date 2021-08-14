/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Đức Toàn
 */
public class Lab5Bai1 {
    public static void main(String[] args) {
        try {
            String user = "toan";
            String pass = "23112002";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSINHVIEN";
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "select * from students";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.print(rs.getString("MASV") + ", ");
                System.out.print(rs.getString("HOTEN") + ", ");
                System.out.print(rs.getString("EMAIL") + ", ");
                System.out.print(rs.getString("SDT") + ", ");
                System.out.print(rs.getString("GIOITINH") + ", ");
                System.out.println(rs.getString("DIACHI")+", ");
               

            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
