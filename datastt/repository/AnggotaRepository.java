package repository;

import model.Anggota;
import java.util.List;

public interface AnggotaRepository {
    void daftarAnggota(Anggota anggota);
    List<Anggota> getAllAnggota();
}