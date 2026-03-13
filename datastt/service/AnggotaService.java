package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Anggota;
import database.KoneksiDB;
import repository.AnggotaRepository;

public class AnggotaService implements AnggotaRepository{

    public void daftarAnggota(Anggota anggota){

        try{

            Connection conn = KoneksiDB.connect();

            String sql = "INSERT INTO anggota(nama, tahun_lahir, no_hp) VALUES(?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, anggota.getNama());
            stmt.setInt(2, anggota.getTahunLahir());
            stmt.setString(3, anggota.getNoHp());

            stmt.executeUpdate();

            System.out.println("\nTerimakasih telah mendaftar sebagai anggota STT");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public List<Anggota> getAllAnggota(){

        List<Anggota> list = new ArrayList<>();

        try{

            Connection conn = KoneksiDB.connect();

            String sql = "SELECT * FROM anggota";

            ResultSet rs = conn.createStatement().executeQuery(sql);

            while(rs.next()){

                Anggota anggota = new Anggota(
                        rs.getString("nama"),
                        rs.getInt("tahun_lahir"),
                        rs.getString("no_hp")
                );

                list.add(anggota);

            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return list;

    }

}