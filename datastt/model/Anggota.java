package model;

public class Anggota {
    private int id;
    private String nama;
    private int tahunLahir;
    private String noHp;

    public Anggota(String nama, int tahunLahir, String noHp){
        this.nama = nama;
        this.tahunLahir = tahunLahir;
        this.noHp = noHp;
    }

    public String getNama(){
        return nama;
    }

    public int getTahunLahir(){
        return tahunLahir;
    }

    public String getNoHp(){
        return noHp;
    }

}
