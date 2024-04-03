package day13_forLoop;

import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucukse, program calıssın

        Scanner scanner=new Scanner(System.in);
        System.out.println("başlangıc ve btiş sayıları giriniz");
        int baslangic = scanner.nextInt();
        int bitis = scanner.nextInt();


        int toplam =0;
        if(baslangic<bitis) {
            for (int i = baslangic; i <= bitis; i++) {
                toplam += i;
            }

        }else {
            for (int i = bitis; i <= baslangic; i++) {
                toplam +=i;
            }
        }




        System.out.println(toplam);



    }
}
