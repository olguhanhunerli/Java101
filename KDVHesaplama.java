package Project;

import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        double kdvliFiyat,kdvOranı,fiyat;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Fiyat Giriniz :");
        fiyat = input.nextDouble();

        if (fiyat>= 0 && fiyat <=1000) {
            System.out.println("Kdv'siz fiyat : " + fiyat+"TL");
            kdvliFiyat = fiyat+(fiyat * 0.18);
            System.out.println("Kdvli Fiyat : "+kdvliFiyat+"TL");
            kdvOranı = 0.18;
            System.out.println("Kdv Ordanı : " +kdvOranı+"TL");
        }
        else if (fiyat >1000){
            System.out.println("Kdv'siz fiyat : " + fiyat+"TL");
            kdvliFiyat = (fiyat * 0.08)+fiyat;
            System.out.println("Kdvli Fiyat : "+kdvliFiyat+"TL");
            kdvOranı = 0.08;
            System.out.println("Kdv Ordanı : " +kdvOranı+"TL");
        }


    }
}
