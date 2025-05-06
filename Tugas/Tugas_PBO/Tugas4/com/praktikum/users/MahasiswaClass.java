package com.praktikum.users;
import com.praktikum.actions.*;
import java.util.Scanner;

// Belum Selesai ya
public class MahasiswaClass extends User implements MahasiswaActions {
    Scanner input = new Scanner(System.in);
    String inputUsername, inputPassword, namaBarang, deskripsiBarang, lokasiDitemukan;
    int pilihanMenu;

    public MahasiswaClass(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login() {
       do {
           System.out.print("Masukkan Username: ");
           inputUsername = input.next();
           input.nextLine();
           System.out.print("Masukkan Password: ");
           inputPassword = input.nextLine();
           System.out.println("\n==================================================");
           System.out.println("||      NAMA ATAU NIM TIDAK SESUAI!             ||");
           System.out.println("==================================================");
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
    public void reportItem(){
        System.out.print("Masukkan Nama Barang: ");
        namaBarang = input.next();
        System.out.print("Masukkan Deskripsi Barang: ");
        deskripsiBarang = input.next();
        System.out.print("Masukan Lokasi Terakhir/Ditemukan: ");
        lokasiDitemukan = input.next();
        System.out.println();
        System.out.println("Input Data Barang Telah Di-Terima");
    }

    @Override
    public void viewReportedItems(){
        System.out.println("Fitur lihat laporan belum tersedia");
    }

    @Override
    public void displayAppMenu(){
        System.out.println("Menu");
        System.out.println("1. Kelola Laporan Barang");
        System.out.println("2. Kelola Data Mahasiswa");
        System.out.println("0. Logout");
        System.out.println("Silahkan Pilih Menu Yang ingin Anda Akses : ");
        pilihanMenu = input.nextInt();

        if(pilihanMenu == 1){
            reportItem();
        } else if (pilihanMenu == 2) {
            viewReportedItems();
        } else {
            System.out.println("Pilihan Menu Tidak Valid");
        }
    }

}
