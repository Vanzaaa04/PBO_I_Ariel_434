public class Codelab2Main {
    // belum selesai
    public static void main(String[] args){
        RekeningBank rekening1 = new RekeningBank("202410370110434","Ariel Ardiansyah",9000000);
        RekeningBank rekening2 = new RekeningBank("202410370110402", "Faris Ramadhan", 200000);

        System.out.println("=== INFORMASI REKENING AWAL ===");
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
        System.out.println();

        System.out.println("=== TRANSAKSI PENYETORAN UANG ===");
        rekening1.setorUang(100000);
        rekening2.setorUang(100000);
        System.out.println();

        System.out.println("=== TRANSAKSI PENARIKAN UANG ===");
        rekening1.tarikUang(150000);
        rekening2.tarikUang(1000000);
        System.out.println();

        System.out.println("=== INFORMASI REKENING SETELAH TRANSAKSI ===");
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}
