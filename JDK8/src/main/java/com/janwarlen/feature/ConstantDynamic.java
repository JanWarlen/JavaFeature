package com.janwarlen.feature;

public class ConstantDynamic {

    public static final String Constant = "constant";
    public static final String DynamicConstant = func();

    public static String func() {
        System.out.println("ConstantDynamic:func");
        return "233";
    }
}
