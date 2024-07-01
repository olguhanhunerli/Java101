package Project;

import java.util.Scanner;

public class ÇinZodyağı {
    public static void main(String[] args) {
        int dogumYili,cinZodyak;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Doğum Yılınızı Giriniz :");
        dogumYili = input.nextInt();

       if (dogumYili % 12 == 0) {
           System.out.println("Çin Zodyağınız = Maymun");
       }
       else if (dogumYili % 12 == 1){
           System.out.println("Çin Zodyağını = Horoz");
       }
       else if (dogumYili % 12 == 2){
           System.out.println("Çin Zodyağını = Köpek");
       }
       else if (dogumYili % 12 == 3){
           System.out.println("Çin Zodyağını = Domuz");
       }
       else if (dogumYili % 12 == 4){
           System.out.println("Çin Zodyağını = Fare");
       }
       else if (dogumYili % 12 == 5){
           System.out.println("Çin Zodyağını = Öküz");
       }
       else if (dogumYili % 12 == 6){
           System.out.println("Çin Zodyağını = Kaplan");
       }
       else if (dogumYili % 12 == 7){
           System.out.println("Çin Zodyağını = Tavşan");
       }
       else if (dogumYili % 12 == 8){
           System.out.println("Çin Zodyağını = Ejderha");
       }
       else if (dogumYili % 12 == 9){
           System.out.println("Çin Zodyağını = Yılan");
       }
       else if (dogumYili % 12 == 10){
           System.out.println("Çin Zodyağını = At");
       }
       else if (dogumYili % 12 == 11){
           System.out.println("Çin Zodyağını = Koyun");
       }
       else {
           System.out.println("Girdiğiniz Tarih Geçersizdir.");
       }
    }
}
