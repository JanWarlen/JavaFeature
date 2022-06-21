package com.janwarlen.feature;

//https://openjdk.org/jeps/181
public class NestClass {
    public static class NestClass_1 {
        public void func() {
            NestClass_2 n2 = new NestClass_2();
            System.out.println("NestClass_1:func:NestClass_2:name:" + n2.name);
            NestClass nestClass = new NestClass();
            InnerClass i1 = nestClass.new InnerClass();
            System.out.println("NestClass_1:func:InnerClass:name:" + i1.name);
        }
    }

    public static class NestClass_2 {
        private String name = "NestClass_2";
    }

    public class InnerClass {
        private String name = "InnerClass";
    }
}
