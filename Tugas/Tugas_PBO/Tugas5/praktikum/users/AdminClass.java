package praktikum.users;

import praktikum.actions.AdminActions;
import praktikum.main.LoginSystemClass;
import praktikum.models.Item;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminClass extends User implements AdminActions {
    Scanner input = new Scanner(System.in);
    int pilihanMenu;

    public AdminClass(String nama, String nim) {
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
            if (u instanceof AdminClass && u.getNama().equals(user) && u.getNim().equals(pass)) {
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
        System.out.println("||         >>> LOGIN ADMIN BERHASIL <<<        ||");
        System.out.println("==================================================");
    }

    @Override
    public void manageItems() {
        int pilihan = -1;
        do {
            System.out.println("\n>> Kelola Laporan Barang <<");
            System.out.println("1. Lihat Semua Laporan");
            System.out.println("2. Tandai Barang Telah Diambil (Claimed)");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            try {
                pilihan = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.nextLine();
                continue;
            }

            switch (pilihan) {
                case 1:
                    for (Item item : LoginSystemClass.reportedItems) {
                        System.out.println("- " + item.getNamaBarang() + " | " + item.getDeskripsi() +
                                " | Lokasi: " + item.getLokasi() + " | Status: " + item.getStatus());
                    }
                    break;
                case 2:
                    int index = 1;
                    for (Item item : LoginSystemClass.reportedItems) {
                        if ("Reported".equals(item.getStatus())) {
                            System.out.println(index + ". " + item.getNamaBarang() + " - " + item.getDeskripsi());
                        }
                        index++;
                    }

                    System.out.print("Masukkan nomor laporan: ");
                    try {
                        int pilihanIndex = input.nextInt();
                        Item itemDipilih = LoginSystemClass.reportedItems.get(pilihanIndex - 1);
                        itemDipilih.setStatus("Claimed");
                        System.out.println(">> Status berhasil diubah menjadi 'Claimed'. <<");
                    } catch (InputMismatchException e) {
                        System.out.println(">> Input harus berupa angka! <<");
                        input.nextLine();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(">> Nomor laporan tidak valid! <<");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    @Override
    public void manageUsers() {
        int pilihan = -1;
        do {
            System.out.println("\n>> Kelola Mahasiswa <<");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            try {
                pilihan = input.nextInt();
                input.nextLine(); // buang newline
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.nextLine();
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    LoginSystemClass.userList.add(new MahasiswaClass(nama, nim));
                    System.out.println(">> Mahasiswa berhasil ditambahkan. <<");
                    break;
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang ingin dihapus: ");
                    String targetNim = input.nextLine();
                    boolean found = false;
                    for (int i = 0; i < LoginSystemClass.userList.size(); i++) {
                        User u = LoginSystemClass.userList.get(i);
                        if (u instanceof MahasiswaClass && u.getNim().equals(targetNim)) {
                            LoginSystemClass.userList.remove(i);
                            found = true;
                            System.out.println(">> Mahasiswa berhasil dihapus. <<");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println(">> Mahasiswa tidak ditemukan. <<");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    @Override
    public void displayAppMenu() {
        do {
            System.out.println("\n==================================================");
            System.out.println("||                MENU ADMIN                   ||");
            System.out.println("==================================================");
            System.out.println("||  1. Kelola Laporan Barang                   ||");
            System.out.println("||  2. Kelola Data Mahasiswa                   ||");
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
                    manageItems();
                    break;
                case 2:
                    manageUsers();
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
