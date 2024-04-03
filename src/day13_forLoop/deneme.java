package day13_forLoop;

public class deneme {
    public static void main(String[] args) {
        // 60 ve 23 dahil olmak uzere
        // 7 ile bolunebilen sayilari 60'dan geriye dogru yazdirin

        for (int i = 60; i >= 23 ; i--) {
            if(i%7==0){
                System.out.println(i);
            }

        }

    }
}
