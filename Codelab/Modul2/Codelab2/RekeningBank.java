class RekeningBank {
    String  namaPemilik, nomorRekening;
    double saldo;

    RekeningBank(String nomorRekening , String namaPemilik,double saldo){
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    void tampilkanInfo(){
        System.out.println("-------------------------------------");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Nama pemilik   : " + namaPemilik);
        System.out.println("Saldo          : " + saldo );
        System.out.println("-------------------------------------");
    }

    void setorUang(double jumlah){
        saldo += jumlah;
        System.out.println(namaPemilik + " Menyetor Rp." + jumlah + ". Saldo sekarang: Rp. " + saldo);
    }

    void tarikUang(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp. " + jumlah + " (Berhasil) Saldo Sekarang: Rp." + saldo);
        } else {
            System.out.println(namaPemilik + " menarik Rp. " + jumlah + " (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp. " + saldo);
        }
    }
}
