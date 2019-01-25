package me.mooejun.scarf.modules.test.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.mooejun.scarf.modules.test.dao.TestDao;
import me.mooejun.scarf.modules.test.entity.Test;

/**
 * 测试Service
 */
@Service
@Transactional(readOnly = true)
public class TestService implements TestDao {
	/**
	 * 日志对象
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private TestDao testDao;

	@Override
	public Test get(String id) {
		return testDao.get(id);
	}

	@Override
	public List<Test> findList(Test test) {
		return testDao.findList(test);
	}

	@Override
	public List<Test> findAllList(Test test) {
		return testDao.findAllList(test);
	}

	@Override
	public int insert(Test test) {
		return testDao.insert(test);
	}

	@Override
	public int update(Test test) {
		return testDao.update(test);
	}

	@Override
	public int delete(Test test) {
		return testDao.delete(test);
	}

}
