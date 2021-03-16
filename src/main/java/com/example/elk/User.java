package com.example.elk;


public class User {

    public User(int i, String string) {
		this.id=i;
		this.name=string;
	}
	public User() {
	}
	private int id;
    private String name;
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
    
    
}
