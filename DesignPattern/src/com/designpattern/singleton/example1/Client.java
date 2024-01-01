package com.designpattern.singleton.example1;

public class Client {
	public static void main(String[] args) throws InterruptedException {

		// Singleton eager initialization
		DatabaseConnecterEager instance1 = DatabaseConnecterEager.getInstance();
		DatabaseConnecterEager instance2 = DatabaseConnecterEager.getInstance();
		instance1.connect();
		instance2.connect();
		System.out.println(instance1);
		System.out.println(instance2);

		if (instance1 == instance2)
			System.out.println("Both instances are the same\n");

		// Lazy initialization

		DatabaseConnecterLazy instance3 = DatabaseConnecterLazy.getInstance();
		DatabaseConnecterLazy instance4 = DatabaseConnecterLazy.getInstance();
		instance3.connect();
		instance4.connect();
		System.out.println(instance3);
		System.out.println(instance4);

		if (instance3 == instance4)
			System.out.println("Both instances are the same\n");

		for (int i = 0; i < 10; i++) {

			Thread thread1 = new Thread(() -> {
				DatabaseConnecterLazy instance = null;
				try {
					instance = DatabaseConnecterLazy.getInstance();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 1: HashCode: " + instance.hashCode());
			});

			Thread thread2 = new Thread(() -> {
				DatabaseConnecterLazy instance = null;
				try {
					instance = DatabaseConnecterLazy.getInstance();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 2: HashCode: " + instance.hashCode());
			});
			Thread thread3 = new Thread(() -> {
				DatabaseConnecterLazy instance = null;
				try {
					instance = DatabaseConnecterLazy.getInstance();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 3: HashCode: " + instance.hashCode());
			});
			
			Thread thread4 = new Thread(() -> {
				DatabaseConnecterLazy instance = null;
				try {
					instance = DatabaseConnecterLazy.getInstance();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 4: HashCode: " + instance.hashCode());
			});

			// Start the threads
			thread1.start();
			thread2.start();
			thread3.start();
			thread4.start();
		}
	}
}
