package praktikum.sesi8.BangunDatar;

abstract class BangunDatar {
    public abstract float luas();
    public abstract float keliling();
}

class Persegi extends BangunDatar {
    private float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public float luas() {
        return sisi * sisi;
    }

    @Override
    public float keliling() {
        return 4 * sisi;
    }
}

class Lingkaran extends BangunDatar {
    private float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}

class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float luas() {
        return panjang * lebar;
    }

    @Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}

class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    private float sisi1;
    private float sisi2;
    private float sisi3;

    public Segitiga(float alas, float tinggi, float sisi1, float sisi2, float sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    public float luas() {
        return 0.5f * alas * tinggi;
    }

    @Override
    public float keliling() {
        return sisi1 + sisi2 + sisi3;
    }
}

public class BangunDatarApp {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        Lingkaran lingkaran = new Lingkaran(3);
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6);
        Segitiga segitiga = new Segitiga(3, 4, 3, 4, 5);

        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("Keliling persegi: " + persegi.keliling());
        System.out.println("Luas lingkaran: " + lingkaran.luas());
        System.out.println("Keliling lingkaran: " + lingkaran.keliling());
        System.out.println("Luas persegi panjang: " + persegiPanjang.luas());
        System.out.println("Keliling persegi panjang: " + persegiPanjang.keliling());
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Keliling segitiga: " + segitiga.keliling());
    }
}
