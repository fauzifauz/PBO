package praktikum.sesi7;

class Calculator {
    double operan1;
    double operan2;

    void isiOperan1(double x) {
        operan1 = x;
    }

    void isiOperan2(double x) {
        operan2 = x;
    }

    double tambah() {
        return operan1 + operan2;
    }

    double kurang() {
        return operan1 - operan2;
    }

    double kali() {
        return operan1 * operan2;
    }

    double bagi() {
        return operan1 / operan2;
    }

    double pangkat() {
        return Math.pow(operan1, operan2);
    }
}

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.isiOperan1(7);
        c.isiOperan2(5);
        System.out.println("Tambah: " + c.tambah());
        System.out.println("Kurang: " + c.kurang());
        System.out.println("Kali: " + c.kali());
        System.out.println("Bagi: " + c.bagi());
        System.out.println("Pangkat: " + c.pangkat());
    }
}
