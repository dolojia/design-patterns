package com.dolo.pattern.adapter.loginadapter.v2.adapters;


import com.dolo.pattern.adapter.loginadapter.ResultMsg;

public class LoginForSinaAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
