package me.mooejun.scarf.modules.ylink.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.mooejun.scarf.modules.ylink.dao.YlinkEmpMapper;
import me.mooejun.scarf.modules.ylink.entity.YlinkEmp;
import me.mooejun.scarf.modules.ylink.service.EmployeeService;

/**
 * @author mooejun
 * @since 2019-01-25
 */

@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private YlinkEmpMapper ylinkEmpMapper;
    
    /* (non-Javadoc)
     * @see me.mooejun.scarf.modules.ylink.service.EmployeeService#get()
     */
    @Override
    public YlinkEmp get(String empId) {
        return this.ylinkEmpMapper.selectByPrimaryKey(Integer.valueOf(empId));
    }

}
