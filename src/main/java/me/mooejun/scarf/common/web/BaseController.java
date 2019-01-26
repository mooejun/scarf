package me.mooejun.scarf.common.web;

import org.springframework.beans.factory.annotation.Value;

/**
 * 控制器支持类
 */
public abstract class BaseController {

	/**
	 * 后台管理基础路径
	 */
	@Value("${adminPath}")
	protected String adminPath;

	/**
	 * 前端基础路径
	 */
	@Value("${frontPath}")
	protected String frontPath;

	/**
	 * 前端URL后缀
	 */
	@Value("${urlSuffix}")
	protected String urlSuffix;

}
