package Project;

import java.util.Scanner;

public class ATMUygulamasi {
    public static void main(String[] args) {
        int n ;
        String userName,userPassword;
        int right = 3;
        int balance = 1500;
        int select;
        int price;
        Scanner input = new Scanner(System.in);


        while (right > 0) {
            System.out.println("ATM'ye Hoşgeldiniz..");
            System.out.println("Giriş Yapmak İçin Kullanıcı Adı Giriniz");
            userName = input.nextLine();
            System.out.println("Giriş Yapmak İçin Şifre Giriniz");
            userPassword = input.nextLine();
            if (userName.equals("olguhan") && userPassword.equals("hunerli")){
                System.out.println("ATM'ye Hoşgeldiniz!!!");

                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();
                switch (select) {
                    case 1 :
                        System.out.print("Para miktarı : ");
                         price = input.nextInt();
                        balance += price;
                        System.out.println("Yeni Bakiye "+balance);
                        break;
                    case 2 :
                        System.out.print("Para miktarı : ");
                         price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                            System.out.println("Yeni Bakiye "+balance);
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        break;
                    case 4:
                        if (select != 4) {
                            System.out.println("Tekrar görüşmek üzere.");

                        }
                        break;
                }

            }

            else {
                right-- ;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }

        }
    }
}
