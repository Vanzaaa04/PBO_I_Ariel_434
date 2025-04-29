import java.util.Scanner;

public class LoginSystemClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user = new User("Mahasiswa Umum", "100");
        AdminClass admin = new AdminClass("Admin434", "password434");
        MahasiswaClass mahasiswa = new MahasiswaClass("Ariel Ardiansyah", "202410370110434");

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
            System.out.println("\n==================================================");
            System.out.println("||               MENU LOGIN ADMIN              ||");
            System.out.println("==================================================");
            System.out.print("Masukkan username: ");
            admin.inputUsername = input.nextLine();
            System.out.print("Masukkan password: ");
            admin.inputPassword = input.nextLine();

            admin.login();
            admin.displayInfo();

        } else if (pilihan == 2) {
            System.out.println("\n==================================================");
            System.out.println("||            MENU LOGIN MAHASISWA             ||");
            System.out.println("==================================================");
            System.out.print("Masukkan username: ");
            mahasiswa.inputUsername = input.nextLine();
            System.out.print("Masukkan password: ");
            mahasiswa.inputPassword = input.nextLine();

            mahasiswa.login();
            mahasiswa.displayInfo();

        } else {
            System.out.println("\n==================================================");
            System.out.println("||       TERIMA KASIH TELAH MENGGUNAKAN        ||");
            System.out.println("||          SISTEM LOGIN INI. SAMPAI JUMPA!     ||");
            System.out.println("==================================================");
        }

        input.close();
    }
}
