package Proov;

import java.sql.*;

/**
 * Created by Annely on 5.01.2016.
 */
public class Hinne {
    Connection conn= null;
    int valitud = TulemustePrint.valitud;
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
    public void looTabel() {
        String sql = "CREATE TABLE IF NOT EXISTS KESKMINE (VALITUD INT));";
                teostaAndmebaasiUuendus(sql);

    }

    public void teostaAndmebaasiUuendus(String sql) {
        try {
            Statement stat = conn.createStatement();
            stat.executeUpdate(sql);
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void lisaArvud(){
        String sql = "INSERT INTO TABEL KESKMINE (VALITUD) VALUES ('"+valitud+"')";
        teostaAndmebaasiUuendus(sql);
    }


}

