import java.util.Scanner;

class Admin {
    String InputUsername, InputPass;
    String Username = "Admin434";
    String password = "password434";

    void login() {
        Scanner input = new Scanner(System.in);

        while (!InputUsername.equals(Username) || !InputPass.equals(password)) {
            System.out.println("------------------------------------------");
            System.out.println("|   Username atau Password salah!        |");
            System.out.println("------------------------------------------");
            System.out.print("Masukkan Username : ");
            InputUsername = input.nextLine();
            System.out.print("Masukkan Password : ");
            InputPass = input.nextLine();
        }

        System.out.println("\n---------------------------------------------");
        System.out.println("|         >>> LOGIN ADMIN BERHASIL! <<<     |");
        System.out.println("---------------------------------------------");

        input.close();
    }
}
