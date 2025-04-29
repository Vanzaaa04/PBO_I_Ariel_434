import java.util.Scanner;

class MahasiswaClass extends User {
    Scanner input = new Scanner(System.in);
    String inputUsername, inputPassword;

    MahasiswaClass(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login() {
        while (!inputUsername.equals(getNama()) || !inputPassword.equals(getNim())) {
            System.out.println("\n==================================================");
            System.out.println("||      NAMA ATAU NIM TIDAK SESUAI!             ||");
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
        System.out.println("||      >>> LOGIN MAHASISWA BERHASIL <<<       ||");
        System.out.println("==================================================");
    }
}
