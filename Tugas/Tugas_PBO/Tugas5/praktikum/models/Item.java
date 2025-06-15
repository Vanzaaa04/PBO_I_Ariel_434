package praktikum.models;

public class Item {
    private String namaBarang;
    private String deskripsi;
    private String lokasi;
    private String status;

    public Item(String namaBarang, String deskripsi, String lokasi) {
        this.namaBarang = namaBarang;
        this.deskripsi = deskripsi;
        this.lokasi = lokasi;
        this.status = "Reported";
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getLokasi() {
        return lokasi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
