package sistem;

public class Aspirasi {
    public String namaLengkap;
    public String isiAspirasi;
    public String status;

    public Aspirasi(String namaLengkap, String isiAspirasi) {
        this.namaLengkap = namaLengkap;
        this.isiAspirasi = isiAspirasi;
        this.status = "Belum diterima";
    }

    public void tampilkanAspirasi() {
        System.out.println("Nama Lengkap : " + namaLengkap);
        System.out.println("Aspirasi     : " + isiAspirasi);
        System.out.println("Status       : " + status);
        System.out.println("-----------------------------------------");
    }
}