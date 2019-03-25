package com.dolo.pattern.singleton.lazy;

/**
 * 懒汉式单例增强版--内部类形式实现
 * 特点：在外部类被调用的时候内部类才会被加载
 * 内部类一定是要在方法调用之前初始化
 * 巧妙地避免了线程安全问题
 * 这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
 * 完美地屏蔽了这两个缺点
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        if(LazyHolder.LAZY != null){
            //防止java反射破坏单例
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    //static 是为了使单例的空间共享
    //final 保证这个方法不会被重写，重载
    public static final LazyInnerClassSingleton getInstance() {
        //在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    //默认不加载
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

    //防止序列话破坏单例，重写readResolve方法
    private Object readResolve() {
        return getInstance();
    }


}
