package com.letina;

import java.util.Scanner;

public class DayThreeInputValuesToArray {
    public static void main(String[] args) {
        String[] names;
        Scanner chukua;
        int number;
        chukua=new Scanner(System.in);
        System.out.println("How many names do you have?");
        number=chukua.nextInt();
        names=new String[number];
        System.out.println("Enter the " + number + " names");
        for (int x=0; x< number;x++){
            names[x]=chukua.next();    //for next string you dont need to specify type
            if (!(x==number-1)){
            System.out.println("Enter the next name");
            }
        }
        for (int x=0; x< number;x++){

                    System.out.println(names[x]);
            }


    }
}
