package com.javaex.ex04;

public class User {
	
	protected String id; //아이디
	protected String password; //패스워드
	protected String name; //이름
	
	public User() {
		super();
	}

	public User(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	
	public void showInfo() {
		System.out.println("#아이디:" + id + ", 패스워드:" + password + ", 이름:" + name );
	}
	
	
	
	
}
