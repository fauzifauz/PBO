package praktikum.sesi5;

public class QuizSoal4 {
    public static void main(String[] args) {
        int jumlahGenap = 0;

        // Perulangan untuk mencari bilangan genap antara 1 hingga 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // Mengecek apakah i adalah bilangan genap
                jumlahGenap += i; // Menambahkan bilangan genap ke jumlah
            }
        }

        // Menampilkan jumlah bilangan genap
        System.out.println("Jumlah bilangan genap antara 1 hingga 100 adalah: " + jumlahGenap);
    }
}
