package com.dolo.pattern.factory.abstractfactory;

/**
 * 阿迪达斯工厂制作阿迪达斯牌衣服+鞋子
 */
public class AdidasFatory extends AbstractFactory {

    @Override
    public IShoes creatIShoes() {
        return new AdidasShoes();
    }

    @Override
    public ICloths credatICloths() {
        return new AdidasCloths();
    }
}
