package praktikum.sesi12.Quiz.Animal;

// Abstract Class Animal
abstract class Animal {
    protected String nama;
    protected String sifat;
    protected int ukuran;

    public abstract void setNama(String nama);

    public abstract String getNama();

    public abstract void setUkuran(int ukuran);

    public abstract int getUkuran();

    public abstract void setSifat(String sifat);

    public abstract String getSifat();
}

// Interface Terbang
interface Terbang {
    void setBisaTerbang(boolean bisaTerbang);

    boolean getBisaTerbang();
}

// Subclass Mamalia
class Mamalia extends Animal {
    private String jalan;
    private String jenisMamalia;
    private boolean bisaJalan;
    private int jumlahKaki;

    public Mamalia() {
    }

    public Mamalia(String nama) {
        this.nama = nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public int getUkuran() {
        return ukuran;
    }

    @Override
    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    @Override
    public String getSifat() {
        return sifat;
    }

    public void setBisaJalan(boolean bisaJalan) {
        this.bisaJalan = bisaJalan;
    }

    public boolean getBisaJalan() {
        return bisaJalan;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJenisMamalia(String jenisMamalia) {
        this.jenisMamalia = jenisMamalia;
    }

    public String getJenisMamalia() {
        return jenisMamalia;
    }
}

// Subclass Aves
class Aves extends Animal implements Terbang {
    private String jenisAves;
    private boolean bisaTerbang;

    public Aves() {
    }

    public Aves(String nama, int ukuran) {
        this.nama = nama;
        this.ukuran = ukuran;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public int getUkuran() {
        return ukuran;
    }

    @Override
    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    @Override
    public String getSifat() {
        return sifat;
    }

    @Override
    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }

    @Override
    public boolean getBisaTerbang() {
        return bisaTerbang;
    }

    public void setJenisAves(String jenisAves) {
        this.jenisAves = jenisAves;
    }

    public String getJenisAves() {
        return jenisAves;
    }
}

// Subclass Ayam
class Ayam extends Aves {
    private String jenisAyam;
    private boolean bisaDiadu;

    public Ayam() {
    }

    public Ayam(String nama, int ukuran) {
        super(nama, ukuran);
    }

    public void setJenisAyam(String jenisAyam) {
        this.jenisAyam = jenisAyam;
    }

    public String getJenisAyam() {
        return jenisAyam;
    }

    public void setBisaDiadu(boolean bisaDiadu) {
        this.bisaDiadu = bisaDiadu;
    }

    public boolean getBisaDiadu() {
        return bisaDiadu;
    }
}

// Subclass Merpati
class Merpati extends Aves {
    public Merpati() {
    }

    public Merpati(String nama, int ukuran) {
        super(nama, ukuran);
    }
}

// Main Program
public class AnimalDemo {
    public static void main(String[] args) {
        Mamalia kucing = new Mamalia("Kucing");
        kucing.setUkuran(30);
        kucing.setSifat("Lucu");
        kucing.setBisaJalan(true);
        kucing.setJumlahKaki(4);
        kucing.setJenisMamalia("Hewan Peliharaan");

        System.out.println("Mamalia: " + kucing.getNama());
        System.out.println("Ukuran: " + kucing.getUkuran() + " cm");
        System.out.println("Sifat: " + kucing.getSifat());
        System.out.println("Bisa Jalan: " + kucing.getBisaJalan());
        System.out.println("Jumlah Kaki: " + kucing.getJumlahKaki());
        System.out.println("Jenis Mamalia: " + kucing.getJenisMamalia());

        System.out.println();

        Ayam ayamJago = new Ayam("Ayam Jago", 40);
        ayamJago.setSifat("Agresif");
        ayamJago.setBisaTerbang(false);
        ayamJago.setJenisAyam("Ayam Aduan");
        ayamJago.setBisaDiadu(true);

        System.out.println("Aves: " + ayamJago.getNama());
        System.out.println("Ukuran: " + ayamJago.getUkuran() + " cm");
        System.out.println("Sifat: " + ayamJago.getSifat());
        System.out.println("Bisa Terbang: " + ayamJago.getBisaTerbang());
        System.out.println("Jenis Ayam: " + ayamJago.getJenisAyam());
        System.out.println("Bisa Diadu: " + ayamJago.getBisaDiadu());
    }
}
