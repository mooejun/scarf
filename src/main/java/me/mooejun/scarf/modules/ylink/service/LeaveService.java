package me.mooejun.scarf.modules.ylink.service;

import java.util.List;

import me.mooejun.scarf.modules.ylink.dto.YlinkLeaveDto;

/**
 * @author mooejun
 * @since 2019-01-26
 */
public interface LeaveService {

    public int save(YlinkLeaveDto ylinkLeaveDto);

    public List<YlinkLeaveDto> findLeaveList();
}
