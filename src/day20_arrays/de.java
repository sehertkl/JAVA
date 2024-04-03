package day20_arrays;

import java.util.Scanner;

public class de {
    public static void main(String[] args) {
        boolean donensonuc= kontrol();

        if(donensonuc){
            System.out.println("sisteme basariyle giris yapilmistir");
        }

    }
    public static boolean kontrol() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen isminizi girin");
        String isim = scanner.next();
        System.out.println("lutfen soyisminizi girin");
        String soyisim = scanner.next();
        System.out.println("lutfen mailinizi girin");
        String email = scanner.next();
        System.out.println("lutfen lutfen sifrenizi girin");
        String sifre = scanner.next();


        boolean kontrolflag = true;


        if (email.contains(" ")) {
            System.out.println("Mailiniz bosluk icermemeli.");
            kontrolflag = false;
        }

     /*   if(email.indexOf(" ")>0){
            System.out.println("Mailiniz bosluk icermemeli");
        }*/
        if (!email.contains("@")) {
            System.out.println("Mailiniz @ icermeli");
            kontrolflag=false;

        }

   /* if(email.indexOf("@")<0){
        System.out.println("Mailnizde @ simgesi bulunmali");
    }
*/

        if (!email.endsWith(".com")) {
            System.out.println("Mailiniz .com ile bitmeli");
            kontrolflag=false;
        }

        if (sifre.length() != 6) {
            System.out.println("sifreniz 6 karakter olmali");
            kontrolflag=false;
        }
        if (sifre.isEmpty()) {
            System.out.println("sifre bos olamaz");
            kontrolflag=false;
        }
        if (sifre.contains(" ")) {
            System.out.println("sifrede bosluk olamaz");
            kontrolflag=false;
        }

        if (sifre.replaceAll("\\D", "").isEmpty()) {
            System.out.println("bir tane sayi olmali");
            kontrolflag=false;
        }

        boolean flag= true;
        for (int i = 0; i < sifre.length(); i++) {
            if (Character.isUpperCase(sifre.charAt(i))){

                flag=false;
            }
        }
        if(flag){
            System.out.println("buyuk Harf kullanin");
            kontrolflag=false;
        }

        if (sifre.contains(isim)|| sifre.contains(soyisim)){
            System.out.println("sifre isim soiyisim iceremez");
            kontrolflag=false;
        }


        return kontrolflag;





    }
}

