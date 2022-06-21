package com.janwarlen.feature;

public class StrictFloat {
    public static void func() {
        float a = 0.1f + 0.2f;
        float b = 0.15f * 2;
        System.out.println(a == b);
    }
}
