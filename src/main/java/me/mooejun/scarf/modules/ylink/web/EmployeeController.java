package me.mooejun.scarf.modules.ylink.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import me.mooejun.scarf.modules.ylink.entity.YlinkEmp;
import me.mooejun.scarf.modules.ylink.service.EmployeeService;

/**
 * @author mooejun
 * @since 2019-01-25
 */

@Controller
@RequestMapping(value = "${ylinkPath}/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/get")
    @ModelAttribute
    public YlinkEmp get(@RequestParam(required = false) String id) {
        return this.employeeService.get(id);
    }
}
