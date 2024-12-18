package praktikum.sesi12.Quiz.Perkuliahan;

public class Main {
    public static void main(String[] args) {
        // Objek Dosen
        Dosen dosen = new Dosen("12345", "Pak Budi");
        System.out.println("Data Dosen:");
        dosen.view();
        System.out.println();

        // Objek Rektor
        Rektor rektor = new Rektor("67890", "Bu Ani", 2020);
        System.out.println("Data Rektor:");
        rektor.viewRektor();
        System.out.println();

        // Objek Dekan
        Dekan dekan = new Dekan("54321", "Pak Joko", "Fakultas Teknik");
        System.out.println("Data Dekan:");
        dekan.viewDekan();
    }
}
