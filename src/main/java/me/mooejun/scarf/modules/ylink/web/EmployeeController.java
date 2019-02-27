package me.mooejun.scarf.modules.ylink.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import me.mooejun.scarf.common.exceptions.ScarfException;
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

    @RequestMapping(value = { "list", "" })
    public String empList(Model model) {
        List<YlinkEmpDto> ylinkEmpDtos = this.employeeService.findEmpList();
        model.addAttribute("empList", ylinkEmpDtos);
        return "modules/ylink/empList";
    }

    /**
     * 获取单个员工
     */
    @RequestMapping("/get")
    public String get(@RequestParam(required = true) String empNo, HttpServletRequest request,
            HttpServletResponse response, Model model) {
        this.logger.info("empNo=" + empNo);
        try {
            YlinkEmp ylinkEmp = this.employeeService.getByEmpNo(empNo);
            YlinkEmpDto ylinkEmpDto = new YlinkEmpDto(ylinkEmp.getEmpNo(), ylinkEmp.getEmpName(), ylinkEmp.getEmpSex());
            model.addAttribute("ylinkEmpDto", ylinkEmpDto);
            model.addAttribute("ret_code", "0000");
            model.addAttribute("ret_msg", "查询成功");
        } catch (ScarfException e) {
            model.addAttribute("ret_code", e.getCode());
            model.addAttribute("ret_msg", e.getMsg());
        }
        return "";
    }
}
