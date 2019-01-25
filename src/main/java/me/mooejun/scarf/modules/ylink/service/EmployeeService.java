package me.mooejun.scarf.modules.ylink.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.mooejun.scarf.modules.ylink.dao.YlinkEmpMapper;
import me.mooejun.scarf.modules.ylink.entity.YlinkEmp;
import me.mooejun.scarf.modules.ylink.entity.YlinkEmpExample;

/**
 * @author mooejun
 * @since 2019-01-25
 */
@Service
@Transactional(readOnly = true)
public class EmployeeService {

    @Autowired
    private YlinkEmpMapper ylinkEmpMapper;
    
    public YlinkEmp getByEmpNo(String empNo) {
        YlinkEmpExample example = new YlinkEmpExample();
        example.createCriteria().andEmpNoEqualTo(empNo);
        List<YlinkEmp> ylinkEmps = this.ylinkEmpMapper.selectByExample(example);
        return ylinkEmps.get(0);
    }

}
