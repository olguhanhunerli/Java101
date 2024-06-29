package Project;

import java.util.Scanner;

public class KullanıcıGirişi {
    public static void main(String[] args) {
        String userName,password = "vuuanex",sifre;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı Adı Giriniz: ");
        userName = input.next();
        System.out.println("Şifre Giriniz");
        sifre = input.next();

        if (userName.equals("olguhan") && password.equals(sifre)){
            System.out.println("Giriş Başarılı!");
        }else {
            String newPassword;
            int select;
            System.out.println(" Şifre Yanlış. Güncellemek İster Misiniz?");
            System.out.println("1-Evet, 2-Hayır.");
            select = input.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Yeni Şifre Giriniz!");
                    newPassword = input.next();
                    if (newPassword.equals(password)){
                        System.out.println("Bir Önceki Şifre İle Aynı Kabul Edilemez!");
                    }
                    else {
                        System.out.println("Şifre Başarı İle Değiştirildi.");
                    }
                    break;
                case 2:
                    System.out.println("Şifre Değiştirmek İstemediniz.");
                    break;
                default:
                    System.out.println("Hatalı İşlem Girdiniz.");

            }


        }

    }
}
