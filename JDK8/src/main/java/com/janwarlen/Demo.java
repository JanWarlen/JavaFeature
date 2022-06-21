package com.janwarlen;

import com.janwarlen.feature.ConstantDynamic;
import com.janwarlen.feature.NestClass;
import com.janwarlen.feature.StrictFloat;

public class Demo {
    public static void main(String[] args) {
        NestClass.NestClass_1 n1 = new NestClass.NestClass_1();
        n1.func();

        System.out.println(ConstantDynamic.Constant);
        System.out.println(ConstantDynamic.DynamicConstant);
        System.out.println(ConstantDynamic.DynamicConstant);

        StrictFloat.func();
        StrictFloat.func2();
    }
}
