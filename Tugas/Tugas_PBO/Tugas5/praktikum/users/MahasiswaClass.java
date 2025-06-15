package praktikum.users;

import praktikum.actions.MahasiswaActions;
import praktikum.main.LoginSystemClass;
import praktikum.models.Item;

import java.util.Scanner;

public class MahasiswaClass extends User implements MahasiswaActions {
    Scanner input = new Scanner(System.in);
    int pilihanMenu;

    public MahasiswaClass(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Username: ");
        String user = scan.nextLine();
        System.out.print("Masukkan Password: ");
        String pass = scan.nextLine();

        for (User u : LoginSystemClass.userList) {
            if (u instanceof MahasiswaClass && u.getNama().equals(user) && u.getNim().equals(pass)) {
                displayInfo();
                displayAppMenu();
                return;
            }
        }
        System.out.println("Login gagal. Coba lagi.");
    }

    @Override
    public void displayInfo() {
        System.out.println("\n==================================================");
        System.out.println("||      >>> LOGIN MAHASISWA BERHASIL <<<       ||");
        System.out.println("==================================================");
    }

    @Override
    public void reportItem() {
        input.nextLine();
        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = input.nextLine();
        System.out.print("Masukkan Deskripsi Barang: ");
        String deskripsiBarang = input.nextLine();
        System.out.print("Masukkan Lokasi Terakhir/Ditemukan: ");
        String lokasiDitemukan = input.nextLine();

        Item item = new Item(namaBarang, deskripsiBarang, lokasiDitemukan);
        LoginSystemClass.reportedItems.add(item);

        System.out.println("\n>> Data Barang Telah Dicatat. Terima Kasih! <<");
    }

    @Override
    public void viewReportedItems() {
        boolean found = false;
        System.out.println("\nDaftar Barang yang Dilaporkan:");
        for (Item item : LoginSystemClass.reportedItems) {
            if ("Reported".equals(item.getStatus())) {
                System.out.println("- " + item.getNamaBarang() + " | " + item.getDeskripsi() +
                        " | Lokasi: " + item.getLokasi());
                found = true;
            }
        }
        if (!found) {
            System.out.println(">> Belum ada laporan barang. <<");
        }
    }

    @Override
    public void displayAppMenu() {
        do {
            System.out.println("\n==================================================");
            System.out.println("||              MENU MAHASISWA                 ||");
            System.out.println("==================================================");
            System.out.println("||  1. Laporkan Barang Temuan/Hilang           ||");
            System.out.println("||  2. Lihat Daftar Laporan                    ||");
            System.out.println("||  0. Logout                                  ||");
            System.out.println("==================================================");
            System.out.print("Pilih menu: ");
            try {
                pilihanMenu = input.nextInt();
            } catch (Exception e) {
                System.out.println(">> Input harus berupa angka! <<");
                input.nextLine();
                continue;
            }

            switch (pilihanMenu) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    System.out.println(">> Logout Berhasil <<");
                    break;
                default:
                    System.out.println(">> Pilihan Menu Tidak Valid <<");
            }
        } while (pilihanMenu != 0);
    }
}
