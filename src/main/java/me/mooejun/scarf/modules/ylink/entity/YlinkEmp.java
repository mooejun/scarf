package me.mooejun.scarf.modules.ylink.entity;

public class YlinkEmp {
    private Integer empId;

    private String empNo;

    private String empName;

    private String empProject;

    private String empSex;

    private Integer empLevel;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo == null ? null : empNo.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpProject() {
        return empProject;
    }

    public void setEmpProject(String empProject) {
        this.empProject = empProject == null ? null : empProject.trim();
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex == null ? null : empSex.trim();
    }

    public Integer getEmpLevel() {
        return empLevel;
    }

    public void setEmpLevel(Integer empLevel) {
        this.empLevel = empLevel;
    }
}