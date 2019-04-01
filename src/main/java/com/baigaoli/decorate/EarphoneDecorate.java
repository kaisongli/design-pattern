package com.baigaoli.decorate;

/**
 * Created by likaisong on 2019/3/31.
 */
public class EarphoneDecorate extends IphoneDecorate {
    private Iphone iphone;

    public EarphoneDecorate(Iphone iphone) {
        this.iphone = iphone;
    }

    @Override
    protected void desperation() {
        iphone.desperation();
        System.out.println("Earphone's price is 2000.0");
        System.out.println("sum is " + sell());
    }

    @Override
    protected double sell() {
        return 2000 + iphone.sell();
    }
}
