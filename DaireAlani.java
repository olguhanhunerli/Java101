package Project;

import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        double pi = 3.14,alan,r,a;
        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçap Giriniz = ");
        r = input.nextDouble();
        System.out.println("Merkez Açı Ölçüsü Giriniz =");
        a = input.nextDouble();

        alan = (pi*(r*r)*a)/360;

        System.out.println("Dairenin alanı=" +alan);
    }
}
