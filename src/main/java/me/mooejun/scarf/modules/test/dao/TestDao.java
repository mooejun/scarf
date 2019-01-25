/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package me.mooejun.scarf.modules.test.dao;

import java.util.List;

import me.mooejun.scarf.modules.test.entity.Test;

/**
 * 测试DAO接口
 */
public interface TestDao {
	public Test get(String id);

	public List<Test> findList(Test test);

	public List<Test> findAllList(Test test);

	public int insert(Test test);

	public int update(Test test);

	public int delete(Test test);
}