package day20_arrays;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        // Kullanicinin girdigi maili ve sifreyi asagidaki sartlara gore degerlendiren
        // ve asagidaki sartlara uymasi durumunda true deger donduren ve
        // Ekranda "Sisteme kaydiniz bassariyla yapilmistir." mesaji veren bir method yazin

//email sartlari
        //emailinde bosluk olmamali
        //emailinde "@" icermeli
        //emaili ".com" ile bitmeli

//sifre sartlari
        // sifre 6 haneli olsun
        // sifrede bir tane sayi olsun
        // sifre bos olamazs
        //sifrede bosluk olmasin
        //sifrede buyuk harf olsun
        // Sifresinde adi ve soyadi gecmemeli


        System.out.println(mailSifreK());



    }

    public static String mailSifreK ( ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen Email adresinizi giriniz : ");
        System.out.println("lütfen şifrenizi giriniz");
        String email = scanner.next();
        String sifre = scanner.next();


        int flag = 10;


        if (email.contains(" ")) {
            System.out.println("emailinde bosluk olmamali");
            flag++;

        } else if (!email.contains("@")) {
            System.out.println("emailinde @ icermeli");

        } else if (!email.endsWith(".com")) {

            System.out.println("emaili .com ile bitmeli ");
            flag++;
        }


        if (!(sifre.length() >= 6)) {
            System.out.println("sifre 6 haneli olsun");
            flag++;
        } else if (!(sifre.indexOf("0,1,2,3,4,5,6,7,8,9") == sifre.lastIndexOf("0.1.2.3.4.5.6.7.8.9."))) {
            System.out.println("sifrede bir tane sayi olsun");
            flag++;
        } else if (sifre.length() < 1) {
            System.out.println("sifre bos olamaz");
            flag++;

        } else if (sifre.contains(" ")) {
            System.out.println("sifrede bosluk olmasin");
            flag++;

        } else if (flag == 10) {
            System.out.println("Sisteme kaydiniz bassariyla yapilmistir.");



        }return mailSifreK();

    }

}






