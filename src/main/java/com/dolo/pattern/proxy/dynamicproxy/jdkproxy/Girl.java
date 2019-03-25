package com.dolo.pattern.proxy.dynamicproxy.jdkproxy;

import com.dolo.pattern.proxy.Person;

/**
 * 女孩相亲
 */
public class Girl implements Person {
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
    }
}
