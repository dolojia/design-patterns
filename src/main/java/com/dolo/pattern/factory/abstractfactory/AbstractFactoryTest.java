package com.dolo.pattern.factory.abstractfactory;

/**
 * 抽象工厂模式测试方法
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AdidasFatory adidasFatory = new AdidasFatory();
        adidasFatory.creatIShoes().makeShoes();
        adidasFatory.credatICloths().makeCloths();
        adidasFatory.buyMaterial("adidasFatory");

        NikeFatory nikeFatory = new NikeFatory();
        nikeFatory.creatIShoes().makeShoes();
        nikeFatory.credatICloths().makeCloths();
        adidasFatory.buyMaterial("nikeFatory");
    }

}
