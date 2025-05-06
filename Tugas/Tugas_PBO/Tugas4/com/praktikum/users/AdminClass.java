package com.praktikum.users;

import com.praktikum.actions.*;
import java.util.Scanner;

public class AdminClass extends User implements AdminActions {
    Scanner input = new Scanner(System.in);
    int pilihanMenu;

    public AdminClass(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login() {
        do {
            System.out.print("Masukkan Username: ");
            inputUsername = input.next();
            input.nextLine(); // flush
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
        System.out.println("||         >>> LOGIN ADMIN BERHASIL <<<        ||");
        System.out.println("==================================================");
    }

    @Override
    public void manageItems() {
        System.out.println(">> Fitur Kelola Barang Belum Tersedia <<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }

    @Override
    public void displayAppMenu() {
        do {
            System.out.println("\n==================================================");
            System.out.println("||                MENU ADMIN                   ||");
            System.out.println("==================================================");
            System.out.println("||  1. Kelola Laporan Barang                   ||");
            System.out.println("||  2. Kelola Data Mahasiswa                   ||");
            System.out.println("||  0. Logout                                  ||");
            System.out.println("==================================================");
            System.out.print("Pilih menu: ");
            pilihanMenu = input.nextInt();

            switch (pilihanMenu) {
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
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
