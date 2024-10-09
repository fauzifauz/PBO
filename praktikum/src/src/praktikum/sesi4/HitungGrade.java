package praktikum.sesi4;

import java.util.Scanner;

public class HitungGrade {
    public static void main(String[] args) {
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);

        // Input nilai dari pengguna
        System.out.print("Inputkan Nilai: ");
        nilai = scan.nextInt();

        // Menentukan grade berdasarkan nilai
        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B+";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 65) {
            grade = "C+";
        } else if (nilai >= 60) {
            grade = "C";
        } else if (nilai >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Menampilkan grade
        System.out.println("Grade: " + grade);

        // Menutup scanner
        scan.close();
    }
}
