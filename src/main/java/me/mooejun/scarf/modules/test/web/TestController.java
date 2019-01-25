package me.mooejun.scarf.modules.test.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import me.mooejun.common.web.BaseController;
import me.mooejun.scarf.modules.test.entity.Test;
import me.mooejun.scarf.modules.test.service.TestService;

@Controller
@RequestMapping(value = "${adminPath}/test")
public class TestController extends BaseController {

	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private TestService testService;

	@RequestMapping("/test001")
	public String test001(@RequestParam(required = false) String id) {
		this.logger.info("id=" + id);
		return "index";
	}

	@RequestMapping("/get")
	public String get(@RequestParam(required = true) String id) {
		this.logger.info("id=" + id);
		Test test = this.testService.get(id);
		this.logger.info("test=" + test);
		return "index";
	}

	@RequestMapping("/findList")
	public String findList(@RequestParam(required = false) String name) {
		this.logger.info("name=" + name);
		Test test = new Test();
		test.setName(name);
		List<Test> tests = this.testService.findList(test);
		this.logger.info("tests=" + tests);
		return "index";
	}

	@RequestMapping("/findAllList")
	public String findAllList() {
		List<Test> tests = this.testService.findAllList(null);
		this.logger.info("tests=" + tests);
		return "index";
	}
}