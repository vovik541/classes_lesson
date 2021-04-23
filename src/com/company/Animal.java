package com.company;

import java.util.Random;

public class Animal extends Universe{

    private int weight;

    public Animal(){
        super();
        weight = new Random().nextInt(3) + 1;
    }

    public void saySomething(){
        System.out.println("Hi, I am animal");
    }

    public int getWeight(){
        return this.weight;
    }

    public void setWeight(int newWeight) throws Exception {
        if(1000 > newWeight) {
            this.weight = newWeight;
        }else {
            throw new Exception();
        }
    }
}
