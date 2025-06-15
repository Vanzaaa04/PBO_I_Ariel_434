package main;

import sistem.Laporan;
import sistem.Aspirasi;
import login.User;
import login.Admin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Laporan> daftarLaporan = new ArrayList<Laporan>();
        ArrayList<Aspirasi> daftarAspirasi = new ArrayList<Aspirasi>();

        int pilihan = 0;

        while (pilihan != 3) {
            System.out.println("===== SISTEM LAPORAN & ASPIRASI =====");
            System.out.println("1. Login sebagai User");
            System.out.println("2. Login sebagai Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(input.nextLine());

            if (pilihan == 1) {
                User user = new User(daftarLaporan, daftarAspirasi);
                user.tampilkanMenu();
            } else if (pilihan == 2) {
                Admin admin = new Admin(daftarLaporan, daftarAspirasi);
                admin.loginAdmin();
                admin.tampilkanMenu();
            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan sistem.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}