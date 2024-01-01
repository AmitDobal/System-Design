package com.designpattern.decorator.example1.good;

public class Client {
	public static void main(String[] args) {
		LifetimeSubscription ls = new LifetimeSubscription();//1500
		
		Assignment assignment = new Assignment(ls);//500
		JobAssistance jobAssistance = new JobAssistance(assignment);//1000
//		DoubtSession doubtSession = new DoubtSession(jobAssistance);//800
		
		double totalCost = jobAssistance.cost();
		
			System.out.println(totalCost);
	}
}
