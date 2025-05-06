package Herbivora;

// Class Fighter mengimplementasikan interface Karakter
public class Fighter implements Karakter {
    public String namaPahlawan;  // Menyimpan nama pahlawan
    public String senjata;       // Menyimpan senjata pahlawan

    // Konstruktor untuk memberi nilai pada nama dan senjata
    public Fighter(String namaPahlawan, String senjata){
        this.namaPahlawan = namaPahlawan;
        this.senjata = senjata;
    }

    // Cerita tentang musuh (diambil dari method Musuh di interface)
    @Override
    public void Musuh(String namaMusuh, String senjataMusuh){
        System.out.println("==================================================");
        System.out.println("||           KISAH KEPAHLAWANAN DIMULAI         ||");
        System.out.println("==================================================");
        System.out.println("Seorang raja iblis jahat bernama " + namaMusuh + " yang ingin menguasai dunia.");
        System.out.println("Dengan pedang bernama " + senjataMusuh + " yang sangat kuat,");
        System.out.println(namaMusuh + " mengalahkan banyak manusia dan hampir menaklukkan dunia.");
        System.out.println();
    }

    // Cerita tentang pahlawan (diambil dari method Pahlawan di interface)
    @Override
    public void Pahlawan(){
        System.out.println("Disaat harapan hampir padam, muncullah seorang pahlawan legendaris bernama " + namaPahlawan + ".");
        System.out.println(namaPahlawan + " membawa pedang suci bernama " + senjata + ", senjata peninggalan para leluhur.");
    }
}
