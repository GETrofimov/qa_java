package com.example;

import java.util.List;

public class Feline extends Animal implements Predator, HasKittens {

    private int kittens;

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return kittens;
    }

    public void setKittens(int kittens) {
        this.kittens = kittens;
    }
}
