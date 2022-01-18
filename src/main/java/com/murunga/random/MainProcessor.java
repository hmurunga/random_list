package com.murunga.random;

import java.util.ArrayList;
import java.util.List;

public class MainProcessor {
    public static void main(String[] args){

        RandomGenerator obj = new RandomGenerator();
        List<String> list = new ArrayList<>();
        list.add("Kwesi");
        list.add("David");
        list.add("Hilary");


        System.out.println(obj.getRandomElement(list));



    }
}
