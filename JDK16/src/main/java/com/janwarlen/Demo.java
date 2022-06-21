package com.janwarlen;

import com.janwarlen.feature.Instanceof;
import com.janwarlen.feature.Model;
import com.janwarlen.feature.Record;
import com.janwarlen.feature.StrictFloat;

public class Demo {

    public static void main(String[] args) {
        Instanceof.func("sedg3");
        Instanceof.func(new Model("demo"));

        Record.func();

        StrictFloat.func();
    }
}
