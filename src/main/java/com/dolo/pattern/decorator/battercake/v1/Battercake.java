package com.dolo.pattern.decorator.battercake.v1;

/**
 * 简单实现煎饼+鸡蛋+香肠（继承方式的缺陷）
 */
public class Battercake {

    protected String getMsg(){
        return "煎饼";
    }

    public int getPrice(){
        return 5;
    }

}
