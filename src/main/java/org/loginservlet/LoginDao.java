package org.loginservlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

    public static boolean validate(String name, String pass) {
        boolean status = false;
        String url = "jdbc:mysql://localhost:3306/clients";
        String user = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Charge le pilote JDBC
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM userreg WHERE name=? AND pass=?");

            ps.setString(1, name);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();
            status = rs.next();

            // Fermer les ressources
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
    // Insert user method
    public static boolean insertUser(String name, String pass) {
        boolean result = false;
        String url = "jdbc:mysql://localhost:3306/clients"; // Update with your DB name
        String user = "root"; // Update with your DB username
        String password = ""; // Update with your DB password

        // Try-with-resources for auto-closeable resources
        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = con.prepareStatement("INSERT INTO userreg (name, pass) VALUES (?, ?)")) {

            ps.setString(1, name);
            ps.setString(2, pass);

            int affectedRows = ps.executeUpdate();
            result = affectedRows > 0;

        } catch (Exception e) {
            e.printStackTrace(); // Replace with proper logging
        }

        return result;
    }
}
