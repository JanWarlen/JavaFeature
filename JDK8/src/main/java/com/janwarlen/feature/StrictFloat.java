package com.janwarlen.feature;

public class StrictFloat {
    public static void func() {
        float a = 0.1231231f;
        double b = 0.23456d;
        double c = a + b;
        System.out.println(c);
    }
    public strictfp static void func2() {
        float a = 0.1231231f;
        double b = 0.23456d;
        double c = a + b;
        System.out.println(c);
    }
}
