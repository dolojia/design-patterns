package com.dolo.pattern.proxy.simpleproxy;

/**
 * 静态代理
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("real service is called.");
    }
}
