package com.dolo.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例
 * 注册式式单例实际上维护的是一组单例类的实例，将这些实例存储到一个Map(登记簿)
 * 中，对于已经登记过的单例，则从工厂直接返回，对于没有登记的，则先登记，而后
 * 返回
 */
public class RegisterSingleton {

    private static Map<String,RegisterSingleton> registerSingletonMap = new ConcurrentHashMap<>();


}
