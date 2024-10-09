package praktikum.sesi3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Tugas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1 = 0, angka2 = 0, pilihan;
        boolean jalanTerus = true;

        while (jalanTerus) {
            System.out.println("=== Kalkulator Sederhana ===");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Modulus");
            System.out.println("6. Operator Relasi");
            System.out.println("7. Operator Logika");
            System.out.println("8. Keluar");
            System.out.print("Pilih operasi: ");

            try {
                pilihan = input.nextInt();

                if (pilihan == 8) {
                    jalanTerus = false;
                    System.out.println("Terima kasih, program selesai.");
                    break;
                }

                if (pilihan >= 1 && pilihan <= 5) {
                    System.out.print("Masukkan angka pertama: ");
                    angka1 = input.nextInt();
                    System.out.print("Masukkan angka kedua: ");
                    angka2 = input.nextInt();
                }

                switch (pilihan) {
                    case 1:
                        System.out.println("Hasil Penjumlahan: " + (angka1 + angka2));
                        break;
                    case 2:
                        System.out.println("Hasil Pengurangan: " + (angka1 - angka2));
                        break;
                    case 3:
                        System.out.println("Hasil Perkalian: " + (angka1 * angka2));
                        break;
                    case 4:
                        if (angka2 != 0) {
                            System.out.println("Hasil Pembagian: " + ((double) angka1 / angka2));
                        } else {
                            System.out.println("Kesalahan: Pembagi tidak boleh 0");
                        }
                        break;
                    case 5:
                        if (angka2 != 0) {
                            System.out.println("Hasil Modulus: " + (angka1 % angka2));
                        } else {
                            System.out.println("Kesalahan: Pembagi tidak boleh 0");
                        }
                        break;
                    case 6:
                        // Operator Relasi
                        System.out.println("=== Operator Relasi ===");
                        System.out.print("Masukkan angka pertama: ");
                        angka1 = input.nextInt();
                        System.out.print("Masukkan angka kedua: ");
                        angka2 = input.nextInt();

                        System.out.println(angka1 + " == " + angka2 + " : " + (angka1 == angka2));
                        System.out.println(angka1 + " != " + angka2 + " : " + (angka1 != angka2));
                        System.out.println(angka1 + " > " + angka2 + " : " + (angka1 > angka2));
                        System.out.println(angka1 + " < " + angka2 + " : " + (angka1 < angka2));
                        System.out.println(angka1 + " >= " + angka2 + " : " + (angka1 >= angka2));
                        System.out.println(angka1 + " <= " + angka2 + " : " + (angka1 <= angka2));
                        break;
                    case 7:
                        // Operator Logika
                        System.out.println("=== Operator Logika ===");
                        boolean logika1 = false, logika2 = false;

                        try {
                            System.out.print("Masukkan nilai boolean pertama (true/false): ");
                            logika1 = input.nextBoolean();
                            System.out.print("Masukkan nilai boolean kedua (true/false): ");
                            logika2 = input.nextBoolean();

                            System.out.println(logika1 + " AND " + logika2 + " : " + (logika1 && logika2));
                            System.out.println(logika1 + " OR " + logika2 + " : " + (logika1 || logika2));
                            System.out.println("NOT " + logika1 + " : " + (!logika1));
                        } catch (InputMismatchException e) {
                            System.out.println("Kesalahan: Input harus boolean (true/false)");
                            input.next(); 
                        }
                        break;
                    default:
                        System.out.println("Pilihan tidak valid, coba lagi.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Kesalahan: Input harus berupa angka");
                input.next(); 
            }
            System.out.println(); 
        }

        input.close();
    }
}
