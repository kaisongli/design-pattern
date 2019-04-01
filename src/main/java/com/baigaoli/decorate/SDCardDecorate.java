package com.baigaoli.decorate;

/**
 * Created by likaisong on 2019/3/31.
 */
public class SDCardDecorate extends IphoneDecorate {
    private Iphone iphone;
    public SDCardDecorate(Iphone iphone){
        this.iphone = iphone;
    }
    @Override
    protected void desperation() {
        iphone.desperation();
        System.out.println("SDCard's price is 1000");
        System.out.println("sum is " + sell());
    }

    @Override
    protected double sell() {
        return 1000 + iphone.sell();
    }
}
