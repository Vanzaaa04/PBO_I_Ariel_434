package Flora;
// Class Main juga berada dalam package 'flora' agar bisa menggunakan class Tanaman dan Rumput.

public class Main {
    // Class Main berfungsi sebagai titik awal (entry point) program Java dijalankan.

    public static void main(String[] args) {
        // Method main adalah method utama yang akan dieksekusi pertama kali saat program dijalankan.

        Tanaman tanaman = new Rumput("Rumput Jepang", "Monokotil", 4);
        // Ini adalah contoh dari polymorphism:
        // Objek bertipe induk (Tanaman), tetapi isinya adalah objek class anak (Rumput).
        // Artinya kita menyimpan objek Rumput ke dalam variabel bertipe Tanaman.

        tanaman.deskripsi();
        // Saat method deskripsi() dipanggil, yang dijalankan adalah milik class Rumput (bukan Tanaman).
        // Ini karena method tersebut di-override, dan Java otomatis memilih method yang sesuai isi objeknya.
    }
}
