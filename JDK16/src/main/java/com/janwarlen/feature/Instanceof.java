package com.janwarlen.feature;

public class Instanceof {

    private static Model m = new Model("private");

    public static void func(Object obj) {
        if (obj instanceof String s) {
            System.out.println(s);
        } else if (obj instanceof Model m) {
            System.out.println("instanceof:" + m.getName());
        }
        System.out.println("out:instanceof:" + m.getName());
    }
}
