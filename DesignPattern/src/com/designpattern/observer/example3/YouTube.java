package com.designpattern.observer.example3;

import com.designpattern.observer.example3.observer.MaleSubscriber;
import com.designpattern.observer.example3.observer.Subscriber;
import com.designpattern.observer.example3.subject.BhuvanBam;
import com.designpattern.observer.example3.subject.YouTuber;

public class YouTube {
	public static void main(String[] args) throws InterruptedException {
		YouTuber youTuber = new BhuvanBam();
		
		Subscriber subscriber1 = new MaleSubscriber(youTuber);
		Subscriber subscriber2 = new MaleSubscriber(youTuber);
		Subscriber subscriber3 = new MaleSubscriber(youTuber);
		Subscriber subscriber4= new MaleSubscriber(youTuber);
		
		//2 user subscribed
		youTuber.subscribe(subscriber1);
		youTuber.subscribe(subscriber3);
		//Video posted
		youTuber.newVideoAdded();
		
		
		//One user unsubscribed
		youTuber.unsubscribe(subscriber1);
		
		Thread.sleep(2000);
		//New Video posted
		youTuber.newVideoAdded();
		
		
		//New users subscribed 
		youTuber.subscribe(subscriber4);
		youTuber.subscribe(subscriber2);
		Thread.sleep(5000);
		youTuber.newVideoAdded();
		
	}
}
