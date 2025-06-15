package login;

import sistem.Menu;
import sistem.Laporan;
import sistem.Aspirasi;

import java.util.ArrayList;
import java.util.Scanner;

public class User implements Menu {
    Scanner input = new Scanner(System.in);
    ArrayList<Laporan> daftarLaporan;
    ArrayList<Aspirasi> daftarAspirasi;

    public User(ArrayList<Laporan> daftarLaporan, ArrayList<Aspirasi> daftarAspirasi) {
        this.daftarLaporan = daftarLaporan;
        this.daftarAspirasi = daftarAspirasi;
    }

    public void tampilkanMenu() {
        int pilihan = 0;

        while (pilihan != 5) {
            System.out.println("===== MENU USER =====");
            System.out.println("1. Buat Laporan");
            System.out.println("2. Buat Aspirasi");
            System.out.println("3. Lihat Semua Laporan");
            System.out.println("4. Lihat Semua Aspirasi");
            System.out.println("5. Kembali");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(input.nextLine());

            if (pilihan == 1) {
                buatLaporan();
            } else if (pilihan == 2) {
                buatAspirasi();
            } else if (pilihan == 3) {
                lihatLaporan();
            } else if (pilihan == 4) {
                lihatAspirasi();
            } else if (pilihan == 5) {
                System.out.println("Kembali ke menu utama.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void buatLaporan() {
        System.out.println("\n=== Buat Laporan ===");
        System.out.print("Nama Lengkap: ");
        String nama = input.nextLine();
        System.out.print("Masalah: ");
        String masalah = input.nextLine();
        System.out.print("Deskripsi Masalah: ");
        String deskripsi = input.nextLine();
        System.out.print("Lokasi/Alamat: ");
        String lokasi = input.nextLine();
        System.out.print("Tanggal: ");
        String tanggal = input.nextLine();
        System.out.print("Waktu: ");
        String waktu = input.nextLine();
        System.out.print("Bulan: ");
        String bulan = input.nextLine();
        System.out.print("Tahun: ");
        String tahun = input.nextLine();

        Laporan laporanBaru = new Laporan(nama, masalah, deskripsi, lokasi, tanggal, waktu, bulan, tahun);
        daftarLaporan.add(laporanBaru);
        System.out.println("Laporan berhasil ditambahkan.\n");
    }

    private void buatAspirasi() {
        System.out.println("\n=== Buat Aspirasi ===");
        System.out.print("Nama Lengkap: ");
        String nama = input.nextLine();
        System.out.print("Isi Aspirasi: ");
        String isi = input.nextLine();

        Aspirasi aspirasiBaru = new Aspirasi(nama, isi);
        daftarAspirasi.add(aspirasiBaru);
        System.out.println("Aspirasi berhasil ditambahkan.\n");
    }

    private void lihatLaporan() {
        System.out.println("\n=== Daftar Laporan ===");
        if (daftarLaporan.size() == 0) {
            System.out.println("Belum ada laporan.\n");
        } else {
            for (int i = 0; i < daftarLaporan.size(); i++) {
                System.out.println("Laporan ke-" + (i + 1));
                daftarLaporan.get(i).tampilkanLaporan();
            }
        }
    }

    private void lihatAspirasi() {
        System.out.println("\n=== Daftar Aspirasi ===");
        if (daftarAspirasi.size() == 0) {
            System.out.println("Belum ada aspirasi.\n");
        } else {
            for (int i = 0; i < daftarAspirasi.size(); i++) {
                System.out.println("Aspirasi ke-" + (i + 1));
                daftarAspirasi.get(i).tampilkanAspirasi();
            }
        }
    }
}