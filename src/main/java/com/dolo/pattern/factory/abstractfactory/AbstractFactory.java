package com.dolo.pattern.factory.abstractfactory;

/**
 * 抽象工厂模式（提供方法，不在乎谁来生产制作）
 * 提供一个创建一系列相关或相互依赖对象的接口，无须指定他们具体的类
 * 易于扩展
 */
public abstract class AbstractFactory {

    //售卖产品
    public void buyMaterial(String brandName){
        System.out.println(brandName + ":购买相同的原材料");
    }

    //制作鞋子
    abstract IShoes creatIShoes();

    //制作衣服
    abstract ICloths credatICloths();

}
