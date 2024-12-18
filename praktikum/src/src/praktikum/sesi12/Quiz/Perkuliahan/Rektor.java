package praktikum.sesi12.Quiz.Perkuliahan;

public class Rektor extends Dosen {
    private int tahunmasuk;

    public Rektor(String nik, String nama, int tahunmasuk) {
        super(nik, nama);
        this.tahunmasuk = tahunmasuk;
    }

    public int gettahunmasuk() {
        return tahunmasuk;
    }

    public void viewRektor() {
        super.view();
        System.out.println("TahunMasuk: " + tahunmasuk);
    }
}
