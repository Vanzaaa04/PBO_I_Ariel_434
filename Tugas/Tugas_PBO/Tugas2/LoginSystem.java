import java.util.Scanner;
// belum selesai
public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        int pilihan;

        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Keluar");

        do {
            System.out.print("pilih menu login: ");
            pilihan = input.nextInt();

            if ( pilihan < 1 || pilihan > 3 ){
                System.out.println("Pilihan tidak Valid, Input lagi!");
            }
        } while ( pilihan < 1 || pilihan > 3 );

        if( pilihan == 1 ){
            System.out.print("Masukkan Username: ");
            admin.InputUsername = input.next();
            input.nextLine();
            System.out.print("Masukkan Password: ");
            admin.InputPass = input.nextLine();

            admin.login();

        } else if ( pilihan == 2 ){
            System.out.print("Masukkan Nama: ");
            mahasiswa.InputNama = input.next();
            input.nextLine();
            System.out.print("Masukkan NIm: ");
            mahasiswa.InputNim = input.nextLine();

            mahasiswa.login();
            mahasiswa.displayInfo();

        } else {
            System.out.println("Terima Kasih");
        }
        input.close();
    }
}
