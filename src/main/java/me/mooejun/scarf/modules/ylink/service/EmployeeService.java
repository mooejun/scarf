package me.mooejun.scarf.modules.ylink.service;

import me.mooejun.scarf.modules.ylink.entity.YlinkEmp;

/**
 * @author mooejun
 * @since 2019-01-25
 */
public interface EmployeeService {
    public YlinkEmp get(String empId);
}
