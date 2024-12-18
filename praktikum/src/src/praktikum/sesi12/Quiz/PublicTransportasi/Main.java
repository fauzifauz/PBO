package praktikum.sesi12.Quiz.PublicTransportasi;

public class Main {
    public static void main(String[] args) {
        // Objek Gojek
        Gojek gojek = new Gojek(50000, 101);
        System.out.println("Data Gojek:");
        gojek.tampil();
        gojek.setData();
        System.out.println();

        // Objek Bayar
        Bayar bayar = new Bayar(50000, 102, 10, "Andi");
        System.out.println("Data Pembayaran:");
        bayar.tampil();
        bayar.bayar();
    }
}
