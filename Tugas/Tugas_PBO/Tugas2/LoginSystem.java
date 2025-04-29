import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();
        int pilihan;

        System.out.println("============================================================");
        System.out.println("|       SELAMAT DATANG DI SISTEM LOGIN SEDERHANA          |");
        System.out.println("============================================================");
        System.out.println("| 1. Admin                                                 |");
        System.out.println("| 2. Mahasiswa                                             |");
        System.out.println("| 3. Keluar                                                |");
        System.out.println("============================================================");

        do {
            System.out.print("Pilih menu login (1-3): ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan < 1 || pilihan > 3) {
                System.out.println("Pilihan tidak valid, silakan coba lagi!");
            }
        } while (pilihan < 1 || pilihan > 3);

        if (pilihan == 1) {
            System.out.println("\n==================================================");
            System.out.println("                 MENU LOGIN ADMIN                ");
            System.out.println("==================================================");
            System.out.print("Masukkan Username : ");
            admin.InputUsername = input.nextLine();
            System.out.print("Masukkan Password : ");
            admin.InputPass = input.nextLine();
            admin.login();
            

        } else if (pilihan == 2) {
            System.out.println("\n==================================================");
            System.out.println("               MENU LOGIN MAHASISWA               ");
            System.out.println("==================================================");
            System.out.print("Masukkan Nama : ");
            mahasiswa.InputNama = input.nextLine();
            System.out.print("Masukkan NIM : ");
            mahasiswa.InputNim = input.nextLine();
            mahasiswa.login();
            mahasiswa.displayInfo();

        } else {
            System.out.println("\n============================================");
            System.out.println("||    Terima kasih telah menggunakan       ||");
            System.out.println("||         Sistem Login Sederhana         ||");
            System.out.println("============================================");

        }

        input.close();
    }
}
