package com.dolo.pattern.proxy.dynamicproxy.doproxy;


import com.dolo.pattern.proxy.Person;
import com.dolo.pattern.proxy.dynamicproxy.jdkproxy.Girl;

/**
 * 测试手写动态代理功能（字节码重组）
 * 1、拿到被代理对象的引用，并且获取到它的所有的接口，反射获取。
 * 2、JDK Proxy 类重新生成一个新的类、同时新的类要实现被代理类所有实现的所有的接 口。
 * 3、动态生成 Java 代码，把新加的业务逻辑方法由一定的逻辑代码去调用(在代码中体 现)。
 * 4、编译新生成的 Java 代码.class。
 * 5、再重新加载到 JVM 中运行。
 */
public class DOProxyTest {

    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Person obj = (Person) new DOMeipo().getInstance(new Girl());
            System.out.println(obj.getClass());
            obj.findLove();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
