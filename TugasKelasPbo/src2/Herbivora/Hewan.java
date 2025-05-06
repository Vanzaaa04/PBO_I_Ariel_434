package Herbivora;

// Class abstract sebagai dasar untuk semua hewan
public abstract class Hewan {
    String nama;       // Menyimpan nama hewan
    String umur;       // Menyimpan umur hewan
    String kecepatan;  // Menyimpan kecepatan hewan

    // Konstruktor untuk memberi nilai awal pada properti hewan
    public Hewan(String nama, String umur, String kecepatan){
        this.nama = nama;
        this.umur = umur;
        this.kecepatan = kecepatan;
    }

    // Method abstract yang wajib dibuat ulang oleh class turunan
    public abstract void displayInfo();
}
