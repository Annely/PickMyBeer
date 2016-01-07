package Proov;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Annely on 5.01.2016.
 * Selle klassi juures oli abiks: https://www.youtube.com/watch?v=KRhv4iPgzHE
 */
public class Hinne {
    Connection conn= null;
    double valitud = TulemustePrint.valitud;
    static ArrayList<Integer> hinded = new ArrayList<>();
    static double keskmineHinne;

    Hinne(){
        looYhendus();
        looTabel();
        lisaArvud();
        hangiHinded();
        arvutaKeskmine();
        keskmineHinneStringiks();

    }

    public static double arvutaKeskmine() {
        double summa =0;
        for (int i = 0; i < hinded.size(); i++) {
            summa += hinded.get(i);
            }
        keskmineHinne = summa/hinded.size();
        System.out.println(keskmineHinne);
        keskmineHinne =Math.round(keskmineHinne*100)/100.0d;
        System.out.println(keskmineHinne);
        return keskmineHinne;
    }
    public static String keskmineHinneStringiks(){
        return String.valueOf(keskmineHinne);
    }

    private Connection looYhendus()  {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:test.db");
        } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
        finally {
            System.out.println("Ühendus loodud");
        }
        return conn;
    }
    public void looTabel() {
        try {
            Connection con =looYhendus();
            PreparedStatement loo = con.prepareStatement("CREATE TABLE IF NOT EXISTS keskmiseTabel (valitud int)");
            loo.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Tabel loodud");
        }
    }

    public void lisaArvud(){
        Connection con = looYhendus();

        try {
            PreparedStatement lisa = con.prepareStatement("INSERT INTO keskmiseTabel (valitud) VALUES ('"+valitud+"')" );
            lisa.executeUpdate();
            System.out.println("arvud lisatud");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Integer> hangiHinded() {

        try {
            Statement statement =conn.createStatement();
            String sql = "SELECT valitud FROM keskmiseTabel";
            ResultSet rs = statement.executeQuery(sql);


            while (rs.next()){
                hinded.add(rs.getInt("valitud"));
            }
            return hinded;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

}

