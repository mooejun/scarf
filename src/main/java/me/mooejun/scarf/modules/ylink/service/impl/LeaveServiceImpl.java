package me.mooejun.scarf.modules.ylink.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.mooejun.scarf.modules.ylink.dao.YlinkLeaveMapper;
import me.mooejun.scarf.modules.ylink.dto.YlinkLeaveDto;
import me.mooejun.scarf.modules.ylink.entity.YlinkLeave;
import me.mooejun.scarf.modules.ylink.entity.YlinkLeaveExample;
import me.mooejun.scarf.modules.ylink.service.LeaveService;

/**
 * @author mooejun
 * @since 2019-01-26
 */
@Service
@Transactional(readOnly = true)
public class LeaveServiceImpl implements LeaveService {

    @Autowired
    private YlinkLeaveMapper ylinkLeaveMapper;

    /* (non-Javadoc)
     * @see me.mooejun.scarf.modules.ylink.service.LeaveService#save(me.mooejun.scarf.modules.ylink.dto.YlinkLeaveDto)
     */
    @Override
    public int save(YlinkLeaveDto ylinkLeaveDto) {
        YlinkLeave ylinkLeave = new YlinkLeave(ylinkLeaveDto.getLeaveId(), ylinkLeaveDto.getLeaveType(),
                ylinkLeaveDto.getEmpId(), ylinkLeaveDto.getSdatetime(), ylinkLeaveDto.getEdatetime(),
                ylinkLeaveDto.getDays());
        return this.ylinkLeaveMapper.insert(ylinkLeave);
    }

    /* (non-Javadoc)
     * @see me.mooejun.scarf.modules.ylink.service.LeaveService#findLeaveList()
     */
    @Override
    public List<YlinkLeaveDto> findLeaveList() {
        YlinkLeaveExample example = new YlinkLeaveExample();
        example.createCriteria();
        List<YlinkLeave> ylinkLeaves = this.ylinkLeaveMapper.selectByExample(example);
        List<YlinkLeaveDto> ylinkEmpDtos = new ArrayList<YlinkLeaveDto>();
        for (YlinkLeave ylinkLeave : ylinkLeaves) {
            ylinkEmpDtos.add(new YlinkLeaveDto(ylinkLeave.getLeaveId(), ylinkLeave.getLeaveType(),
                    ylinkLeave.getEmpId(), ylinkLeave.getSdatetime(), ylinkLeave.getEdatetime(), ylinkLeave.getDays()));
        }
        return ylinkEmpDtos;
    }


}
