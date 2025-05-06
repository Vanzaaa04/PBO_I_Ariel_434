package app;

// Mengimpor semua class di dalam package Herbivora
import Herbivora.*;

public class Main {
    public static void main(String[] args){

        // Membuat objek pahlawan dengan nama dan senjata
        Fighter karakter = new Fighter("Ariel Pendragon", "Excalibur");

        // Menampilkan cerita tentang musuh
        karakter.Musuh("Anos Voldigoad", "Death Sword");

        // Menampilkan cerita tentang pahlawan
        karakter.Pahlawan();

        // Membuat objek kuda dengan nama, umur, dan kecepatan
        Kuda kuda = new Kuda("Silver", "5", "300");

        // Menampilkan kisah kuda saat bertempur bersama pahlawan
        kuda.displayInfo();

        // Menampilkan profil lengkap dari kuda
        kuda.tampilProfil();
    }
}
