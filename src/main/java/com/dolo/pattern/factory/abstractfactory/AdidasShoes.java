package com.dolo.pattern.factory.abstractfactory;

public class AdidasShoes implements IShoes {

    @Override
    public void makeShoes() {
        System.out.println("阿迪达斯制作衣服。。。");
    }
}
