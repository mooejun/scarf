package me.mooejun.scarf.modules.ylink.dao;

import java.util.List;

import me.mooejun.scarf.common.persistence.annotation.MyBatisDao;
import me.mooejun.scarf.modules.ylink.entity.YlinkProject;
import me.mooejun.scarf.modules.ylink.entity.YlinkProjectExample;

@MyBatisDao
public interface YlinkProjectMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(YlinkProject record);

    int insertSelective(YlinkProject record);

    List<YlinkProject> selectByExample(YlinkProjectExample example);

    YlinkProject selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(YlinkProject record);

    int updateByPrimaryKey(YlinkProject record);
}