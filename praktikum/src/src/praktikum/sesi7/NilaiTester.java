package praktikum.sesi7;

class Nilai {
    private double quis;
    private double uts;
    private double uas;

    public void setQuis(double x) {
        if (x >= 0 && x <= 100) {
            quis = x;
        } else {
            System.out.println("Nilai Quis harus antara 0 dan 100.");
        }
    }

    public void setUTS(double x) {
        if (x >= 0 && x <= 100) {
            uts = x;
        } else {
            System.out.println("Nilai UTS harus antara 0 dan 100.");
        }
    }

    public void setUAS(double x) {
        if (x >= 0 && x <= 100) {
            uas = x;
        } else {
            System.out.println("Nilai UAS harus antara 0 dan 100.");
        }
    }

    public double getNA() {
        return 0.20 * quis + 0.30 * uts + 0.50 * uas;
    }
}

public class NilaiTester {
    public static void main(String[] args) {
        Nilai n = new Nilai();
        n.setQuis(90);
        n.setUTS(80);
        n.setUAS(75);
        System.out.println("Nilai Akhir: " + n.getNA());
    }
}
