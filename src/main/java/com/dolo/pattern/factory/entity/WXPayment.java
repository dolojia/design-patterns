package com.dolo.pattern.factory.entity;

public class WXPayment implements IPayment {

    @Override
    public void payment() {
        System.out.println("微信支付。。。");
    }
}
