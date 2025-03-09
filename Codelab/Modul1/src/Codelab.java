import java.time.Year;
import java.util.Scanner;
public class Codelab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        char kecil;
        do {
            System.out.print("Masukkan Gender (P atau L): ");
            char gender = input.next().charAt(0);
            kecil = Character.toLowerCase(gender);
        } while(kecil != 'l' && kecil != 'p');

        System.out.print("Masukkan Tahun Lahir: ");
        int lahir = input.nextInt();
        int tahunSekarang = Year.now().getValue();
        int umur = tahunSekarang - lahir;
        System.out.println("\nDATA DIRI: ");
        System.out.println("Nama: " + nama);
        switch (kecil) {
            case 'l' -> System.out.println("Jenis Kelamin: Laki-laki");
            case 'p' -> System.out.println("Jenis Kelamin: Perempuan");
        }

        System.out.println("Umur: " + umur + " tahun");
        input.close();
    }
}
