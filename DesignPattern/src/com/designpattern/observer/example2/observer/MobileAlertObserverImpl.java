package com.designpattern.observer.example2.observer;

import com.designpattern.observer.example2.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

	String userName;
	StocksObservable observable;

	public MobileAlertObserverImpl(String userName, StocksObservable observable) {
		this.userName = userName;
		this.observable = observable;
	}

	@Override
	public void update() {
		sendMail(userName, "product in stock hurry up!", observable.getStockCount());
	}

	private void sendMail(String userName, String msg, int stockCount) {
		System.out.println("Msg sent to: " + userName + " Message: " + msg + " product count: " + stockCount);
	}

	@Override
	public String toString() {
		return "MobileAlertObserverImpl [userName=" + userName + ", observable=" + observable + "]";
	}

}
