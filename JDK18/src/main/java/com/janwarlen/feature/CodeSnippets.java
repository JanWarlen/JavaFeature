package com.janwarlen.feature;

/**
 * snippet
 */
public class CodeSnippets {
    /**
     * {@snippet :
     *  CodeSnippets.func(); // @highlight substring="func"
     *}
     */
    public static void func() {
        System.out.println("CodeSnippets");
    }

    /**
     * {@snippet file="CodeSnippets.java" region="test"}
     * @param text 打印内容
     */
    public static void func2(String text) {
        System.out.println("CodeSnippets:func2:" + text);
    }

    /**
     * for region test
     */
    public void func3() {
        // @start region="test"
        CodeSnippets.func2("hihihi"); // @replace regex='".*"' replacement="..."
        // @end
    }
}
