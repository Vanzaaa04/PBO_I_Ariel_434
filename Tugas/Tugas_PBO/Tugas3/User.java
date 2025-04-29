

public class User {
    private String nama;
    private String nim;

    User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama() {
        this.nama = nama;

    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void login() {
        System.out.println("Login Berhasil!");
    }

    public void displayInfo() {
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("Nim Mahasiswa: " + nim);
    }
}



