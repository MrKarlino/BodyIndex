package com.company;

public class Main {

    public static void main(String[] args) {

        BmiService bmi = new BmiService ();
        double bodyMassIndex = bmi.calculate(110, 1.95);
        System.out.println(bodyMassIndex);
    }
}
