package Project;

import java.util.Scanner;

public class ArtıkYıl {
    public static void main(String[] args) {
        int artikYil;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Yıl Giriniz :");
        artikYil = input.nextInt();

        if ((artikYil % 4 == 0 && artikYil % 100 !=0 ) || artikYil % 400 == 0){
            System.out.println("Verdiğiniz Yıl Bir ARtık Yıldır.");
        }
        else {
            System.out.println("Artık Yıl Değildir.");
        }
    }
}
