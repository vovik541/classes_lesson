package com.company;

import java.util.Random;

public class Cat extends Animal{

    public Cat(){
        super();
        try {
            setWeight(new Random().nextInt(20) + 5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saySomething(){
        System.out.println("Meow meow, mrrr");
    }
}
