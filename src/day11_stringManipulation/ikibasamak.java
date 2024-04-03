package day11_stringManipulation;

import java.util.Scanner;

public class ikibasamak {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("iki basamaklı sayı giriniz");
        int sayı =scanner.nextInt();
        int birlerbasamak =sayı % 10 ;
        int onlarbasamak = sayı / 10;
        switch (onlarbasamak){
            case 1 :
                System.out.println("on");
                break;
            case 2 :
                System.out.println("yirmi");
                break;
            case 3 :
                System.out.println("otuz");
                break;
            case 4 :
                System.out.println("kırk");
                break;
            case 5 :
                System.out.println("elli");
                break;
            case 6 :
                System.out.println("altmış");
                break;
            case 7 :
                System.out.println("yetmiş");
                break;
            case 8 :
                System.out.println("seksem");
                break;
                case 9 :
                System.out.println("doksan");
                break;


        }
        switch (birlerbasamak){
            case 0 :
                break;
            case 1 :
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
        }


    }
}
