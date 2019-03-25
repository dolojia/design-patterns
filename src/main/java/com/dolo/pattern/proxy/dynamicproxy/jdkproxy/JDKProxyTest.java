package com.dolo.pattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.Method;

/**
 * 测试代理实现
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        try {

            Object obj = new JDKMeipo().getInstance(new Girl());
            Method method = obj.getClass().getMethod("findLove", null);
            method.invoke(obj);

            //obj.findLove();

            //$Proxy0
            //打印代理类class文件
//            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
//            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
//            os.write(bytes);
//            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
