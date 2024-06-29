package Project;

import java.util.Scanner;

public class SıcaklıkDeğerineGöreAktivite {
    public static void main(String[] args) {
        int sıcaklık;
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık Değeri Giriniz :");
        sıcaklık = input.nextInt();

        if (sıcaklık < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if (sıcaklık >= 5 && sıcaklık <= 15) {
            System.out.println("Sinemaya Gidebilirsiniz");
        }
        else if (sıcaklık >15 && sıcaklık <=25 ) {
            System.out.println("Piknik Yapabilirsiniz");
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
