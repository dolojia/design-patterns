package com.dolo.pattern.proxy.simpleproxy;


/**
 * Subject 是顶层接口，RealSubject 是真实对象(被代理对象)，
 * Proxy 是代理对象，代 理对象持有被代理对象的引用，客户端调用代理对象方法，
 * 同时也调用被代理对象的方 法，但是在代理对象前后增加一些处理。
 * 在代码中，我们想到代理，就会理解为是代码 增强，
 * 其实就是在原本逻辑前后增加一些逻辑，而调用者无感知。
 * 代理模式属于结构型 模式，有静态代理和动态代理。
 */
public class Client {

    public static void main(String[] args) {

        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();

    }

}
