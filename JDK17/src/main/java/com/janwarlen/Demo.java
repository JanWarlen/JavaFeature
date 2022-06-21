package com.janwarlen;

import com.janwarlen.feature.Circle;
import com.janwarlen.feature.DeserializationFilter;
import com.janwarlen.feature.Shape;
import com.janwarlen.feature.StrictFloat;
import com.janwarlen.feature.shape.Rectangle;
import com.janwarlen.feature.shape.SpecialRectangle;
import com.janwarlen.feature.shape.SpecialSquare;
import com.janwarlen.feature.shape.Square;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Shape cirle = new Circle();
        Shape rectangle = new Rectangle();
        Shape specialRectangle = new SpecialRectangle();
        Shape square = new Square();
        Shape specialSquare = new SpecialSquare();
        Arrays.asList(cirle,rectangle,specialRectangle,square,specialSquare).forEach(Shape::func);
        System.out.println("-------------------------------");
        StrictFloat.func();
        System.out.println("-------------------------------");
//        DeserializationFilter.func();
        DeserializationFilter.serial(cirle);
        DeserializationFilter.deserial();
    }
}
