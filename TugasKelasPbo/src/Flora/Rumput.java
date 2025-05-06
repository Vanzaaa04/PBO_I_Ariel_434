package Flora;
// Class Rumput juga berada di dalam package 'flora' agar sesuai struktur dan bisa mengakses Tanaman.

public class Rumput extends Tanaman {
    // Class Rumput adalah class turunan (subclass) dari class Tanaman (superclass).
    // Artinya, Rumput mewarisi semua atribut dan method dari Tanaman.

    public Rumput(String nama, String jenis, int umur) {
        // Konstruktor Rumput menerima parameter yang sama dengan Tanaman.
        super(nama, jenis, umur);
        // Memanggil konstruktor dari class induk (Tanaman) untuk mengisi nilai atribut.
    }

    @Override
    public void deskripsi() {
        // Method ini menimpa (override) method deskripsi dari class Tanaman.
        // Dengan overriding, kita bisa menampilkan versi khusus milik class Rumput.

        System.out.println("============================================");
        System.out.println("||        INFORMASI KHUSUS RUMPUT         ||");
        System.out.println("============================================");
        System.out.println("|| Nama Tanaman  : " + nama);         // Menampilkan nama rumput.
        System.out.println("|| Jenis Tanaman : " + jenis);        // Menampilkan jenis rumput.
        System.out.println("|| Umur Tanaman  : " + umur + " bulan"); // Menampilkan umur rumput.
        System.out.println("|| Perawatan     : Disiram rutin dan cukup "); // Tambahan info.
        System.out.println("||                 sinar matahari.         ");
        System.out.println("============================================");
    }
}
