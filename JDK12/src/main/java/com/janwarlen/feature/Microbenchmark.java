package com.janwarlen.feature;

public class Microbenchmark {

    public int func(int i) {
        int sum = 0;
        for (int j = 0; j < i; j++) {
            sum += j;
        }
        return sum;
    }
}
