package com.dolo.pattern.factory.factorymethod;


import com.dolo.pattern.factory.entity.IPayment;
import com.dolo.pattern.factory.entity.JDPayment;

public class JDPaymentFactory implements PaymentFactory {

    @Override
    public JDPayment create() {
        return new JDPayment();
    }
}
