import java.util.Scanner;

class Mahasiswa {
    String InputNama, InputNim;
    String nama = "Ariel Ardiansyah";
    String nim = "202410370110434";

    void login() {
        Scanner input = new Scanner(System.in);

        while (!InputNama.equals(nama) || !InputNim.equals(nim)) {
            System.out.println("\n----------------------------------------------------");
            System.out.println("|   LOGIN GAGAL! NAMA ATAU NIM TIDAK SESUAI.       |");
            System.out.println("----------------------------------------------------");

            System.out.print("Masukkan Nama : ");
            InputNama = input.nextLine();
            input.nextLine();
            System.out.print("Masukkan NIM  : ");
            InputNim = input.nextLine();
        }

        System.out.println("\n----------------------------------------------------");
        System.out.println("|       >>> LOGIN MAHASISWA BERHASIL! <<<          |");
        System.out.println("----------------------------------------------------");
    }

    void displayInfo() {
        System.out.println("\n========================================");
        System.out.println("|            DATA MAHASISWA            |");
        System.out.println("========================================");
        System.out.println("| Nama : " + nama);
        System.out.println("| NIM  : " + nim);
        System.out.println("========================================");
    }
}
