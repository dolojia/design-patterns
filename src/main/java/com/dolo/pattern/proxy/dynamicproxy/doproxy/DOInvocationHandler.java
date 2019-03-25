package com.dolo.pattern.proxy.dynamicproxy.doproxy;

import java.lang.reflect.Method;

/**
 * 实现InvocationHandler
 */
public interface DOInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
