package com.dolo.pattern.singleton.test;


import com.dolo.pattern.singleton.threadlocal.ThreadLocalSingleton;

public class ExectorThread implements Runnable {
    @Override
    public void run() {
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
