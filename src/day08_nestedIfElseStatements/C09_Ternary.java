package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C09_Ternary {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan iki sayi alin
        //         ve buyuk olmayan sayiyi yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 sayi giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        System.out.println( sayi1>sayi2 ? "" + sayi2 : sayi1);
    }
}