package Project;

import java.util.Scanner;

public class VücutKitleİndeksi {
    public static void main(String[] args) {
        double boy,sonuc;
        int kilo ;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();
        System.out.println("Lütfen Kilonuzu Giriniz :");
        kilo = input.nextInt();

        sonuc = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz = " +sonuc);
    }
}
