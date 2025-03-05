import java.util.Scanner;

public class Tugas1Modul1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputUser, inputPass, inputNama, nimMahasiswa;

        System.out.println("==========================================================");
        System.out.println("         SELAMAT DATANG DI SISTEM LOGIN SEDERHANA         ");
        System.out.println("==========================================================");
        System.out.println("| 1. ADMIN                                               |");
        System.out.println("| 2. MAHASISWA                                           |");
        System.out.println("| 3. KELUAR                                              |");
        System.out.println("==========================================================");

        System.out.print("Silahkan Pilih Menu Login: ");
        int login = input.nextInt();
        input.nextLine();

        while (login < 1 || login > 3){
            System.out.println("----------------------------------------");
            System.out.println("PILIHAN TIDAK VALID! SILAHKAN COBA LAGI.");
            System.out.println("----------------------------------------");
            System.out.print("Silahkan Pilih Menu Login: ");
            login = input.nextInt();
            input.nextLine();
        }

        if (login == 1) {
            String username = "Admin434";
            String pass = "password434";

            System.out.println("\n\n==========================================================");
            System.out.println("              SELAMAT DATANG DI MENU ADMIN         ");
            System.out.println("==========================================================");
            do {
                System.out.print("Masukkan Username: ");
                inputUser = input.nextLine();
                System.out.print("Masukkan Password: ");
                inputPass = input.nextLine();

                if (!inputUser.equals(username) || !inputPass.equals(pass)) {
                    System.out.println("\n-------------------------------------------");
                    System.out.println("LOGIN GAGAL! USERNAME ATAU PASSWORD SALAH.");
                    System.out.println("-------------------------------------------");
                }
            } while (!(inputUser.equals(username) && inputPass.equals(pass)));

            System.out.println("========================================");
            System.out.println("        LOGIN ADMIN BERHASIL!           ");
            System.out.println("========================================");

        } else if (login == 2) {
            String name = "Ariel Ardiansyah";
            String nim = "202410370110434";

            System.out.println("\n\n==========================================================");
            System.out.println("            SELAMAT DATANG DI MENU MAHASISWA         ");
            System.out.println("==========================================================");
            do {
                System.out.print("Masukkan Nama: ");
                inputNama = input.nextLine();
                System.out.print("Masukkan Nim: ");
                nimMahasiswa = input.next();
                input.nextLine();

                if (!inputNama.equals(name) || !nimMahasiswa.equals(nim)) {
                    System.out.println("\n---------------------------------------------");
                    System.out.println("LOGIN GAGAL! NAMA ATAU NIM SALAH. COBA LAGI.");
                    System.out.println("---------------------------------------------");
                }
            } while (!(inputNama.equals(name) && nimMahasiswa.equals(nim)));

            System.out.println("========================================");
            System.out.println("        LOGIN MAHASISWA BERHASIL!       ");
            System.out.println("========================================");
            System.out.println("\nDATA MAHASISWA");
            System.out.println("----------------------------------------");
            System.out.println("Nama: " + name);
            System.out.println("NIM : " + nim);
            System.out.println("========================================");
        } else {
            System.out.println("========================================");
            System.out.println("        TERIMA KASIH! SAMPAI JUMPA.      ");
            System.out.println("========================================");
        }
        input.close();
    }
}