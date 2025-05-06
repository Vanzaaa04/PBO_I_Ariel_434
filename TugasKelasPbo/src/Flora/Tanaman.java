package Flora;
// Menyatakan bahwa file ini merupakan bagian dari package bernama 'flora'.
// Package digunakan untuk mengelompokkan class-class yang saling berhubungan agar lebih terstruktur.

public class Tanaman {
    // Class Tanaman merupakan class induk yang merepresentasikan tanaman secara umum.

    protected String nama;
    // Atribut 'nama' digunakan untuk menyimpan nama tanaman, contohnya "Rumput Jepang".
    // Modifier 'protected' artinya bisa diakses oleh class turunan dan class dalam package yang sama.

    protected String jenis;
    // Atribut 'jenis' untuk menyimpan jenis tanaman, seperti "Monokotil".

    protected int umur;
    // Atribut 'umur' menyimpan umur tanaman dalam satuan bulan, contohnya 4.

    public Tanaman(String nama, String jenis, int umur) {
        // Konstruktor dengan parameter yang digunakan untuk mengisi nilai saat objek dibuat.
        this.nama = nama;   // Mengisi nilai parameter 'nama' ke atribut milik objek (this.nama).
        this.jenis = jenis; // Mengisi nilai parameter 'jenis' ke atribut objek.
        this.umur = umur;   // Mengisi nilai parameter 'umur' ke atribut objek.
    }

    public void deskripsi() {
        // Method ini akan menampilkan informasi umum tentang tanaman ke output.
        System.out.println("============================================");
        System.out.println("||         INFORMASI TANAMAN UMUM         ||");
        System.out.println("============================================");
        System.out.println("|| Nama Tanaman  : " + nama);         // Menampilkan nama tanaman.
        System.out.println("|| Jenis Tanaman : " + jenis);        // Menampilkan jenis tanaman.
        System.out.println("|| Umur Tanaman  : " + umur + " bulan"); // Menampilkan umur tanaman.
        System.out.println("============================================");
    }
}