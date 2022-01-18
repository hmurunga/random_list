package com.murunga.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    public String getRandomElement(List<String> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

}
