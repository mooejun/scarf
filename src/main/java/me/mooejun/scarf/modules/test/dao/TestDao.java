package me.mooejun.scarf.modules.test.dao;

import java.util.List;

import me.mooejun.scarf.common.persistence.annotation.MyBatisDao;
import me.mooejun.scarf.modules.test.entity.Test;

/**
 * 测试DAO接口
 */

@MyBatisDao
public interface TestDao {
    public Test get(String id);

    public List<Test> findList(Test test);

    public List<Test> findAllList(Test test);

    public int insert(Test test);

    public int update(Test test);

    public int delete(Test test);
}
