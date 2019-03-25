package com.dolo.pattern.factory.factorymethod;

import com.dolo.pattern.factory.entity.IPayment;

/**
 * 工厂方法模式
 * 创建对象的接口，但让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行
 */
public interface PaymentFactory {

    IPayment create();

}
