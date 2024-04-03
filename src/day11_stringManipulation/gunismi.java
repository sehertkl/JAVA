package day11_stringManipulation;

import java.util.Scanner;

public class gunismi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir gün ismi giriniz");
        String gun =scanner.next().toLowerCase();
        switch (gun) {
            case "pazartesi" :
            case "salı" :
            case "çarsamba" :
            case "perşembe" :
            case "cuma ":
                System.out.println("hafta ici");
                break;
            case "cumartesi" :
            case "pazar":
                System.out.println("hafasonu");
                break;
            default:
                System.out.println("yanlış giriş");


        }

    }
}
