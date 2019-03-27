package com.dolo.pattern.decorator.battercake.v2;

/**
 * 基础版煎饼套餐
 */
public class BaseBattercake extends Battercake {
    protected String getMsg(){
        return "煎饼";
    }

    public int getPrice(){
        return 5;
    }
}
