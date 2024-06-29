package Project;

import java.util.Scanner;

public class TaksimetreUygulamasi {
    public static void main(String[] args) {
        double taksimetre=2.20,yolSonu ;
        int gidilenYol, minTutar=20,taksimetreAcilis=10;
        Scanner input = new Scanner(System.in);
        System.out.println("Toplam Gidilen Kilometre Sayısını Giriniz: ");
        gidilenYol= input.nextInt();


        yolSonu = gidilenYol*taksimetre;
        String sonuc = (yolSonu <= 20) ? "Ödenecek Tutar = 20TL!" : "Ödenecek Tutar = " +yolSonu+"TL";
        System.out.println("Minimum tutar = " +minTutar);
        System.out.println("Taksimetre Açılış " + taksimetreAcilis);
        System.out.println(sonuc);
    }
}
