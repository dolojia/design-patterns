package com.dolo.pattern.adapter.loginadapter.v1;

import com.dolo.pattern.adapter.loginadapter.v1.service.SinginForThirdService;

public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        SinginForThirdService service = new SinginForThirdService();
        service.login("dolo","123456");
        service.loginForQQ("sdfasdfasf");
        service.loginForWechat("sdfasfsa");
    }
}
