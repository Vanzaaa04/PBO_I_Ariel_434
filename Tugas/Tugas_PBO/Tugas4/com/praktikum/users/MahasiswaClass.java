package com.praktikum.users;

import com.praktikum.actions.*;
import java.util.Scanner;

public class MahasiswaClass extends User implements MahasiswaActions {
    Scanner input = new Scanner(System.in);
    String namaBarang, deskripsiBarang, lokasiDitemukan;
    int pilihanMenu;
    String inputUsername, inputPassword;

    public MahasiswaClass(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login() {
        do {
            System.out.print("Masukkan Username: ");
            inputUsername = input.nextLine(); // GANTI DARI next() ke nextLine()
            System.out.print("Masukkan Password: ");
            inputPassword = input.nextLine();

            if (!inputUsername.equals(getNama()) || !inputPassword.equals(getNim())) {
                System.out.println("\n==================================================");
                System.out.println("||      NAMA ATAU NIM TIDAK SESUAI!             ||");
                System.out.println("==================================================");
            }

        } while (!inputUsername.equals(getNama()) || !inputPassword.equals(getNim()));

        displayInfo();
        displayAppMenu();
    }

    @Override
    public void displayInfo() {
        System.out.println("\n==================================================");
        System.out.println("||      >>> LOGIN MAHASISWA BERHASIL <<<       ||");
        System.out.println("==================================================");
    }

    @Override
    public void reportItem() {
        input.nextLine(); // flush jika sebelumnya pakai nextInt
        System.out.print("Masukkan Nama Barang: ");
        namaBarang = input.nextLine();
        System.out.print("Masukkan Deskripsi Barang: ");
        deskripsiBarang = input.nextLine();
        System.out.print("Masukkan Lokasi Terakhir/Ditemukan: ");
        lokasiDitemukan = input.nextLine();

        System.out.println("\n>> Data Barang Telah Dicatat. Terima Kasih! <<");
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }

    @Override
    public void displayAppMenu() {
        do {
            System.out.println("\n==================================================");
            System.out.println("||              MENU MAHASISWA                 ||");
            System.out.println("==================================================");
            System.out.println("||  1. Laporkan Barang Temuan/Hilang           ||");
            System.out.println("||  2. Lihat Daftar Laporan                    ||");
            System.out.println("||  0. Logout                                  ||");
            System.out.println("==================================================");
            System.out.print("Pilih menu: ");
            pilihanMenu = input.nextInt();

            switch (pilihanMenu) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    System.out.println(">> Logout Berhasil <<");
                    break;
                default:
                    System.out.println(">> Pilihan Menu Tidak Valid <<");
            }
        } while (pilihanMenu != 0);
    }
}
