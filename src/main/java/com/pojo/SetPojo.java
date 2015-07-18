package com.pojo;

import java.io.Serializable;

public class SetPojo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6378783657907151276L;

	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SetPojo [name=" + name + ", age=" + age + "]";
	}

	public SetPojo(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public SetPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
