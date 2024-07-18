package Project;

import java.util.Scanner;

public class Kombinasyon {
    // Faktöriyel hesaplayan metod
    public static long faktoriyel(int n) {
        long sonuc = 1;
        for (int i = 1; i <= n; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    // Kombinasyon hesaplayan metod
    public static long kombinasyon(int n, int r) {
        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini girin: ");
        int n = scanner.nextInt();

        System.out.print("r değerini girin: ");
        int r = scanner.nextInt();

        if (n < 0 || r < 0 || n < r) {
            System.out.println("Geçersiz giriş. n ve r pozitif olmalı ve n, r'den büyük veya eşit olmalı.");
        } else {
            long sonuc = kombinasyon(n, r);
            System.out.println("C(" + n + ", " + r + ") = " + sonuc);
        }
    }
}

