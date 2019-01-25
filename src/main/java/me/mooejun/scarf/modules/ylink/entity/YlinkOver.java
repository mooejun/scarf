package me.mooejun.scarf.modules.ylink.entity;

import java.util.Date;

public class YlinkOver {
    private Integer overId;

    private Integer empId;

    private Date sdatetime;

    private Date edatetime;

    private Date cdatetime;

    private Integer hours;

    private Integer holidayflag;

    public Integer getOverId() {
        return overId;
    }

    public void setOverId(Integer overId) {
        this.overId = overId;
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

    public Date getCdatetime() {
        return cdatetime;
    }

    public void setCdatetime(Date cdatetime) {
        this.cdatetime = cdatetime;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getHolidayflag() {
        return holidayflag;
    }

    public void setHolidayflag(Integer holidayflag) {
        this.holidayflag = holidayflag;
    }
}