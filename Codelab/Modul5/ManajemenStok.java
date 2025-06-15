import java.util.ArrayList;             // Mengimpor class ArrayList untuk membuat daftar barang
import java.util.InputMismatchException;// Mengimpor class exception jika input tidak sesuai tipe
import java.util.Scanner;               // Mengimpor Scanner untuk input dari pengguna

public class ManajemenStok {            // Class utama yang menjalankan logika program
    public static void main (String[] args){       // Method main: titik masuk utama program
        Scanner input = new Scanner(System.in);    // Membuat objek Scanner untuk membaca input dari user
        ArrayList<Barang> daftarBarang = new ArrayList<>();  // Membuat ArrayList untuk menyimpan objek Barang
        daftarBarang.add(new Barang("penghapus", 10));       // Menambahkan 1 barang default (penghapus) dengan stok 10

        boolean run = true;             // Flag untuk menjalankan program selama nilai true

        while (run){                    // Loop utama program (menu), akan terus berulang hingga run == false
            System.out.println("\n========================================");  // Header menu
            System.out.println("||          PROGRAM MANAJEMEN STOK    ||");
            System.out.println("========================================");
            System.out.println("||  1. Tambah Barang Baru             ||"); // Opsi tambah
            System.out.println("||  2. Tampilkan Semua Barang         ||"); // Opsi tampil
            System.out.println("||  3. Kurangi Stok Barang            ||"); // Opsi kurangi
            System.out.println("||  0. Keluar                         ||"); // Opsi keluar
            System.out.println("========================================");
            System.out.print("|| Pilih opsi: ");  // Meminta input opsi dari user
            int pilihan;                         // Variabel untuk menyimpan input pilihan
            try {
                pilihan = input.nextInt();       // Membaca input angka dari user
                input.nextLine();                // Membuang newline (\n) agar tidak tertinggal
            } catch (InputMismatchException e) { // Menangani input non-angka
                System.out.println("|| Input harus berupa angka!");
                input.nextLine();                // Membersihkan buffer
                continue;                        // Kembali ke awal loop
            }

            // === TAMBAH BARANG ===
            if (pilihan == 1){
                System.out.println("\n========================================");
                System.out.println("||         TAMBAH BARANG BARU         ||");
                System.out.println("========================================");
                System.out.print("|| Masukkan Nama Barang : ");
                String namaBarang = input.nextLine();  // Input nama barang

                System.out.print("|| Masukkan Stok Barang : ");
                try {
                    int stokBarang = input.nextInt();  // Input stok
                    input.nextLine();                 // Buang newline
                    daftarBarang.add(new Barang(namaBarang, stokBarang)); // Tambah ke daftar
                    System.out.println("|| Barang berhasil ditambahkan!");
                } catch (InputMismatchException e) {
                    System.out.println("|| Input stok harus berupa angka!");
                    input.nextLine();                // Buang input yang salah
                }

                // === TAMPILKAN BARANG ===
            } else if(pilihan == 2){
                System.out.println("\n========================================");
                System.out.println("||       DAFTAR SEMUA BARANG          ||");
                System.out.println("========================================");
                if(daftarBarang.isEmpty()){           // Cek jika kosong
                    System.out.println("|| Stok barang kosong.");
                } else {
                    int i = 0;                         // Counter untuk indeks
                    for (Barang barang : daftarBarang){
                        System.out.println("|| " + i + ". Nama Barang : " + barang.getNama() + ", Stok: " + barang.getStok());
                        i++;
                    }
                }

                // === KURANGI STOK ===
            } else if (pilihan == 3){
                System.out.println("\n========================================");
                System.out.println("||         KURANGI STOK BARANG        ||");
                System.out.println("========================================");
                for (int i = 0 ; i < daftarBarang.size() ; i++){   // Menampilkan semua barang
                    Barang barang = daftarBarang.get(i);
                    System.out.println("|| " + i + ". Nama Barang : " + barang.getNama() + ", Stok: " + barang.getStok());
                }

                System.out.print("|| Masukkan nomor index barang : ");
                try {
                    int nomor = input.nextInt();        // Input indeks
                    input.nextLine();                   // Buang newline
                    System.out.print("|| Masukkan jumlah stok diambil : ");
                    int jumlahAmbil = input.nextInt();  // Input jumlah pengurangan
                    input.nextLine();                   // Buang newline
                    Barang barang = daftarBarang.get(nomor);  // Ambil barang berdasarkan indeks

                    if (jumlahAmbil > barang.getStok()){       // Jika pengurangan melebihi stok
                        throw new StokTidakCukupException("Stok untuk '" + barang.getNama() + "' hanya tersisa " + barang.getStok());
                    } else {
                        barang.setStok(barang.getStok() - jumlahAmbil);  // Kurangi stok
                        System.out.println("|| Stok Barang '" + barang.getNama() + "' berhasil dikurangi.");
                        System.out.println("|| Sisa Stok: " + barang.getStok());
                    }

                } catch (InputMismatchException e){
                    System.out.println("|| Input harus berupa angka!");
                } catch (IndexOutOfBoundsException e){
                    System.out.println("|| Index barang tidak ditemukan!");
                } catch (StokTidakCukupException e){
                    System.out.println("|| " + e.getMessage());
                }

                // === KELUAR ===
            } else if(pilihan == 0){
                System.out.println("\n========================================");
                System.out.println("||         TERIMA KASIH TELAH         ||");
                System.out.println("||       MENGGUNAKAN PROGRAM INI      ||");
                System.out.println("========================================");
                run = false;         // Menghentikan loop utama

            } else {
                System.out.println("|| Pilihan opsi tidak valid.");  // Jika input pilihan tidak valid
            }
        }

        input.close();  // Menutup scanner untuk mencegah memory leak
    }
}
