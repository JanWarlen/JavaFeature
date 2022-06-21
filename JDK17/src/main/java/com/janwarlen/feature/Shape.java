package com.janwarlen.feature;

import com.janwarlen.feature.shape.Rectangle;
import com.janwarlen.feature.shape.Square;

import java.io.Serializable;

public sealed class Shape implements Serializable permits Circle,
        com.janwarlen.feature.shape.Rectangle,
        com.janwarlen.feature.shape.Square {
    public void func() {
        System.out.println(this.getClass().getName());
    }
}
