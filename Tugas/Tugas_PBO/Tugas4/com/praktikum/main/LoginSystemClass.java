package com.praktikum.main;
import com.praktikum.users.*;
// Belum Selesai ya
import java.util.Scanner;

public class LoginSystemClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User admin = new AdminClass("Admin434", "password434");
        User mahasiswa = new MahasiswaClass("ArielArdiansyah", "202410370110434");

        int pilihan;

        System.out.println("============================================================");
        System.out.println("||         SELAMAT DATANG DI SISTEM LOGIN SEDERHANA       ||");
        System.out.println("============================================================");
        System.out.println("||  1. Admin                                               ||");
        System.out.println("||  2. Mahasiswa                                           ||");
        System.out.println("||  3. Keluar                                              ||");
        System.out.println("============================================================");

        do {
            System.out.print("Pilih menu login (1-3): ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan < 1 || pilihan > 3) {
                System.out.println(">>> Pilihan tidak valid, silakan coba lagi!");
            }
        } while (pilihan < 1 || pilihan > 3);

        if (pilihan == 1) {

            admin.login();

        } else if (pilihan == 2) {

            mahasiswa.login();


        } else {
            System.out.println("\n==================================================");
            System.out.println("||       TERIMA KASIH TELAH MENGGUNAKAN        ||");
            System.out.println("||          SISTEM LOGIN INI. SAMPAI JUMPA!     ||");
            System.out.println("==================================================");
        }

        input.close();
    }
}
