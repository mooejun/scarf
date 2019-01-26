package me.mooejun.scarf.modules.ylink.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import me.mooejun.scarf.common.web.BaseController;
import me.mooejun.scarf.modules.ylink.dto.YlinkLeaveDto;
import me.mooejun.scarf.modules.ylink.service.LeaveService;

/**
 * @author mooejun
 * @since 2019-01-26
 */
@Controller
@RequestMapping(value = "/ylink/leave")
public class LeaveController extends BaseController {

    @Autowired
    private LeaveService leaveService;
    
    /**
     * 请假列表
     * @param request
     * @param response
     * @param model
     */
    @RequestMapping(value = { "list", "" })
    public String empList(Model model) {
        List<YlinkLeaveDto> ylinkLeaveDtos = this.leaveService.findLeaveList();
        model.addAttribute("leaveList", ylinkLeaveDtos);
        return "modules/ylink/leaveList";
    }
    
    /**
     * 请假申请
     * @param leave
     * @param model
     */
    @RequestMapping(value = {"form"})
    public String form(YlinkLeaveDto leave, Model model) {
        model.addAttribute("leave", leave);
        return "modules/ylink/leaveForm";
    }
    
    /**
     * 保存请假信息
     * @param request
     * @param response
     * @param model
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(YlinkLeaveDto ylinkLeaveDto, RedirectAttributes redirectAttributes) {
        try {
            this.leaveService.save(ylinkLeaveDto);
            addMessage(redirectAttributes, "请假信息已保存");
        } catch (Exception e) {
            logger.error("请假信息保存失败：", e);
            addMessage(redirectAttributes, "系统内部错误！");
        }
        return "redirect:/ylink/leave/form";
    }
    
}
