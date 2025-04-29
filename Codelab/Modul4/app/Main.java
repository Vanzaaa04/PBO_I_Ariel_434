package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args){
        NonFiksi nonFiksi = new NonFiksi("Madilog", "Tan Malaka", "(Bidang : Sejarah dan Ilmu Pengetahuan)");
        Fiksi fiksi = new Fiksi("Hainuwele : Sang Putri Kelapa", "Lilis Hu", "(Genre: Dongeng)");

        nonFiksi.displayInfo();
        fiksi.displayInfo();
        System.out.println();

        Anggota anggota = new Anggota("Ariel" , "(ID: I434)");
        Anggota anggota1 = new Anggota("Musa", "(ID: I411)");
        System.out.println();

        anggota.pinjamBuku(nonFiksi.judul);
        anggota1.pinjamBuku(fiksi.judul, 7);
        System.out.println();

        anggota.kembalikanBuku();
        anggota1.kembalikanBuku();

    }
}
