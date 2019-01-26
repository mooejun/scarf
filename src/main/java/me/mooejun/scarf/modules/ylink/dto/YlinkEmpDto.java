package me.mooejun.scarf.modules.ylink.dto;

/**
 * @author mooejun
 * @since 2019-01-26
 */
public class YlinkEmpDto {
    private String empNo;

    private String empName;

    private String empSex;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }
    
    public YlinkEmpDto() {
        super();
    }

    /**
     * @param empNo
     * @param empName
     * @param empSex
     */
    public YlinkEmpDto(String empNo, String empName, String empSex) {
        super();
        this.empNo = empNo;
        this.empName = empName;
        this.empSex = empSex;
    }
}
