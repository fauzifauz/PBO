package praktikum.sesi9.Pegawai;

public class Manajer extends Pegawai {

    // Tambahkan @Override di atas fungsi void menampilkan().
    // Override sendiri berfungsi sebagai pembuatan ulang method dari superclass untuk subclass.
    @Override
    public void menampilkan() {
        // Untuk nilai dari void menampilkan bisa berbeda dari nilai yang ada pada superclass.
        System.out.println("Nama : " + nama);
        System.out.println("Id Pegawai : " + id_pegawai);
        System.out.println("Gaji: " + gaji);
    }

    // Untuk fungsi dari void tugas() merupakan fungsi spesifik yang hanya dimiliki oleh class
    // Manager.
    public void tugas() {
        System.out.println("Tugas: Melakukan manajemen untuk franchise");
        System.out.println("------------------------------");
    }
}
