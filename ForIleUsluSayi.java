package Project;

import java.util.Scanner;

public class ForIleUsluSayi {
    public static void main(String[] args) {
        int sayi1,sayiUs;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı Giriniz : ");
        sayi1 = input.nextInt();
        System.out.println("Üs Giriniz :");
        sayiUs = input.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= sayiUs; i++){
            sonuc *= sayi1;
        }
        System.out.println(sonuc);

    }
}
