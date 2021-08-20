/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class Bai1 {

    public static void main(String[] args) {
        try {
            String user = "hung1";
            String pass = "1";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSINHVIEN";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT * FROM STUDENT";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.print(rs.getString("MASV") + ",");
                System.out.print(rs.getString("HOTEN") + ",");

                System.out.print(rs.getString("EMAIL") + ",");

                System.out.print(rs.getString("SODT") + ",");

                System.out.print(rs.getString("DIACHI") + ",");
                if (rs.getString("GIOITINH").equals("1")) {
                    System.out.print("Nam" + "." + "\n");
                } else if (rs.getString("GIOITINH" + ",").equals("0")) {
                    System.out.print("Nữ" + "." + "\n");
                }

            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
