package com.dolo.pattern.factory.abstractfactory;

/**
 * 耐克工厂创建耐克牌鞋子+衣服
 */
public class NikeFatory extends AbstractFactory {

    @Override
    public IShoes creatIShoes() {
        return new NikeShoes();
    }

    @Override
    public ICloths credatICloths() {
        return new NikeCloths();
    }
}
