package com.janwarlen.feature;

public class TextBlock {

    public static void func() {
        String txt = """
                1
                2
                3
                4
                5
                """;
        System.out.println(txt);
        String code = """
              public void print($type o) {
                  System.out.println(Objects.toString(o));
              }
              """.replace("$type", "23333333");
        System.out.println(code);
    }
}
