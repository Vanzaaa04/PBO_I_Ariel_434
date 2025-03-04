import java.util.Scanner;

public class Tugas1Modul1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\t Selamat Datang di Sistem Login Sederhana");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Keluar");
        System.out.print("Silahkan Pilih Menu Login: ");
        int login = input.nextInt();
        input.nextLine();
        String inputUser, inputPass, inputNama, nimMahasiswa;


        if (login == 1) {
            String username = "Admin434";
            String pass = "password434";

            System.out.print("\nMasukkan Username: ");
            inputUser = input.next();

            System.out.print("Masukkan Password: ");
            inputPass = input.next();

            if (inputUser.equals(username) && inputPass.equals(pass)) {
                System.out.println("Login Admin Berhasil!, Kamu Ganteng :) ");
            }else {
                System.out.println("Login gagal! Username atau Password salah.");
            }
        }else if(login == 2) {
            String name = "Ariel Ardiansyah";
            String nim = "202410370110434";

            System.out.print("\nMasukkan Nama: ");
            inputNama = input.nextLine();

            System.out.print("Masukkan Nim: ");
            nimMahasiswa = input.next();

            if (inputNama.equals(name) && nimMahasiswa.equals(nim)){
                System.out.println("\nLogin Mahasiswa berhasil!");
                System.out.println("\nDATA MAHASISWA: ");
                System.out.println("Nama: " + name);
                System.out.println("Nim: " + nim);
            }else{
                System.out.println("Login gagal! Nama atau Nim Salah. ");
            }
        }else if(login == 3){
            System.out.println("Terima Kasih!");
        }else{
            System.out.println("Pilihan Tidak Valid! MUlai ulang program.");
        }
        input.close();
    }
}