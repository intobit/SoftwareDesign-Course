package org.se.lab;

public class Bean extends Subject {

	private int id;
	private String name;
	public Bean(int id, String name) {
		setId(id);
		setName(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		notifyObservers();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		notifyObservers();
	}
}
