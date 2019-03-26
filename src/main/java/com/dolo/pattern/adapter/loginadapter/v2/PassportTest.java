package com.dolo.pattern.adapter.loginadapter.v2;

/**
 * 测试适配器
 * 适配第三方登录场景
 */
public class PassportTest {

    public static void main(String[] args) {

        IPassportForThird passportForThird = new PassportForThirdAdapter();

        passportForThird.loginForQQ("");


    }

}
