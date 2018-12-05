package com.letina;

import java.util.Scanner;

public class DayTwoCalculateVolume {
    public static void main(String[] args) {
        Double radius,height,jibu;
        Scanner ingiza;
        ingiza=new Scanner(System.in);
        System.out.println("Enter the Radius");
        radius= ingiza.nextDouble();
        System.out.println("Enter the height");
        height=ingiza.nextDouble();
        jibu = Math.PI*Math.pow(radius,2)*height;
        System.out.println("The answer is "+jibu);
    }
}
