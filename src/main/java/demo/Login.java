package demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login {

    public boolean login(String username, String password) throws Exception {

        Connection con = Database.getConnection();

        String sql =
            "SELECT * FROM users WHERE username = ? AND password = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, username);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        return rs.next();
    }
}