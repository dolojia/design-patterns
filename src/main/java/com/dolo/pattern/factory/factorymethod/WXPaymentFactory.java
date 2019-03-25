package com.dolo.pattern.factory.factorymethod;

import com.dolo.pattern.factory.entity.WXPayment;

public class WXPaymentFactory implements PaymentFactory {

    @Override
    public WXPayment create() {
        return new WXPayment();
    }
}
