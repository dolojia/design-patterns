package com.dolo.pattern.factory.factorymethod;

import com.dolo.pattern.factory.entity.JDPayment;
import com.dolo.pattern.factory.entity.WXPayment;

/**
 * 工厂方法模式测试类
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        JDPaymentFactory jdPaymentFactory = new JDPaymentFactory();
        JDPayment jdPayment = jdPaymentFactory.create();
        jdPayment.payment();

        WXPaymentFactory wxPaymentFactory = new WXPaymentFactory();
        WXPayment wxPayment = wxPaymentFactory.create();
        wxPayment.payment();
    }
}
