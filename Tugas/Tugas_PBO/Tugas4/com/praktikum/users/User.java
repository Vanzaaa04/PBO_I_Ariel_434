package com.praktikum.users;

// Abstract class untuk User
public abstract class User {
    private String nama;
    private String nim;
    String inputUsername, inputPassword;

    User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public abstract void login();
    public abstract void displayAppMenu();

    public void displayInfo() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM Mahasiswa : " + nim);
    }
}
