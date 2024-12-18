package praktikum.sesi12.Quiz.PublicTransportasi;

public class Gojek implements Transportasi {
    private int harga;
    private int id;

    // Constructor
    public Gojek(int harga, int id) {
        this.harga = harga;
        this.id = id;
    }

    // Implementasi metode dari interface
    @Override
    public void tampil() {
        System.out.println("ID Gojek: " + id);
        System.out.println("Harga: " + harga);
    }

    @Override
    public void setData() {
        System.out.println("Data Gojek telah diset.");
    }

    @Override
    public int getId() {
        return id;
    }
}
