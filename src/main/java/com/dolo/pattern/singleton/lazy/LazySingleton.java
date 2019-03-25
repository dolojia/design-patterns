package com.dolo.pattern.singleton.lazy;

/***
 * 懒汉式单例
 * 在外部需要使用的时候才进行实例化
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                //双重锁机制
                if (lazySingleton == null) {
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazySingleton指向刚分配的内存地址
                    //4.初次访问对象
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
