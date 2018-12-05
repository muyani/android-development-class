package com.letina;

import javax.swing.*;

public class DayTwoJOptionPane {
    public static void main(String[] args) {
        //using the joption pane
        String num1,num2;
        Double num1Converted,num2Converted,answer;
        num1 = JOptionPane.showInputDialog("Enter the first Number");
        num2 = JOptionPane.showInputDialog("Enter the second number");
        num1Converted=Double.parseDouble(num1);
        num2Converted=Double.parseDouble(num2);
        answer=num1Converted*num2Converted;
        JOptionPane.showMessageDialog(null,"Answer:"+answer);


    }
}
