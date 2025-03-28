import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("   WELCOME TO THE BATTLE ARENA!    ");
        System.out.println("====================================");
        System.out.println("Siapkan diri Anda untuk bertarung!\n");

        // Untuk input data Pahlawan
        System.out.println("---------- INPUT DATA PAHLAWAN ----------");
        System.out.print("Masukkan nama Pahlawan: ");
        String namaPahlawan = input.nextLine();

        int kesehatanPahlawan;
        do {
            System.out.print("Masukkan kesehatan Pahlawan: ");
            kesehatanPahlawan = input.nextInt();
            if (kesehatanPahlawan <= 0) {
                System.out.println("Input kesehatan tidak valid! Kesehatan harus lebih besar dari 0.");
            }
        } while (kesehatanPahlawan <= 0);
        input.nextLine();


        System.out.print("Masukkan skill Pahlawan: ");
        String skillPahlawan = input.nextLine();

        System.out.print("Masukkan kekuatan skill Pahlawan: ");
        int kekuatanskillPahlawan = input.nextInt();
        input.nextLine();

        // Untuk input data Musuh
        System.out.println("\n---------- INPUT DATA MUSUH ----------");
        System.out.print("Masukkan nama Musuh: ");
        String namaMusuh = input.nextLine();

        int kesehatanMusuh;
        do {
            System.out.print("Masukkan kesehatan Musuh: ");
            kesehatanMusuh = input.nextInt();
            if (kesehatanMusuh <= 0) {
                System.out.println("Input kesehatan tidak valid! Kesehatan harus lebih besar dari 0.");
            }
        } while (kesehatanMusuh <= 0);
        input.nextLine();

        System.out.print("Masukkan skill Musuh: ");
        String skillMusuh = input.nextLine();

        System.out.print("Masukkan kekuatan skill Musuh: ");
        int kekuatanskillMusuh = input.nextInt();

        KarakterGame masyarakatDesa = new KarakterGame("Masyarakat umum", 200, "cangkul", 10);
        Pahlawan mainCharacter = new Pahlawan(namaPahlawan, kesehatanPahlawan, skillPahlawan, kekuatanskillPahlawan);
        Musuh villain = new Musuh(namaMusuh, kesehatanMusuh, skillMusuh, kekuatanskillMusuh);

        // Status awal
        System.out.println("\n====================================");
        System.out.println("Status Awal Kesehatan:");
        System.out.println(mainCharacter.getNama() + " memiliki kesehatan: " + mainCharacter.getKesehatan());
        System.out.println(villain.getNama() + " memiliki kesehatan: " + villain.getKesehatan());
        System.out.println("====================================\n");

        // Pertarungan dimulai
        System.out.println(">>> PERTARUNGAN DIMULAI <<<");
        System.out.println("====================================");

        // Pertarungan antara Pahlawan dan Musuh
        mainCharacter.serang(villain);
        System.out.println("====================================");
        villain.serang(mainCharacter);
        System.out.println("====================================");

        // Hasil pertarungan
        if (kesehatanPahlawan == kesehatanMusuh) {
            System.out.println(">>> Pertarungan berakhir imbang <<<");
        } else if(kesehatanPahlawan > kesehatanMusuh){
            System.out.println(namaPahlawan + " memenangkan pertarungan");
        } else if(kesehatanMusuh > kesehatanPahlawan){
            System.out.println(namaMusuh + " memenangkan pertarungan");
        } else {
            System.out.println(">>> Pertarungan selesai! <<<");
        }
        System.out.println("====================================");
    }
}