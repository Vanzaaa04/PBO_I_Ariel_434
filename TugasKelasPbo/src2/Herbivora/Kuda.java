package Herbivora;

// Class Kuda adalah turunan dari class abstract Hewan
public class Kuda extends Hewan {

    // Konstruktor untuk memberi nilai pada properti kuda
    public Kuda(String nama, String umur, String kecepatan){
        super(nama, umur, kecepatan);
    }

    // Cerita tentang peran kuda dalam pertempuran
    @Override
    public void displayInfo(){
        System.out.println();
        System.out.println("Dalam pertempuran terakhir, sang pahlawan tidak sendiri.");
        System.out.println("Ia ditemani oleh seekor kuda pemberani bernama " + nama + ".");
        System.out.println("Meskipun baru berusia " + umur + " tahun, semangatnya membara di medan perang.");
        System.out.println("Dengan kecepatan lari " + kecepatan + " km/h,");
        System.out.println(nama + " menjadi andalan dalam menembus barisan musuh.");
        System.out.println("Bersama, mereka menorehkan kisah yang akan dikenang sepanjang masa.");
    }

    // Menampilkan data profil lengkap dari kuda
    public void tampilProfil(){
        System.out.println();
        System.out.println("=========================================");
        System.out.println("||              PROFIL KUDA            ||");
        System.out.println("=========================================");
        System.out.println("Nama kuda      : " + nama);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("Kecepatan lari : " + kecepatan + " km/h");
    }
}
