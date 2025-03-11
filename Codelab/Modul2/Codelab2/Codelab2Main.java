public class Codelab2Main {
    // belum selesai
    public static void main(String[] args){
        RekeningBank rekening1 = new RekeningBank("202410370110434","Ariel Ardiansyah",9000000);
        RekeningBank rekening2 = new RekeningBank("202410370110402", "Faris Ramadhan", 200000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setorUang(100000);
        rekening2.setorUang(100000);
        System.out.print("\n");

        rekening1.tarikUang(150000);
        rekening2.tarikUang(1000000);

        System.out.print("\n");
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}
