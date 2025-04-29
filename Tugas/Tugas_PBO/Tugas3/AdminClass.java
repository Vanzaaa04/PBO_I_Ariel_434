import java.util.Scanner;

class AdminClass extends User {
    Scanner input = new Scanner(System.in);
    String inputUsername, inputPassword;

    AdminClass(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login() {
        while (!inputUsername.equals(getNama()) || !inputPassword.equals(getNim())) {
            System.out.println("\n==================================================");
            System.out.println("||      USERNAME ATAU PASSWORD SALAH!           ||");
            System.out.println("==================================================");
            System.out.print("Masukkan Username: ");
            inputUsername = input.next();
            input.nextLine();
            System.out.print("Masukkan Password: ");
            inputPassword = input.nextLine();
        }

    }

    @Override
    public void displayInfo() {
        System.out.println("\n==================================================");
        System.out.println("||         >>> LOGIN ADMIN BERHASIL <<<        ||");
        System.out.println("==================================================");
    }
}
