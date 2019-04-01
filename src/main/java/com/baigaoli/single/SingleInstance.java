package com.baigaoli.single;

/**
 * Created by likaisong on 2019/3/31.
 */
public class SingleInstance {

    private static volatile SingleInstance singleIntace ;

    private SingleInstance(){}
    //双重校验
    public static SingleInstance getSingleIntace(){
        if (singleIntace == null){
            synchronized (SingleInstance.class){
                if (singleIntace == null) {
                    singleIntace = new SingleInstance();
                }
            }
        }
        return singleIntace;
    }

}
