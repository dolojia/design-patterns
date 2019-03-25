package com.dolo.pattern.singleton.hungry;

/**
 * 饿汉式单例静态块写法
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    private static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
