package com.baigaoli.decorate;

/**
 * Created by likaisong on 2019/3/31.
 */
public class TestDecorate {
    public static void main(String[] args){
        Iphone iphone8 = new EarphoneDecorate(new Iphone8());
        iphone8.desperation();
        System.out.println("================");
        Iphone iphone7 = new Iphone7();
        iphone7= new EarphoneDecorate(iphone7);
        iphone7 = new SDCardDecorate(iphone7);
        iphone7.desperation();
    }
}
