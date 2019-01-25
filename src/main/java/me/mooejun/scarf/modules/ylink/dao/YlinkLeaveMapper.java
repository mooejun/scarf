package me.mooejun.scarf.modules.ylink.dao;

import java.util.List;
import me.mooejun.scarf.modules.ylink.entity.YlinkLeave;
import me.mooejun.scarf.modules.ylink.entity.YlinkLeaveExample;

public interface YlinkLeaveMapper {
    int deleteByPrimaryKey(Integer leaveId);

    int insert(YlinkLeave record);

    int insertSelective(YlinkLeave record);

    List<YlinkLeave> selectByExample(YlinkLeaveExample example);

    YlinkLeave selectByPrimaryKey(Integer leaveId);

    int updateByPrimaryKeySelective(YlinkLeave record);

    int updateByPrimaryKey(YlinkLeave record);
}