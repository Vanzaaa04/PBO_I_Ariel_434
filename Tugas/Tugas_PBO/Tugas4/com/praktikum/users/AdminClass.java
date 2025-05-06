package com.praktikum.users;

// Belum Selesai ya
import com.praktikum.actions.*;

import java.util.Scanner;

public class AdminClass extends User implements AdminActions {
    Scanner input = new Scanner(System.in);
    String inputUsername, inputPassword;
    int pilihanMenu;

    public AdminClass(String nama, String nim) {
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
        System.out.println("||         >>> LOGIN ADMIN BERHASIL <<<        ||");
        System.out.println("==================================================");
    }

    @Override
    public void manageItems(){
        System.out.println("Fitur Kelola Barang Belum Tersedia");
    }

    @Override
    public void manageUsers(){
        System.out.println("Fitur Kelola Mahasiswa Belum Tersedia");
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
            manageItems();
        } else if (pilihanMenu == 2) {
            manageUsers();
        } else {
            System.out.println("Pilihan Menu Tidak Valid");
        }
    }

}
