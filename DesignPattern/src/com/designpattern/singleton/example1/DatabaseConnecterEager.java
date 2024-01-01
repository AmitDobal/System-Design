package com.designpattern.singleton.example1;

public class DatabaseConnecterEager {

	private static DatabaseConnecterEager INSTANCE = new DatabaseConnecterEager();

	private DatabaseConnecterEager() {
	}

	public static DatabaseConnecterEager getInstance() {
		return INSTANCE;
	}

	public void connect() {
		System.out.println("Connecting to the database...");
	}

	public void disconnect() {
		System.out.println("Disconnecting to the database...");
	}

}
