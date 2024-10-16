package praktikum.sesi5;
import java.util.Scanner;

public class QuizSoal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        // Perulangan do-while untuk meminta angka berulang kali
        do {
            // Meminta pengguna memasukkan angka
            System.out.print("Masukkan sebuah angka (masukkan 0 untuk berhenti): ");
            angka = input.nextInt();

            // Menampilkan angka yang dimasukkan (kecuali 0)
            if (angka != 0) {
                System.out.println("Anda memasukkan angka: " + angka);
            }

        } while (angka != 0); // Berhenti jika angka 0 dimasukkan

        System.out.println("Program selesai.");
        input.close(); // Menutup Scanner
    }
}

