package Project;

import java.util.Scanner;

public class ÜçgenAlanı {
    public static void main(String[] args) {
        double alan,kenar1,kenar2,kenar3,cevre,u ;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Kenar Uzunluğunu Giriniz : " );
        kenar1 = input.nextInt();
        System.out.println("2.Kenar Uzunluğunu Giriniz : " );
        kenar2= input.nextInt();
        System.out.println("3.Kenar Uzunluğunu Giriniz : " );
        kenar3=input.nextInt();
        u = (kenar1+kenar2+kenar3)/2;
        cevre=u*2;
        alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Üçgenin Çevresi = " +cevre);
        System.out.println("Üçgenin Alanı = " +alan);
    }
}
