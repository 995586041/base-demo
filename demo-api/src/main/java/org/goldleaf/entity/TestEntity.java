package org.goldleaf.entity;

import lombok.Data;

@Data
public class TestEntity {
	private String name;
	private Integer age;

	public TestEntity(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
}
