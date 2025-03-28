import java.util.Scanner;
// Belum Selesai
public class LoginSystemClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user = new User("Mahasiswa Umum", "100");
        AdminClass admin = new AdminClass("Admin434", "password434");
        MahasiswaClass mahasiswa = new MahasiswaClass("Ariel Ardiansyah", "202410370110434");

        int pilihan;
        do {
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Login: ");
            pilihan = input.nextInt();
        }while (pilihan < 1 || pilihan > 3);
        if (pilihan == 1){
            System.out.print("Masukkan username: ");
            admin.inputUsername = input.next();
            input.nextLine();
            System.out.print("Masukkan Password: ");
            admin.inputPassword = input.next();
            input.nextLine();

            admin.login();
            admin.displayInfo();
        } else if (pilihan == 2) {
            System.out.print("Masukkan username: ");
            mahasiswa.inputUsername = input.next();
            input.nextLine();
            System.out.print("Masukkan Password: ");
            mahasiswa.inputPassword = input.next();
            input.nextLine();

            mahasiswa.login();
            mahasiswa.displayInfo();
        } else {
            System.out.println("Terima Kasih! Sampai jumpa lagi!!!!");
        }
    }
}

