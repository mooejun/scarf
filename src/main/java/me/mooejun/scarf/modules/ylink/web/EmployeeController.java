package me.mooejun.scarf.modules.ylink.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import me.mooejun.scarf.modules.ylink.entity.YlinkEmp;
import me.mooejun.scarf.modules.ylink.service.EmpService;
import me.mooejun.scarf.modules.ylink.service.EmployeeService;

/**
 * @author mooejun
 * @since 2019-01-25
 */

@Controller
// @RequestMapping(value = "${ylinkPath}/emp")
@RequestMapping(value = "/ylink/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmpService empService;

    @RequestMapping("/get")
    public YlinkEmp get(@RequestParam(required = true) String empNo) {
        return this.employeeService.getByEmpNo(empNo);
    }
    
    @RequestMapping("/get2")
    public YlinkEmp get2(@RequestParam(required = true) String empNo) {
        return this.empService.getByEmpNo(empNo);
    }
}
