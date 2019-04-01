package com.baigaoli.decorate;

/**
 * Created by likaisong on 2019/3/31.
 */
public class Iphone7 extends Iphone {
    @Override
    protected void desperation() {
        System.out.println("Iphone7's price is " + sell());
    }

    @Override
    protected double sell() {
        return 7000;
    }
}
