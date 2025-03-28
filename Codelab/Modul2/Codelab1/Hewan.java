class Hewan {
    String nama, jenis, suara;

    Hewan(String nama,String jenis,String suara){
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    void tampilkanInfo(){
        System.out.println("=== INFORMASI HEWAN ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println("-----------------------\n");
    }
}