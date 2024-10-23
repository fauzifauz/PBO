package praktikum.sesi6;

// Kelas Orang
class Orang {
    String nama;
    int usia;
    
    // Konstruktor
    public Orang(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }
    
    // Method untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
    }
}

// Kelas Pegawai yang merupakan turunan dari Orang
class Pegawai extends Orang {
    String jabatan;
    double gaji;
    
    // Konstruktor Pegawai yang menggunakan konstruktor Orang
    public Pegawai(String nama, int usia, String jabatan, double gaji) {
        super(nama, usia);  // Memanggil konstruktor dari superclass (Orang)
        this.jabatan = jabatan;
        this.gaji = gaji;
    }
    
    // Override method tampilkanInfo untuk menampilkan tambahan informasi
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: " + gaji);
    }
}

// Kelas Tugas untuk menjalankan program
public class Tugas {
    public static void main(String[] args) {
        // Membuat objek Orang
        Orang orang = new Orang("Budi", 30);
        orang.tampilkanInfo();
        
        System.out.println();  // Pembatas antara output
        
        // Membuat objek Pegawai
        Pegawai pegawai = new Pegawai("Siti", 28, "Insinyur Perangkat Lunak", 8000000);
        pegawai.tampilkanInfo();
    }
}
