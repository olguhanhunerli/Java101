package Project;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;
        double ortalama;
        Scanner input =new Scanner(System.in);
        System.out.println("Matematik notunu giriniz: ");
        matematik = input.nextInt();
        System.out.println("Fizik notunu giriniz: ");
        fizik = input.nextInt();
        System.out.println("Kimya notunu giriniz: ");
        kimya = input.nextInt();
        System.out.println("Türkçe notunu giriniz: ");
        turkce = input.nextInt();
        System.out.println("Tarih notunu giriniz: ");
        tarih = input.nextInt();
        System.out.println("Müzik notunu giriniz: ");
        muzik = input.nextInt();

        ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println(ortalama);

        String sonuc = (ortalama >= 60) ? "Geçti": "Kaldı";
        System.out.println(sonuc);
    }
}
