package com.baigaoli.single;

/**
 * Created by likaisong on 2019/3/31.
 */
public enum EnumSingleInstance {
    SINGLEINSTANCE;
    public static EnumSingleInstance getInstance(){
        return EnumSingleInstance.SINGLEINSTANCE;
    }
}
