package praktikum.sesi6;

public class BintangFilm {
    private String nama;
    private Boolean pria;

    // Constructor
    BintangFilm(String nama, Boolean pria) {
        this.nama = nama;
        this.pria = pria;
    }

    private void Isikan(String nama, Boolean pria) {
        this.nama = nama;
        this.pria = pria;
    }

    // Method untuk memperoleh nama
    String perolehNama() {
        return nama;
    }

    // Method untuk memperoleh jenis kelamin
    String perolehJenisKelamin() {
        if (pria)
            return "Pria";
        else
            return "Wanita";
    }
}

// Kelas utama untuk menjalankan program
class ClassBintangFilm {
    public static void main(String[] args) {
        BintangFilm siA = new BintangFilm("Budi", true);
        BintangFilm siB = new BintangFilm("Hani", false);

        System.out.println("siA => " + siA.perolehNama() + ", " + siA.perolehJenisKelamin());
        System.out.println("siB => " + siB.perolehNama() + ", " + siB.perolehJenisKelamin());
    }
}
