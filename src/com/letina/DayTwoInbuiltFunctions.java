package com.letina;

public class DayTwoInbuiltFunctions {
    public static void main(String[] args) {
        String x;
        int y = 10;
        String z= "Years";
        x="      Hello            King";
        String w="Hello";
        String p="Hello";
        System.out.println(x.length());
        System.out.println(x.toUpperCase());
        System.out.println(x.toLowerCase());
        System.out.println(x.trim());
        System.out.println(y+" "+z);
        System.out.println(z.concat(String.valueOf(y)));
        if (w.equals(p)){
            System.out.println("Congrats");
        }
        else{
            System.out.println("Umeshindwa");
        }
//        if (x.length()==5)
    }
}
