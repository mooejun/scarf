package me.mooejun.scarf.modules.ylink.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import me.mooejun.scarf.common.web.BaseController;
import me.mooejun.scarf.modules.ylink.dto.YlinkEmpDto;
import me.mooejun.scarf.modules.ylink.entity.YlinkEmp;
import me.mooejun.scarf.modules.ylink.service.EmployeeService;

/**
 * @author mooejun
 * @since 2019-01-25
 */

@Controller
@RequestMapping(value = "/ylink/emp")
public class EmployeeController extends BaseController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/get")
    public YlinkEmpDto get(@RequestParam(required = true) String empNo, HttpServletRequest request,
            HttpServletResponse response, Model model) {
        this.logger.info("empNo=" + empNo);
        YlinkEmp ylinkEmp = this.employeeService.getByEmpNo(empNo);
        YlinkEmpDto ylinkEmpDto = new YlinkEmpDto(ylinkEmp.getEmpNo(), ylinkEmp.getEmpName(), ylinkEmp.getEmpSex());
        model.addAttribute("ylinkEmpDto", ylinkEmpDto);
        return ylinkEmpDto;
    }

    @RequestMapping("/empList")
    public String empList(HttpServletRequest request, HttpServletResponse response, Model model) {
        List<YlinkEmpDto> ylinkEmpDtos = this.employeeService.findEmpList();
        model.addAttribute("ylinkEmpList", ylinkEmpDtos);
        return "modules/ylink/ylinkEmpList";
    }
}
