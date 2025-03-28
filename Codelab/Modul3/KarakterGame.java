class KarakterGame {
    private String nama;
    private String skill;
    private int kesehatan;
    private int kekuatanskill;

    KarakterGame(String nama, int kesehatan, String skill, int kekuatanskill) {
        this.nama = nama;
        this.kesehatan = kesehatan;
        this.skill = skill;
        this.kekuatanskill = kekuatanskill;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(){

    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(){

    }

    public int getKekuatanskill() {
        return kekuatanskill;
    }

    public void setKekuatanskill(int kekuatanskill) {
        this.kekuatanskill = kekuatanskill;
    }

    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.getNama() + " dengan menggunakan " + skill);
    }

}

class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan, String skill, int kekuatanskill) {
        super(nama, kesehatan, skill, kekuatanskill);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " dengan " + getSkill());
        if (getKekuatanskill() >= target.getKesehatan()) {
            System.out.println(target.getNama() + " kalah!");
        } else {
            target.setKesehatan(target.getKesehatan() - getKekuatanskill());
            System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
        }
    }
}

class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan, String skill, int kekuatanskill) {
        super(nama, kesehatan, skill, kekuatanskill);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " dengan " + getSkill());
        if (getKekuatanskill() >= target.getKesehatan()) {
            System.out.println(target.getNama() + " kalah!");
        } else {
            target.setKesehatan(target.getKesehatan() - getKekuatanskill());
            System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
        }
    }
}