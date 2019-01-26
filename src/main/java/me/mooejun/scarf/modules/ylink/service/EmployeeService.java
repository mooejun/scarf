package me.mooejun.scarf.modules.ylink.service;

import java.util.List;

import me.mooejun.scarf.modules.ylink.dto.YlinkEmpDto;
import me.mooejun.scarf.modules.ylink.entity.YlinkEmp;

/**
 * @author mooejun
 * @since 2019-01-25
 */
public interface EmployeeService {

    public YlinkEmp getByEmpNo(String empNo);
    
    public List<YlinkEmpDto> findEmpList();
}
