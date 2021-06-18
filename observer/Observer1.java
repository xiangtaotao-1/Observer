package com.javamenc.interviewtest.designmode.observer;

public class Observer1 implements Observer{
    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
