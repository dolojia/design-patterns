package com.dolo.pattern.pattern;

/**
 * 老板(Boss)给项目经理(Leader)下达任务
 * 项目经理会根据实际情况给每个员工派发工作任务
 * 待员工把工作任务完成之后
 * 再由项目经理汇报工作进度和结果给老板
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }

}

