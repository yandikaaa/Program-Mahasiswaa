package main;

import service.AnggotaService;
import model.Anggota;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] ayrgs){

        Scanner input = new Scanner(System.in);

        AnggotaService service = new AnggotaService();

        while(true){

            System.out.println("\n=== SISTEM PENDAFTARAN STT ===");
            System.out.println("1. Daftar Anggota");
            System.out.println("2. Lihat Data Anggota");
            System.out.println("3. Keluar");

            System.out.print("Pilih menu : ");
            int menu = input.nextInt();
            input.nextLine();

            if(menu == 1){

                System.out.print("Nama : ");
                String nama = input.nextLine();

                System.out.print("Tahun Lahir : ");
                int tahun = input.nextInt();
                input.nextLine();

                System.out.print("No HP : ");
                String hp = input.nextLine();

                Anggota anggota = new Anggota(nama,tahun,hp);

                service.daftarAnggota(anggota);

            }

            else if(menu == 2){

                List<Anggota> data = service.getAllAnggota();

                for(Anggota a : data){

                    System.out.println("Nama : " + a.getNama());
                    System.out.println("Tahun Lahir : " + a.getTahunLahir());
                    System.out.println("No HP : " + a.getNoHp());
                    System.out.println("--------------------");

                }

            }

            else if(menu == 3){

                System.out.println("Program selesai");
                break;

            }

        }

    }

}
