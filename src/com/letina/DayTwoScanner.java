package com.letina;

import java.util.Scanner;

public class DayTwoScanner {
    public static void main(String[] args) {
        Double num1,num2,answer;
        Scanner chukua;
        chukua =new Scanner(System.in);
        System.out.println("Enter the first Number");
        num1=chukua.nextDouble();
        System.out.println("Enter the second Number");
        num2=chukua.nextDouble();
        answer=num1*num2;
        System.out.println("Your product/answer is "+answer);
    }
}
