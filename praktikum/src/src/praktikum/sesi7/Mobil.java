package praktikum.sesi7;

public class Mobil {
    public String merk;
    protected int tahunProduksi;
    private double harga;

    // Constructor
    public Mobil(String merk, int tahunProduksi, double harga) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    // Getter untuk harga
    public double getHarga() {
        return harga;
    }

    // Setter untuk harga
    public void setHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

    // Method untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        System.out.println("Merk Mobil: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga: " + harga);
    }
}

// Kelas utama untuk menjalankan program
class MobilCek {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil1 = new Mobil("Toyota", 2022, 300000000);

        // Mengakses atribut public
        System.out.println("Merk Mobil: " + mobil1.merk); // Output: Toyota

        // Mengakses atribut protected (dapat diakses dalam package yang sama)
        System.out.println("Tahun Produksi Mobil: " + mobil1.tahunProduksi); // Output: 2022

        // Mengakses atribut private menggunakan getter
        System.out.println("Harga Mobil: " + mobil1.getHarga()); // Output: 300000000.0

        // Mengubah nilai atribut private menggunakan setter
        mobil1.setHarga(350000000);
        System.out.println("Harga Mobil Setelah Diubah: " + mobil1.getHarga()); // Output: 350000000.0

        // Menampilkan informasi lengkap mobil
        mobil1.tampilkanInfoMobil();
    }
}