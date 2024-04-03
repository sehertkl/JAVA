package day10_stringManipulations;

import java.util.Scanner;

public class S1_char {
    public static void main(String[] args) {
        //kullanıcıdan bir kelime girmesini isteyiniz
        //girdiği kelimenin ilk harfini kontrol ederek;
        // büyük veya küçük harf ise "küçük harf yada büyük harf olduğunu belirtiniz"
        // rakamla başlıyor ise "rakamla başlamıştır"
        // harf yada rakam ile başlamıyorsa "kelimenin ilk harfi "harf yada rakamdan" oluşmamıştır" şeklinde
        // döndüren method oluşturunuz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Herhangi bir kelime giriniz:");
        String kelime = scanner.next();
        kelimeKontrol(kelime);

    }

    public static char kelimeKontrol(String kelime) {
        char ilkHarf = kelime.charAt(0);

        if (Character.isUpperCase(ilkHarf)) {
            System.out.println("kelimenizin ilk harfi " + ilkHarf + ":  büyük harftir");

        } else if ((Character.isLowerCase(ilkHarf))) {
            System.out.println("kelimenizin ilk harfi " + ilkHarf + ":  küçük harftir");


        } else if (Character.isDigit(ilkHarf)) {
            System.out.println("kelimenizin ilk harfi " + ilkHarf + ":  rakamdır");

        } else {
            System.out.println("kelimenizin ilk harfi " + ilkHarf + ":  harf yada rakamdan oluşmamıştır");
        }
        return ilkHarf;

    }
}

