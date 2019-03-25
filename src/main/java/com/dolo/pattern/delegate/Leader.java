package com.dolo.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * 接受boss委派任务，分发给员工执行
 */
public class Leader implements IEmployee {

    private Map<String,IEmployee> targets = new HashMap<String,IEmployee>();

    public Leader() {
        targets.put("加密",new EmployeeA());
        targets.put("登录",new EmployeeB());
    }

    //项目经理自己不干活
    public void doing(String command){
        targets.get(command).doing(command);
    }

}
