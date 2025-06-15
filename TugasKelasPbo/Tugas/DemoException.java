import java.util.Scanner; // Import library Scanner agar program bisa membaca input dari pengguna

public class DemoException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk menerima input dari keyboard

        int[] data = {10, 20, 30}; // Array berisi tiga data bilangan bulat bertipe integer

        try {
            System.out.print("Masukkan indeks array (0-2): "); // Meminta pengguna untuk memasukkan indeks array
            int index = input.nextInt(); // Menyimpan input dari pengguna ke dalam variabel index

            System.out.println("Data: " + data[index]); // Menampilkan data sesuai dengan indeks yang dimasukkan
        } catch (ArrayIndexOutOfBoundsException e) {
            // Menangani error jika pengguna memasukkan indeks yang tidak tersedia dalam array
            System.out.println("Error: Indeks yang dimasukkan tidak tersedia.");
        } catch (Exception e) {
            // Menangani error lain yang mungkin terjadi saat proses input atau output
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
