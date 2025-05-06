package com.praktikum.main;

import com.praktikum.users.*;
import java.util.Scanner;

public class LoginSystemClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User admin = new AdminClass("Admin434", "password434");
        User mahasiswa = new MahasiswaClass("Ariel Ardiansyah", "202410370110434");

        int pilihan;

        do {
            System.out.println("============================================================");
            System.out.println("||         SELAMAT DATANG DI SISTEM LOGIN SEDERHANA       ||");
            System.out.println("============================================================");
            System.out.println("||  1. Login sebagai Admin                                 ||");
            System.out.println("||  2. Login sebagai Mahasiswa                             ||");
            System.out.println("||  3. Keluar dari Sistem                                  ||");
            System.out.println("============================================================");
            System.out.print("Pilih menu login (1-3): ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    admin.login();
                    break;
                case 2:
                    mahasiswa.login();
                    break;
                case 3:
                    System.out.println("\n==================================================");
                    System.out.println("||       TERIMA KASIH TELAH MENGGUNAKAN        ||");
                    System.out.println("||        SISTEM LOGIN INI. SAMPAI JUMPA!       ||");
                    System.out.println("==================================================");
                    break;
                default:
                    System.out.println(">> Pilihan tidak valid. Silakan coba lagi. <<");
            }

        } while (pilihan != 3);

        input.close();
    }
}
