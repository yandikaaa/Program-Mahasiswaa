package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class KoneksiDB {
    public static Connection connect(){

        try{
            String url = "jdbc:sqlite:stt.db";
            Connection conn = DriverManager.getConnection(url);

            Statement stmt = conn.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS anggota ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "nama TEXT,"
                    + "tahun_lahir INTEGER,"
                    + "no_hp TEXT"
                    + ");";

            stmt.execute(sql);

            return conn;

        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }
}
