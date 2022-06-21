package com.janwarlen.feature;

public class NPE {

    public static void func() {
        C c = new C();
        c.b = new B();
        try {
            c.b.a.name = "null";
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            B.test().arr[1][2] = 3;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class A {
        public String name;

        public int[][] arr;
    }

    public static class B {
        public A a;

        public static A test() {
            return new A();
        }
    }

    public static class C {
        public B b;
    }
}
