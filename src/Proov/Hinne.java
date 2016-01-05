package Proov;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Annely on 5.01.2016.
 */
public class Hinne {
    Connection conn= null;
    public Hinne(){
        looYhendus();
        looTabel();
    }


    private void looYhendus()  {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:test.db");
        } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println("Kõik hästi");
            }
        }
    private void looTabel() {
        String sql = "CREATE TABLE IF NOT EXISTS(KESKMINE HINNE));";
                teostaAndmebaasiUuendus(sql);

    }

    private void teostaAndmebaasiUuendus(String sql) {
        try {
            Statement stat = conn.createStatement();
            stat.executeUpdate(sql);
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

