import java.util.Scanner;
// Belum selesai
class Mahasiswa {
    String InputNama, InputNim;
    String nama = "Ariel Ardiansyah";
    String nim = "202410370110434";

    void login(){
        Scanner input = new Scanner(System.in);

        while (!InputNim.equals(nama) && !InputNim.equals(nim)){
            System.out.println("Nama atau Nim Salah! , Silahkan input lagi!");
            System.out.print("Masukkan Nama: ");
            InputNama = input.next();
            input.nextLine();
            System.out.print("Masukkan NIm: ");
            InputNim = input.nextLine();
        }
        System.out.println("Login Berhasil");
        input.close();
    }

    void displayInfo(){
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nim Mahasiswa: " + nim);
    }

}
