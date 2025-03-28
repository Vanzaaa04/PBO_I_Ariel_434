import java.util.Scanner;
// Belum selesai
public class User {
    String nama;
    String nim;

    User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama() {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void login() {
        System.out.println("Login Berhasil!");
    }

    public void displayInfo() {
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("Nim Mahasiswa: " + nim);
    }
}

class AdminClass extends User {
    Scanner input = new Scanner(System.in);
    String inputUsername, inputPassword;

    AdminClass(String nama, String nim){
        super(nama, nim);
    }

    @Override
    public void login() {
        while (!inputUsername.equals(getNama()) && !inputPassword.equals(getNim())){
            System.out.println("Username atau Password salah, Silahkan Input kembali!");
            System.out.print("Masukkan Username: ");
            inputUsername = input.next();
            input.nextLine();
            System.out.print("Masukkan Password: ");
            inputPassword = input.nextLine();
        }
        System.out.println();


    }

    @Override public void displayInfo(){
        System.out.println("Login Berhasil!");
    }
}

class MahasiswaClass extends User{

    Scanner input = new Scanner(System.in);
    String inputUsername, inputPassword;

    MahasiswaClass(String nama, String nim){
        super(nama, nim);
    }

    @Override
    public void login() {
        while (!inputUsername.equals(getNama()) && !inputPassword.equals(getNim())){
            System.out.println("Username atau Password salah, Silahkan Input kembali!");
            System.out.print("Masukkan Username: ");
            inputUsername = input.next();
            input.nextLine();
            System.out.print("Masukkan Password: ");
            inputPassword = input.nextLine();
        }
        System.out.println();
    }

    @Override public void displayInfo(){
        System.out.println("Login Berhasil!");
    }

}
