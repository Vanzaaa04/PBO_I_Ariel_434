import  java.util.Scanner;
// Belum selesai
class Admin {
    String InputUsername = " ", InputPass = " ";
    String Username = "Admin434";
    String password = "password434";

    void login(){
        Scanner input = new Scanner(System.in);

        while (!InputUsername.equals(Username) && !InputPass.equals(password)){
            System.out.println("Username atau Password salah, Silahkan Input kembali!");
            System.out.print("Masukkan Username: ");
            InputUsername = input.next();
            input.nextLine();
            System.out.print("Masukkan Password: ");
            InputPass = input.nextLine();
        }
        System.out.println("LOgin berhasil!");
        input.close();
    }
}

