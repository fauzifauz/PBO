package praktikum.sesi12.Quiz.PublicTransportasi;

public class Bayar extends Gojek {
    private int jarak;
    private int total;
    private String nama;

    // Constructor
    public Bayar(int harga, int id, int jarak, String nama) {
        super(harga, id);
        this.jarak = jarak;
        this.nama = nama;
        this.total = hitungTotal();
    }

    // Method untuk menghitung total pembayaran
    public int hitungTotal() {
        return jarak * 1000 + super.getId(); // Formula contoh
    }

    // Method tambahan untuk membayar
    public void bayar() {
        System.out.println("Pembayaran telah dilakukan oleh: " + nama);
        System.out.println("Total Pembayaran: " + total);
    }

    // Overriding metode tampil
    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Nama: " + nama);
        System.out.println("Jarak: " + jarak);
        System.out.println("Total: " + total);
    }

    // Metode setData
    public void setData() {
        System.out.println("Data pembayaran telah diatur.");
    }
}
