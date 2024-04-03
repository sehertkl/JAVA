package day24_arrayLists_forEachLoop;

import java.util.Scanner;

public class deneme3 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        //        case sensitive olmadan,
        //        harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        //        kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir cümle ve bir harf giriniz");
        String cumle = scanner.nextLine();
        String harf = scanner.nextLine();

        String[] harfdizisi =cumle.split("");

        int sayac =0;
        for (String each :harfdizisi
             ) {
            if(each.equals(harf)){
                sayac++ ;
            }

        }
        System.out.println(sayac);




    }
}
