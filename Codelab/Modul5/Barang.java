public class Barang {                     // Mendefinisikan class Barang, representasi objek barang yang punya nama dan stok
    private String nama;                 // Atribut private untuk menyimpan nama barang
    private int stok;                    // Atribut private untuk menyimpan jumlah stok barang

    public Barang(String nama, int stok){  // Konstruktor: digunakan saat membuat objek Barang baru
        this.nama = nama;                  // Menyimpan nilai parameter nama ke atribut nama
        this.stok = stok;                  // Menyimpan nilai parameter stok ke atribut stok
    }

    public String getNama() {             // Method getter: mengembalikan nama barang
        return nama;
    }

    public int getStok() {                // Method getter: mengembalikan jumlah stok barang
        return stok;
    }

    public void setStok(int stok) {       // Method setter: mengatur nilai stok barang
        this.stok = stok;
    }
}
