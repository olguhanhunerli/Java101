package Project;

import java.util.Scanner;

public class ScHesapMakinesi {
    public static void main(String[] args) {
        int number1,number2,secim;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz : ");
        number1 = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz :");
        number2 = input.nextInt();
        System.out.print("Hangi İşlem Yapılsın?");
        System.out.println("1-Toplama,2-Çıkarma,3-Bölme,4-Çarpma");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplama işlemi Sonucu : "+(number1+number2));
                break;
            case 2:
                System.out.println("Çıkarma İşlemi Sonucu :" +(number1-number2));
                break;
            case 3:
                System.out.println("Bölme İşlemi Sonucu : "+(number1/number2));
                break;
            case 4:
                System.out.println("Çarma İşlemi Sonucu : "+(number1*number2));
                break;
            default:
                System.out.println("Girdiğiniz İşlem Hatalıdır.");
                break;
        }
    }
}
