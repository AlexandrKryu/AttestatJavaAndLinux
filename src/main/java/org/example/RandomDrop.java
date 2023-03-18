package org.example;

import java.util.Random;

public class RandomDrop {
    public static int rnd(){
        Random random = new Random();
        return random.nextInt(100);
    }
}