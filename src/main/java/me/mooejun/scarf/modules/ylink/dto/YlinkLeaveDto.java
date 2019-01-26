package me.mooejun.scarf.modules.ylink.dto;

import java.util.Date;

/**
 * @author mooejun
 * @since 2019-01-26
 */
public class YlinkLeaveDto {
    private Integer leaveId;

    private Integer leaveType;

    private Integer empId;

    private Date sdatetime;

    private Date edatetime;

    private Float days;

    public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
    }

    public Integer getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(Integer leaveType) {
        this.leaveType = leaveType;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Date getSdatetime() {
        return sdatetime;
    }

    public void setSdatetime(Date sdatetime) {
        this.sdatetime = sdatetime;
    }

    public Date getEdatetime() {
        return edatetime;
    }

    public void setEdatetime(Date edatetime) {
        this.edatetime = edatetime;
    }

    public Float getDays() {
        return days;
    }

    public void setDays(Float days) {
        this.days = days;
    }

    /**
     * 
     */
    public YlinkLeaveDto() {
        super();
    }

    /**
     * @param leaveId
     * @param leaveType
     * @param empId
     * @param sdatetime
     * @param edatetime
     * @param days
     */
    public YlinkLeaveDto(Integer leaveId, Integer leaveType, Integer empId, Date sdatetime, Date edatetime,
            Float days) {
        super();
        this.leaveId = leaveId;
        this.leaveType = leaveType;
        this.empId = empId;
        this.sdatetime = sdatetime;
        this.edatetime = edatetime;
        this.days = days;
    }
}
