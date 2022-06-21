package com.janwarlen.feature;

public class SwitchExpressions {

    public static void func1(String arg) {
        switch (arg) {
            case "1":
            case "2":
            case "3":
                System.out.println("small");
                break;
            case "4":
            case "5":
            case "6":
                System.out.println("big");
                break;
            default:
                System.out.println("illegal");
                break;
        }
    }

    public static void func1Enhanced(String arg) {
        switch (arg) {
            case "1", "2", "3" -> System.out.println("small");
            case "4", "5", "6" -> System.out.println("big");
            default -> System.out.println("illegal");
        }
    }

    public static void func2(int e) {
        int x;
        switch (e) {
            case 1:
                x = 111;
                break;
            case 2:
                x = 222;
                break;
            case 3:
                x = 233;
                break;
            default:
                x = 666;
                break;
        }
        System.out.println(x);
    }

    public static void func2Enhanced(int e) {
        int x = switch (e) {
            case 1 -> 111;
            case 2 -> 222;
            case 3 -> 233;
            default -> 666;
        };
        System.out.println(x);
    }

    public static void func3(String yield) {
        int d = switch (yield.trim()) {
            case "MONDAY" -> {
                System.out.println("monday");
                yield 1;
            }
            case "TUESDAY" -> {
                System.out.println("TUESDAY");
                yield 2;
            }
            default -> {
                System.out.println("not monday");
                yield 0;
            }
        };
        System.out.println("func3:" + d);
    }

}
