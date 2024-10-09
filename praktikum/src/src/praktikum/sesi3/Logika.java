package praktikum.sesi3;

public class Logika {
    public static void main(String[] args) {
        int i = 0, j = 10;
        boolean test = false;

    test = (i > 10) &&(j++ > 9);
    System.out.println(i);
    System.out.println(j);
    System.out.println(test);

    test = (i > 10) & (j++ > 9);
    System.out.println(i);
    System.out.println(j);
    System.out.println(test);
    }
}