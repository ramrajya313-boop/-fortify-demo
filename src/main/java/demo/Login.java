package demo;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Login {

    public boolean login(String username, String password) throws Exception {

        Connection con = Database.getConnection();

        Statement st = con.createStatement();

        String sql =
                "SELECT * FROM users WHERE username='"
                        + username +
                        "' AND password='"
                        + password + "'";

        ResultSet rs = st.executeQuery(sql);

        return rs.next();
    }

}