package day11_stringManipulation;

import java.util.Scanner;

public class calısma {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("cümle giriniz");
        String cumle= scanner.nextLine();
        if(cumle.contains("ev") && cumle.contains("iş")){
            System.out.println("hem ev lazım hem iş");
        } else if (cumle.contains("ev")) {
            System.out.println("home swert home");

        } else if (cumle.contains("iş")) {
            System.out.println("calıssmak güzel");

        }else {
            System.out.println("çalışman lazım");
        }
    }
}
