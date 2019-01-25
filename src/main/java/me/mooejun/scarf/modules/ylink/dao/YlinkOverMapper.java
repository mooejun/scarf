package me.mooejun.scarf.modules.ylink.dao;

import java.util.List;
import me.mooejun.scarf.modules.ylink.entity.YlinkOver;
import me.mooejun.scarf.modules.ylink.entity.YlinkOverExample;

public interface YlinkOverMapper {
    int deleteByPrimaryKey(Integer overId);

    int insert(YlinkOver record);

    int insertSelective(YlinkOver record);

    List<YlinkOver> selectByExample(YlinkOverExample example);

    YlinkOver selectByPrimaryKey(Integer overId);

    int updateByPrimaryKeySelective(YlinkOver record);

    int updateByPrimaryKey(YlinkOver record);
}