package me.mooejun.scarf.modules.ylink.service;

import me.mooejun.scarf.modules.ylink.entity.YlinkEmp;

/**
 * @author mooejun
 * @since 2019-01-26
 */
public interface EmpService {
    public YlinkEmp getByEmpNo(String empNo);
}
