package com.designpattern.observer.example2.observer;

import com.designpattern.observer.example2.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

	String emailId;
	StocksObservable observable;

	public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
		this.emailId = emailId;
		this.observable = observable;
	}

	@Override
	public void update() {
		sendMail(emailId, "product in stock hurry up!", observable.getStockCount());
	}

	private void sendMail(String emailId, String msg, int stockCount) {
		System.out.println("Mail sent to: " + emailId + " Message: " + msg + " product count: " + stockCount);
	}

	@Override
	public String toString() {
		return "EmailAlertObserverImpl [emailId=" + emailId + ", observable=" + observable + "]";
	}

}
