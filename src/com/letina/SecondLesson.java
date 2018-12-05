package com.letina;

public class SecondLesson {
    public static void main(String[] args) {
        double weight = 58;
        double height = 1.67;
        double bmi = weight/(height*height);

//        System.out.println(bmi);

        if (bmi<15)
        {
            System.out.println("Very Severely Underweight");
        }
        else if (bmi<16){
            System.out.println("Severely Underweight");
        }
        else if(bmi<18.5){
            System.out.println("Underweight");
        }
        else if(bmi<25){
            System.out.println("Normal (healthy weight)");
        }
        else if(bmi<30){
            System.out.println("Overweight");
        }
        else if(bmi<35){
            System.out.println("Obese Class I (Moderately obese)");
        }
        else if(bmi<40){
            System.out.println("Obese Class II (Severely obese)");
        }
        else if(bmi<45){
            System.out.println("Obese Class III (Very severely obese)");

        }
        else if(bmi<50){
            System.out.println("Obese Class IV (Morbidly Obese)");
        }
        else if(bmi<60){
            System.out.println("Obese Class V (Super Obese)");

        }
        else{
            System.out.println("Obese Class VI (Hyper Obese)");
        }

    }
}
