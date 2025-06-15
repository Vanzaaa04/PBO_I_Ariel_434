package praktikum.main;

import praktikum.models.Item;
import praktikum.users.AdminClass;
import praktikum.users.MahasiswaClass;
import praktikum.users.User;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class LoginSystemClass {
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Item> reportedItems = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Menambahkan akun awal Admin dan Mahasiswa
        userList.add(new AdminClass("Admin434", "password434"));
        userList.add(new MahasiswaClass("Ariel", "434"));

        int pilihan = -1;
        do {
            System.out.println("\n==================================================");
            System.out.println("||          SISTEM INFORMASI BARANG            ||");
            System.out.println("==================================================");
            System.out.println("||  1. Login sebagai Admin                     ||");
            System.out.println("||  2. Login sebagai Mahasiswa                 ||");
            System.out.println("||  0. Keluar                                  ||");
            System.out.println("==================================================");
            System.out.print("Pilih menu: ");
            try {
                pilihan = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(">> Input harus berupa angka! <<");
                input.nextLine(); // buang karakter non-angka
                continue;
            }

            switch (pilihan) {
                case 1:
                    new AdminClass("", "").login();  // login akan cek ulang username dan password
                    break;
                case 2:
                    new MahasiswaClass("", "").login(); // login akan cek ulang username dan password
                    break;
                case 0:
                    System.out.println(">> Program selesai. Terima kasih! <<");
                    break;
                default:
                    System.out.println(">> Pilihan Menu Tidak Valid <<");
            }
        } while (pilihan != 0);
    }
}
