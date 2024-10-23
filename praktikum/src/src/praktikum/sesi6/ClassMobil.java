package praktikum.sesi6;

class Mobil {
    String aktivitas;
    String warna;
    int kecepatan;
    public Mobil(){
    }
    public Mobil (String aktivitas, String warna, int kecepatan){
        this.aktivitas = aktivitas;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    void cekKecepatan () {
        if (kecepatan==0)
        aktivitas="parkir";
    }
    void cetakAtribut (){
        System.out.println ("Aktivitas = " +aktivitas);
        System.out.println ("Warna = " +warna);
        System.out.println ("Kecepatan = " +kecepatan);
    }
}

public class ClassMobil {
    public static void main(String []args) {
        Mobil mobilku = new Mobil();
        mobilku.kecepatan=0;
        mobilku.warna="merah";
        mobilku.cekKecepatan();
        mobilku.cetakAtribut();
    }
}
