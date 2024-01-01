package com.designpattern.singleton.example1;

public class DatabaseConnecterLazy {

	private static DatabaseConnecterLazy INSTANCE;

	private DatabaseConnecterLazy() {
	}

	public static DatabaseConnecterLazy getInstance() throws InterruptedException {
		if (INSTANCE == null) {
			synchronized (DatabaseConnecterLazy.class) {
				if (INSTANCE == null) {
					INSTANCE = new DatabaseConnecterLazy();
				}
			}
		}
		return INSTANCE;
	}

	public void connect() {
		System.out.println("Connecting to the database...");
	}

	public void disconnect() {
		System.out.println("Disconnecting to the database...");
	}

}
