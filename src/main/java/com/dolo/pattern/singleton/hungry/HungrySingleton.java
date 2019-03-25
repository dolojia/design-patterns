package com.dolo.pattern.singleton.hungry;

/**
 * 饿汉式单例
 * 类加载的时候就立即初始化，并且创建单例对象
 * 优点：没有加任何的锁、执行效率比较高，在用户体验上来说，比懒汉式更好
 * 缺点：类加载的时候就初始化，不管你用还是不用，都占着空间.费了内存
 * 绝对线程安全，在线程还没出现以前就是实例化了，不可能存在访问安全问题
 */
public class HungrySingleton {
    //先静态、后动态
    //先属性、后方法
    //先上后下
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    private HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
