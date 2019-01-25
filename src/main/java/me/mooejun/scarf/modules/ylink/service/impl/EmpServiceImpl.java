package me.mooejun.scarf.modules.ylink.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.mooejun.scarf.modules.ylink.dao.YlinkEmpMapper;
import me.mooejun.scarf.modules.ylink.entity.YlinkEmp;
import me.mooejun.scarf.modules.ylink.entity.YlinkEmpExample;
import me.mooejun.scarf.modules.ylink.service.EmpService;

/**
 * @author mooejun
 * @since 2019-01-26
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private YlinkEmpMapper ylinkEmpMapper;
    
    /* (non-Javadoc)
     * @see me.mooejun.scarf.modules.ylink.service.EmpService#getByEmpNo(java.lang.String)
     */
    @Override
    public YlinkEmp getByEmpNo(String empNo) {
        YlinkEmpExample example = new YlinkEmpExample();
        example.createCriteria().andEmpNoEqualTo(empNo);
        List<YlinkEmp> ylinkEmps = this.ylinkEmpMapper.selectByExample(example);
        return ylinkEmps.get(0);
    }

}
