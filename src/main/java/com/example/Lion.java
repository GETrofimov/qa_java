package com.example;

import java.util.List;

public class Lion extends Animal implements HasKittens {

    boolean hasMane;
    int kittens;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return Animal.getFood("Хищник");
    }

    @Override
    public int getKittens() {
        return kittens;
    }

    @Override
    public void setKittens(int kittens){
        this.kittens = kittens;
    }
}
