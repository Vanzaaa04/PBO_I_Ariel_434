import java.util.Scanner; // Import Scanner untuk membaca input dari pengguna

class NeracaKeuangan {
    private double saldo = 1000000; // Nilai saldo awal. Bisa diubah sesuai kebutuhan
    private double kredit; // Menyimpan jumlah kredit yang dimasukkan pengguna
    private double debit; // Menyimpan nilai debit, dalam kasus ini akan disamakan dengan kredit

    // Method untuk mengatur nilai kredit yang dimasukkan
    // Di dalamnya juga terdapat validasi terhadap input dan batas saldo
    public void inputKredit(double jumlah) throws Exception {
        if (jumlah <= 0) {
            // Jika nilai kredit kurang dari atau sama dengan 0, dianggap tidak valid
            throw new Exception("Jumlah kredit harus lebih dari 0.");
        }
        if (jumlah > saldo) {
            // Jika jumlah kredit melebihi saldo, tidak diizinkan dan akan menimbulkan error
            throw new Exception("Saldo tidak mencukupi.");
        }

        kredit = jumlah; // Menyimpan jumlah kredit yang valid
        saldo -= kredit; // Mengurangi saldo dengan nilai kredit yang dimasukkan
    }

    // Method untuk menyamakan nilai debit dengan nilai kredit
    public void hitungDebit() {
        debit = kredit; // Dalam sistem ini, debit sama dengan kredit
    }

    // Method untuk menampilkan seluruh informasi keuangan yang tercatat
    public void displayAll() {
        System.out.println("=== Neraca Keuangan Bank Indonesia ===");
        System.out.println("Saldo Saat Ini : Rp " + saldo); // Menampilkan saldo tersisa
        System.out.println("Kredit         : Rp " + kredit); // Menampilkan nilai kredit yang dimasukkan
        System.out.println("Debit          : Rp " + debit); // Menampilkan nilai debit
    }

    // Method utama untuk menjalankan program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk menerima input dari pengguna
        NeracaKeuangan neraca = new NeracaKeuangan(); // Membuat objek dari class NeracaKeuangan

        try {
            System.out.print("Masukkan jumlah kredit: "); // Meminta pengguna memasukkan nilai kredit
            double jumlahKredit = input.nextDouble(); // Membaca nilai kredit dari input pengguna

            neraca.inputKredit(jumlahKredit); // Memproses input kredit dengan validasi
            neraca.hitungDebit(); // Menghitung debit berdasarkan nilai kredit
        } catch (Exception e) {
            // Menangani error jika terjadi kesalahan input atau saldo tidak mencukupi
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        neraca.displayAll(); // Menampilkan semua informasi keuangan setelah transaksi
    }
}
