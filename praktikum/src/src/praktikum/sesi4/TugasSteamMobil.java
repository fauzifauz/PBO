package praktikum.sesi4;

import java.util.Scanner;  // Tambahkan import Scanner

public class TugasSteamMobil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variabel untuk menyimpan data
        String jenisMobil;
        int jenisMobilChoice;
        String paketSteam;
        int paketChoice;
        double hargaDasar = 0;
        double totalHarga;
        boolean validInput = false;

        // Menampilkan jenis mobil
        System.out.println("===== Steam Mobil =====");
        System.out.println("Pilih jenis mobil:");
        System.out.println("1. Sedan");
        System.out.println("2. SUV");
        System.out.println("3. MPV");
        System.out.println("4. Pick-up");

        // Input pilihan jenis mobil menggunakan while untuk validasi input
        do {
            System.out.print("Masukkan pilihan (1-4): ");
            jenisMobilChoice = scanner.nextInt();

            if (jenisMobilChoice >= 1 && jenisMobilChoice <= 4) {
                validInput = true;
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (!validInput);

        // Switch untuk menentukan harga dasar berdasarkan jenis mobil
        switch (jenisMobilChoice) {
            case 1:
                jenisMobil = "Sedan";
                hargaDasar = 50000;
                break;
            case 2:
                jenisMobil = "SUV";
                hargaDasar = 60000;
                break;
            case 3:
                jenisMobil = "MPV";
                hargaDasar = 55000;
                break;
            case 4:
                jenisMobil = "Pick-up";
                hargaDasar = 65000;
                break;
            default:
                jenisMobil = "Tidak Diketahui";
                break;
        }

        // Menampilkan paket steam
        System.out.println("\nPilih paket steam:");
        System.out.println("1. Paket Ekonomis (Rp 20,000)");
        System.out.println("2. Paket Standar (Rp 30,000)");
        System.out.println("3. Paket Premium (Rp 50,000)");
        
        validInput = false; // Reset validasi input
        // Input pilihan paket steam menggunakan do-while
        do {
            System.out.print("Masukkan pilihan paket (1-3): ");
            paketChoice = scanner.nextInt();

            if (paketChoice >= 1 && paketChoice <= 3) {
                validInput = true;
            } else {
                System.out.println("Pilihan paket tidak valid, silakan coba lagi.");
            }
        } while (!validInput);

        // If-else untuk menentukan harga tambahan berdasarkan pilihan paket steam
        if (paketChoice == 1) {
            paketSteam = "Paket Ekonomis";
            totalHarga = hargaDasar + 20000;
        } else if (paketChoice == 2) {
            paketSteam = "Paket Standar";
            totalHarga = hargaDasar + 30000;
        } else {
            paketSteam = "Paket Premium";
            totalHarga = hargaDasar + 50000;
        }

        // Menggunakan for loop untuk menghitung diskon jika total harga lebih dari 100,000
        double diskon = 0;
        if (totalHarga > 100000) {
            for (int i = 0; i < 1; i++) {
                diskon = totalHarga * 0.1; // 10% diskon
                totalHarga -= diskon;
            }
        }

        // Menampilkan hasil
        System.out.println("\n=== Rincian Steam Mobil ===");
        System.out.println("Jenis Mobil: " + jenisMobil);
        System.out.println("Paket Steam: " + paketSteam);
        System.out.printf("Total Harga: Rp %.2f\n", totalHarga);
        
        if (diskon > 0) {
            System.out.printf("Diskon: Rp %.2f\n", diskon);
        }

        // Memilih metode pembayaran
        System.out.println("\nPilih metode pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. Transfer Bank");

        int metodePembayaran;
        validInput = false; // Reset validasi input
        do {
            System.out.print("Masukkan pilihan metode pembayaran (1-3): ");
            metodePembayaran = scanner.nextInt();

            if (metodePembayaran >= 1 && metodePembayaran <= 3) {
                validInput = true;
            } else {
                System.out.println("Pilihan metode pembayaran tidak valid, silakan coba lagi.");
            }
        } while (!validInput);

        // Memasukkan nominal pembayaran
        double nominalPembayaran;
        System.out.print("\nMasukkan nominal uang yang dibayarkan: Rp ");
        nominalPembayaran = scanner.nextDouble();

        // Menghitung kembalian
        if (nominalPembayaran >= totalHarga) {
            double kembalian = nominalPembayaran - totalHarga;
            System.out.printf("Kembalian Anda: Rp %.2f\n", kembalian);
        } else {
            System.out.printf("Uang yang Anda bayarkan kurang sebesar: Rp %.2f\n", totalHarga - nominalPembayaran);
        }

        // Contoh penggunaan while loop untuk memastikan user ingin mengulang atau keluar
        System.out.println("\nApakah Anda ingin melakukan steam mobil lagi? (y/n): ");
        char ulang;
        while (true) {
            ulang = scanner.next().charAt(0);
            if (ulang == 'y' || ulang == 'n') {
                break;
            } else {
                System.out.println("Input tidak valid, masukkan 'y' untuk ya atau 'n' untuk tidak.");
            }
        }

        // Jika user memilih 'y', program bisa dimodifikasi untuk kembali ke awal
        if (ulang == 'y') {
            System.out.println("Mengulang program...");
            // Di sini bisa dipanggil lagi main() atau dibuat loop untuk mengulang program
        } else {
            System.out.println("Terima kasih telah menggunakan layanan steam mobil!");
        }

        scanner.close();
    }
}