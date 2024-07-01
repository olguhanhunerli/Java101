package Project;

import java.util.Scanner;

public class UçakBileti {
    public static void main(String[] args) {


        double mesafeBasiUcret = 0.1, mesafe, toplamTutar, normalTutar, yasIndirimi, gidisDonusIndırımı, indirimliTutar;
        int yolculukTipi, yolcuYasi;

        Scanner input = new Scanner(System.in);
        System.out.println("Hoşgeldiniz...");

        System.out.println("Lütfen Mesafeyi KM Türünden Giriniz :");
        mesafe = input.nextDouble();
        System.out.println("Lütfen Yaşınızı Giriniz :");
        yolcuYasi = input.nextInt();
        System.out.println("Lütfen Yolculuk Türünüzü Seçiniz;");
        System.out.println("1-) Tek Yön, 2-) Gidiş Dönüş");
        yolculukTipi = input.nextInt();
        normalTutar = mesafe * mesafeBasiUcret;
        if (yolcuYasi >= 0 || yolculukTipi <= 2 || mesafe >= 0 ) {
            if (yolcuYasi < 12 && yolculukTipi >= 1) {
                if (yolculukTipi == 1) {
                    yasIndirimi = normalTutar * 0.50;
                    indirimliTutar = (normalTutar - yasIndirimi);
                    System.out.println("Yaşınız 12 den küçük olduğu için Tek Yön Toplam Tutarınız : " + indirimliTutar + "TL");
                } else {
                    yasIndirimi = normalTutar * 0.50;
                    indirimliTutar = normalTutar - yasIndirimi;
                    gidisDonusIndırımı = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - gidisDonusIndırımı) * 2;
                    System.out.println("Yaşınız 12 den küçük olduğu için Gidiş Dönüş Toplam Tutarınız : " + toplamTutar + "TL");
                }
            } else if (12 < yolcuYasi && yolcuYasi < 24) {
                if (yolculukTipi == 1) {
                    System.out.println("Yaşınız 12&24 aralığında olduğu için Tek Yön Toplam Tutarınız : " + normalTutar + "TL");
                } else {
                    gidisDonusIndırımı = normalTutar * 0.2;
                    toplamTutar = (normalTutar - gidisDonusIndırımı) * 2;
                    System.out.println("Yaşınız 12&24 aralığında olduğu için Gidiş Dönüş Toplam Tutarınız : " + toplamTutar + "TL");
                }
            } else if (yolcuYasi > 24 && yolcuYasi < 65) {
                if (yolculukTipi == 1) {
                    toplamTutar = normalTutar;
                    System.out.println("Yaşınız 12&24 aralığında olduğu için Tek Yön Toplam Tutarınız : " + toplamTutar + "TL");
                } else {
                    toplamTutar = normalTutar;
                    System.out.println("Yaşınız 12&24 aralığında olduğu için Gidiş Dönüş Toplam Tutarınız : " + toplamTutar + "TL");
                }
            } else if (yolcuYasi > 65) {
                if (yolculukTipi == 1) {
                    toplamTutar = normalTutar * 0.3;
                    System.out.println("Yaşınız 12&24 aralığında olduğu için Tek Yön Toplam Tutarınız : " + toplamTutar + "TL");
                } else {
                    yasIndirimi = normalTutar * 0.30;
                    indirimliTutar = normalTutar - yasIndirimi;
                    gidisDonusIndırımı = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - gidisDonusIndırımı) * 2;
                    System.out.println("Yaşınız 12&24 aralığında olduğu için Gidiş Dönüş Toplam Tutarınız : " + toplamTutar + "TL");
                }
            } else {

            }

        }
        else {System.out.println("Hatalı Veri Girdiniz...");}
    }
}
