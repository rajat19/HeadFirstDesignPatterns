package com.hfdp.behavioural.strategy.behaviours;

public class NoQuackSound implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("No Quack Sound Produced");
    }
}
