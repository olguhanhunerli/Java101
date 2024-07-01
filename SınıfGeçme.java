package Project;

import java.util.Scanner;

public class SınıfGeçme {
    public static void main(String[] args) {
        int mat,fiz,tur,kim,muz, gecmeNotu=55;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notu Giriniz : ");
        mat = input.nextInt();
        System.out.println("Fizik Notu Giriniz :");
        fiz = input.nextInt();;
        System.out.println("Türkçe Notu Giriniz :");
        tur = input.nextInt();
        System.out.println("Kimya Notu Giriniz :");
        kim = input.nextInt();
        System.out.println("Müzik Notu Giriniz :");
        muz = input.nextInt();

        if (( mat <= 100) && (fiz <= 100)&& (tur <= 100)&& (kim <= 100)&& (muz <= 100)) {
            ortalama = (mat + fiz + tur + kim + muz)/5;
            System.out.println(ortalama);
            String sonuc = (ortalama >= gecmeNotu) ? "Geçti": "Kaldı";
            System.out.println(sonuc);
        }
        else {
            System.out.println("100 den fazla bir not girişi oldu.");
        }
    }
}
