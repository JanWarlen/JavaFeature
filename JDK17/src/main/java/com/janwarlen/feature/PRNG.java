package com.janwarlen.feature;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class PRNG {

    public static void func() {
        RandomGenerator random = RandomGeneratorFactory.of("Random").create();
        RandomGenerator secureRandom = RandomGeneratorFactory.of("SecureRandom").create();
        RandomGenerator splittableRandom = RandomGeneratorFactory.of("SplittableRandom").create();
        RandomGenerator xoroshiro128PlusPlus = RandomGeneratorFactory.of("Xoroshiro128PlusPlus").create();
        RandomGenerator xoshiro256PlusPlus = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create();
        RandomGenerator l64X256MixRandom = RandomGeneratorFactory.of("L64X256MixRandom").create();
        RandomGenerator l64X128StarStarRandom = RandomGeneratorFactory.of("L64X128StarStarRandom").create();
        RandomGenerator l64X128MixRandom = RandomGeneratorFactory.of("L64X128MixRandom").create();
        RandomGenerator l64X1024MixRandom = RandomGeneratorFactory.of("L64X1024MixRandom").create();
        RandomGenerator l32X64MixRandom = RandomGeneratorFactory.of("L32X64MixRandom").create();
        RandomGenerator l128X256MixRandom = RandomGeneratorFactory.of("L128X256MixRandom").create();
        RandomGenerator l128X128MixRandom = RandomGeneratorFactory.of("L128X128MixRandom").create();
        RandomGenerator l128X1024MixRandom = RandomGeneratorFactory.of("L128X1024MixRandom").create();
    }
}
