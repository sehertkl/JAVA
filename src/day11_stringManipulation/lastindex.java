package day11_stringManipulation;

import java.sql.SQLOutput;

public class lastindex {
    public static void main(String[] args) {
        String str ="Bu Java ogrenilecek";
        System.out.println(str.indexOf('e'));
        System.out.println(str.lastIndexOf("e"));
        System.out.println("ilk index :" + str.indexOf('u'));
        System.out.println("son index :" + str.lastIndexOf("u"));

        if (str.indexOf('J') ==-1){
            System.out.println("j yoktur");
        } else if (str.indexOf('J') == str.lastIndexOf("J")) {
            System.out.println("1 kez kullanıkldı");
            System.out.println(str.indexOf("x"));
        }


    }
}
