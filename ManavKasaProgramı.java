package Project;

import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        double armut=2.14,elma= 3.67,domates=1.11,muz = 0.95, patlican=5.0, sonuc;
        double armutKG,elmaKG,domatesKG,muzKG,patlicanKG;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut Fiyatı  = "+armut+"TL");
        System.out.println("Elma Fiyatı  = "+elma+"TL");
        System.out.println("Domates Fiyatı  = "+domates+"TL");
        System.out.println("Muz Fiyatı  = "+muz+"TL");
        System.out.println("Patlıcan Fiyatı  = "+patlican+"TL");

        System.out.println("Armut Kaç Kilo Olacak =");
        armutKG = input.nextDouble();
        System.out.println("Elma Kaç Kilo Olacak: ");
        elmaKG = input.nextDouble();
        System.out.println("Domates Kaç Kilo Olacak: ");
        domatesKG = input.nextDouble();
        System.out.println("Muz Kaç Kilo Olacak: ");
        muzKG = input.nextDouble();
        System.out.println("Patlıcan Kaç Kilo Olacak: ");
        patlicanKG = input.nextDouble();

        sonuc = (armut*armutKG)+(patlican*patlicanKG)+(elma*elmaKG)+(domates*domatesKG)+(muz*muzKG);

        System.out.println("Toplam Tutar = "+sonuc+"TL");
    }
}
