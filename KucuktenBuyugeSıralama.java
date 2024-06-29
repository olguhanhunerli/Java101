package Project;


import java.util.Scanner;

public class KucuktenBuyugeSıralama {
    public static void main(String[] args) {
        int number1,number2,number3;

        Scanner input = new Scanner(System.in);
        System.out.println("Merhaba: ");
        System.out.println("1.sayıyı giriniz");
        number1 = input.nextInt();
        System.out.println("2. sayıyı giriniz");
        number2 = input.nextInt();
        System.out.println("3.sayıyı giriniz ");
        number3 = input.nextInt();

        if ((number1 < number2 ) && (number1 < number3)) {
            if (number2 < number3) {
                System.out.println("1.koşul");
            }
            else {
                System.out.println("2.koşul");
            }
        }
        else if ((number2<number1) && (number2<number3)) {
            if (number1 < number3) {
                System.out.println("3.koşul");
            }
            else {
                System.out.println("4.Koşul");
            }
        }
        else {
            System.out.println("5.Koşul");
        }

    }
}
