package com.letina;

public class DayTwoDataTypeConversion {
    public static void main(String[] args) {
        //Data type conversion
        String x,y;
        x="10";
        y="20";
        int xc,yc;
        xc=Integer.valueOf(x);
        yc=Integer.parseInt(y);
        System.out.println(xc+yc);
        System.out.println(x+y);
        String one,two;
        double f,g;
        one="10.5";
        two="67.5";
        f=Double.parseDouble(one);
        g=Double.parseDouble(two);
        System.out.println("The answer is "+f*g);


    }
}
