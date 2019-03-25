package com.dolo.pattern.factory.simplefactory;

import com.dolo.pattern.factory.entity.JDPayment;
import com.dolo.pattern.factory.entity.WXPayment;

public class SimpleFactoryTest {

    public static void main(String[] args) throws Exception {
        PaymentSimpleFactory paymentSimpleFactory = new PaymentSimpleFactory();
        WXPayment wxPayment = (WXPayment) paymentSimpleFactory.creatPayment("wx");
        wxPayment.payment();

        JDPayment jdPayment = (JDPayment) paymentSimpleFactory.creatPayTypeByClassName(JDPayment.class);
        jdPayment.payment();
    }
}
