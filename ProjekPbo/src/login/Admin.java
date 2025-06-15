package login;

import sistem.Menu;
import sistem.Laporan;
import sistem.Aspirasi;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin implements Menu {
    Scanner input = new Scanner(System.in);
    ArrayList<Laporan> daftarLaporan;
    ArrayList<Aspirasi> daftarAspirasi;
    public String username = "Hardiarzah";
    public String password = "434";

    public Admin(ArrayList<Laporan> daftarLaporan, ArrayList<Aspirasi> daftarAspirasi) {
        this.daftarLaporan = daftarLaporan;
        this.daftarAspirasi = daftarAspirasi;
    }

    public void loginAdmin() {
        String passworAdmin;
        String usernameAdmin;
        do {
            System.out.print("\nMasukkan Username: ");
            usernameAdmin = input.nextLine();
            System.out.print("Masukkan Password: ");
            passworAdmin = input.nextLine();
            System.out.println();

            if (!(usernameAdmin.equals(username) || passworAdmin.equals(password))) {
                System.out.println("Username atau Password salah!, silahkan input kembali");
            }

        } while (!(usernameAdmin.equals(username) || passworAdmin.equals(password)));

        System.out.println("Login berhasil\n");
    }

    public void tampilkanMenu() {
        int pilihan = 0;

        while (pilihan != 7) {
            System.out.println("===== MENU ADMIN =====");
            System.out.println("1. Lihat Semua Laporan");
            System.out.println("2. Edit Status Laporan");
            System.out.println("3. Hapus Laporan");
            System.out.println("4. Lihat Semua Aspirasi");
            System.out.println("5. Edit Status Aspirasi");
            System.out.println("6. Hapus Aspirasi");
            System.out.println("7. Kembali");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(input.nextLine());

            if (pilihan == 1) {
                lihatLaporan();
            } else if (pilihan == 2) {
                editStatusLaporan();
            } else if (pilihan == 3) {
                hapusLaporan();
            } else if (pilihan == 4) {
                lihatAspirasi();
            } else if (pilihan == 5) {
                editStatusAspirasi();
            } else if (pilihan == 6) {
                hapusAspirasi();
            } else if (pilihan == 7) {
                System.out.println("Kembali ke menu utama.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void lihatLaporan() {
        System.out.println("\n=== Daftar Laporan ===");
        if (daftarLaporan.size() == 0) {
            System.out.println("Belum ada laporan.\n");
        } else {
            for (int i = 0; i < daftarLaporan.size(); i++) {
                System.out.println("Laporan ke-" + (i + 1));
                daftarLaporan.get(i).tampilkanLaporan();
            }
        }
    }

    private void editStatusLaporan() {
        System.out.println("\n=== Edit Status Laporan ===");
        if (daftarLaporan.size() == 0) {
            System.out.println("Tidak ada laporan untuk diedit.\n");
            return;
        }

        for (int i = 0; i < daftarLaporan.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + daftarLaporan.get(i).namaLengkap + " - Status: " + daftarLaporan.get(i).status);
        }

        System.out.print("Pilih nomor laporan: ");
        int nomor = Integer.parseInt(input.nextLine());

        if (nomor >= 1 && nomor <= daftarLaporan.size()) {
            System.out.println("1. Sudah diterima");
            System.out.println("2. Sudah diselesaikan");
            System.out.print("Pilih status baru: ");
            int statusBaru = Integer.parseInt(input.nextLine());

            if (statusBaru == 1) {
                daftarLaporan.get(nomor - 1).status = "Sudah diterima";
            } else if (statusBaru == 2) {
                daftarLaporan.get(nomor - 1).status = "Sudah diselesaikan";
            } else {
                System.out.println("Status tidak valid.");
            }
        } else {
            System.out.println("Nomor tidak ditemukan.");
        }
    }

    private void hapusLaporan() {
        System.out.println("\n=== Hapus Laporan ===");
        if (daftarLaporan.size() == 0) {
            System.out.println("Tidak ada laporan yang bisa dihapus.\n");
            return;
        }

        for (int i = 0; i < daftarLaporan.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + daftarLaporan.get(i).namaLengkap);
        }

        System.out.print("Pilih nomor laporan: ");
        int nomor = Integer.parseInt(input.nextLine());

        if (nomor >= 1 && nomor <= daftarLaporan.size()) {
            daftarLaporan.remove(nomor - 1);
            System.out.println("Laporan berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak ditemukan.");
        }
    }

    private void lihatAspirasi() {
        System.out.println("\n=== Daftar Aspirasi ===");
        if (daftarAspirasi.size() == 0) {
            System.out.println("Belum ada aspirasi.\n");
        } else {
            for (int i = 0; i < daftarAspirasi.size(); i++) {
                System.out.println("Aspirasi ke-" + (i + 1));
                daftarAspirasi.get(i).tampilkanAspirasi();
            }
        }
    }

    private void editStatusAspirasi() {
        System.out.println("\n=== Edit Status Aspirasi ===");
        if (daftarAspirasi.size() == 0) {
            System.out.println("Tidak ada aspirasi untuk diedit.\n");
            return;
        }

        for (int i = 0; i < daftarAspirasi.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + daftarAspirasi.get(i).namaLengkap + " - Status: " + daftarAspirasi.get(i).status);
        }

        System.out.print("Pilih nomor aspirasi: ");
        int nomor = Integer.parseInt(input.nextLine());

        if (nomor >= 1 && nomor <= daftarAspirasi.size()) {
            System.out.println("1. Sudah diterima");
            System.out.println("2. Sudah diselesaikan");
            System.out.print("Pilih status baru: ");
            int statusBaru = Integer.parseInt(input.nextLine());

            if (statusBaru == 1) {
                daftarAspirasi.get(nomor - 1).status = "Sudah diterima";
            } else if (statusBaru == 2) {
                daftarAspirasi.get(nomor - 1).status = "Sudah diselesaikan";
            } else {
                System.out.println("Status tidak valid.");
            }
        } else {
            System.out.println("Nomor tidak ditemukan.");
        }
    }

    private void hapusAspirasi() {
        System.out.println("\n=== Hapus Aspirasi ===");
        if (daftarAspirasi.size() == 0) {
            System.out.println("Tidak ada aspirasi untuk dihapus.\n");
            return;
        }

        for (int i = 0; i < daftarAspirasi.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + daftarAspirasi.get(i).namaLengkap);
        }

        System.out.print("Pilih nomor aspirasi: ");
        int nomor = Integer.parseInt(input.nextLine());

        if (nomor >= 1 && nomor <= daftarAspirasi.size()) {
            daftarAspirasi.remove(nomor - 1);
            System.out.println("Aspirasi berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak ditemukan.");
        }
    }
}