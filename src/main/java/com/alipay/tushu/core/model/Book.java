package com.alipay.tushu.core.model;

public class Book {
	private String name;
	private String publish;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	@Override
	public String toString() {
		return "book name" + name;
	}
}
