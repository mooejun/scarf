package me.mooejun.scarf.modules.ylink.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.mooejun.scarf.modules.ylink.dao.YlinkEmpMapper;
import me.mooejun.scarf.modules.ylink.dto.YlinkEmpDto;
import me.mooejun.scarf.modules.ylink.entity.YlinkEmp;
import me.mooejun.scarf.modules.ylink.entity.YlinkEmpExample;
import me.mooejun.scarf.modules.ylink.service.EmployeeService;

/**
 * @author mooejun
 * @since 2019-01-26
 */
@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

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

    /* (non-Javadoc)
     * @see me.mooejun.scarf.modules.ylink.service.EmployeeService#findEmpList()
     */
    @Override
    public List<YlinkEmpDto> findEmpList() {
        YlinkEmpExample example = new YlinkEmpExample();
        example.createCriteria();
        List<YlinkEmp> ylinkEmps = this.ylinkEmpMapper.selectByExample(example);
        List<YlinkEmpDto> ylinkEmpDtos = new ArrayList<YlinkEmpDto>();
        for (YlinkEmp ylinkEmp : ylinkEmps) {
            ylinkEmpDtos.add(new YlinkEmpDto(ylinkEmp.getEmpNo(), ylinkEmp.getEmpName(), ylinkEmp.getEmpSex()));
        }
        return ylinkEmpDtos;
    }

}
