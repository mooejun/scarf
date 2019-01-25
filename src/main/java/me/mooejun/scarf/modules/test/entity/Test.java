package me.mooejun.scarf.modules.test.entity;

import java.io.Serializable;

/**
 * 测试Entity
 */
public class Test implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int sex;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}

}
