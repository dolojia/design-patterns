package com.dolo.pattern.factory.entity;

public class JDPayment implements IPayment{

    @Override
    public void payment() {
        System.out.println("京东支付。。。");
    }
}
