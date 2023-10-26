package com.example;

import java.util.List;

public class Lion implements Kittens {

    boolean hasMane;
    int kittens;

    public Lion(String sex, int kittens) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.kittens = kittens;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }

    @Override
    public int getKittens(int kittens) {
        return kittens;
    }
}
