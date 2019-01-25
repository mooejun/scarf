package me.mooejun.scarf.modules.ylink.dao;

import java.util.List;
import me.mooejun.scarf.modules.ylink.entity.YlinkEmp;
import me.mooejun.scarf.modules.ylink.entity.YlinkEmpExample;

public interface YlinkEmpMapper {
    int deleteByPrimaryKey(Integer empId);

    int insert(YlinkEmp record);

    int insertSelective(YlinkEmp record);

    List<YlinkEmp> selectByExample(YlinkEmpExample example);

    YlinkEmp selectByPrimaryKey(Integer empId);

    int updateByPrimaryKeySelective(YlinkEmp record);

    int updateByPrimaryKey(YlinkEmp record);
}