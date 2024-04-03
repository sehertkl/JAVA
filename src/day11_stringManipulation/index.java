package day11_stringManipulation;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir cümle yazımnız");
        String cumle = scanner.nextLine();
        System.out.println("aranacak metni giriniz");
        String metin = scanner.nextLine();
        if(!cumle.contains(metin)){
            System.out.println("metin cümlede yok");
        }else if(cumle.indexOf(metin)== cumle.lastIndexOf(metin)){
            System.out.println("1 kere kullanılmıs");
        }else {
            System.out.println("1 den fazla kullanıomıs");
        }
    }
}
