package com.dolo.pattern.decorator.passport;

import com.dolo.pattern.decorator.passport.old.SigninService;
import com.dolo.pattern.decorator.passport.upgrade.ISiginForThirdService;
import com.dolo.pattern.decorator.passport.upgrade.SiginForThirdService;

/**
 * 拓展第三方登录测试（装饰器模式）
 */
public class DecoratorTest {

    public static void main(String[] args) {

        //满足一个is-a
        ISiginForThirdService siginForThirdService = new SiginForThirdService(new SigninService());
        siginForThirdService.loginForQQ("sdfasfdasfsf");
        //为某个类实现动态增加或者覆盖原有方法的情况，采用装饰器模式
    }


}
