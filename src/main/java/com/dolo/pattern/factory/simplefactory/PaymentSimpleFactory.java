package com.dolo.pattern.factory.simplefactory;


import com.dolo.pattern.factory.entity.IPayment;
import com.dolo.pattern.factory.entity.JDPayment;
import com.dolo.pattern.factory.entity.WXPayment;

/**
 * 简单工厂模式
 * 由一个工厂对象决定创建出哪一种产品类的实例
 */
public class PaymentSimpleFactory {

    //通过动物名称创建对应的动物
    public IPayment creatPayment(String pament) throws Exception {
        if ("wx".equalsIgnoreCase(pament)) {
            return new WXPayment();
        } else if ("jd".equalsIgnoreCase(pament)) {
            return new JDPayment();
        } else {
            throw new RuntimeException("支付方式不合法！！！");
        }
    }

    //通过反射的形式创建
    public IPayment creatPayTypeByClassName(Class<? extends IPayment> clazz) throws Exception {
        if (clazz != null) {
            return clazz.newInstance();
        } else {
            throw new RuntimeException("支付方式不合法！！！");
        }

    }

}
