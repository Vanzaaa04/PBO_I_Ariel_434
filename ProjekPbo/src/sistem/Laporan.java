package sistem;

public class Laporan {
    public String namaLengkap;
    public String masalah;
    public String deskripsiMasalah;
    public String lokasi;
    public String tanggal;
    public String waktu;
    public String bulan;
    public String tahun;
    public String status;

    public Laporan(String namaLengkap, String masalah, String deskripsiMasalah, String lokasi, String tanggal, String waktu, String bulan, String tahun) {
        this.namaLengkap = namaLengkap;
        this.masalah = masalah;
        this.deskripsiMasalah = deskripsiMasalah;
        this.lokasi = lokasi;
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.bulan = bulan;
        this.tahun = tahun;
        this.status = "Belum diterima";
    }

    public void tampilkanLaporan() {
        System.out.println("Nama Lengkap     : " + namaLengkap);
        System.out.println("Masalah          : " + masalah);
        System.out.println("Deskripsi Masalah: " + deskripsiMasalah);
        System.out.println("Lokasi           : " + lokasi);
        System.out.println("Tanggal          : " + tanggal + "|" + bulan + "|" + tahun);
        System.out.println("Waktu            : " + waktu);
        System.out.println("Status           : " + status);
        System.out.println("-----------------------------------------");
    }
}