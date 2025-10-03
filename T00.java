// 12S25014_laura kasih mutiara
import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, ganjil, genap;

        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());
        if (a % 2 == 0) {
            System.out.println("bilangan pertama:genap");
        } else {
            System.out.println("bilangan pertama:ganjil");
        }
        if (b % 2 == 0) {
            System.out.println("bilangan pertama:genap");
        } else {
            System.out.println("bilangan pertama:ganjil");
        }
        if (a > b) {
            System.out.println("bilangan pertama lebih besar");
        } else {
            if (a < b) {
                System.out.println("bilangan kedua lebih besar");
            } else {
                System.out.println("kedua bilangan sama besar");
            }
        }
        if (a % 2 == 0 && b % 2 == 0) {
            genap = a + b;
            System.out.println("Hasil penjumlahan: " + genap);
        } else {
            if (a % 2 != 0 && b % 2 != 0) {
                ganjil = a * b;
                System.out.println("Hasil perkalian: " + ganjil);
            } else {
                System.out.println("berbeda jenis");
            }
        }
    }
}
