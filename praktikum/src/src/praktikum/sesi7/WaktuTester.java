package praktikum.sesi7;

class Waktu {
    private int menitWaktu;

    public int getJam() {
        return menitWaktu / 60;
    }

    public int getMenit() {
        return menitWaktu % 60;
    }

    public void setJam(int j) {
        if (j >= 0) {
            menitWaktu += j * 60;
        } else {
            System.out.println("Jam tidak boleh negatif");
        }
    }

    public void setMenit(int m) {
        if (m >= 0) {
            menitWaktu += m;
            // Mengatur kembali menitWaktu jika lebih dari 59 menit
            if (menitWaktu >= 60) {
                menitWaktu += menitWaktu / 60 * 60; // Convert to jam
            }
        } else {
            System.out.println("Menit tidak boleh negatif");
        }
    }

    public int getTotalMenit() {
        return menitWaktu;
    }

    public void tampilWaktu() {
        System.out.println("Jam: " + getJam() + ", Menit: " + getMenit());
    }
}

public class WaktuTester {
    public static void main(String[] args) {
        Waktu w = new Waktu();
        w.setJam(10);
        w.setMenit(57);
        w.tampilWaktu();

        // Tes penambahan waktu
        w.setMenit(65); // Menambah 65 menit
        w.tampilWaktu(); // Harusnya menjadi 12 jam 2 menit
    }
}
