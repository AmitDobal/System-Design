package com.designpattern.observer.example2;

import com.designpattern.observer.example2.observable.IPhoneObservableImpl;
import com.designpattern.observer.example2.observable.StocksObservable;
import com.designpattern.observer.example2.observer.EmailAlertObserverImpl;
import com.designpattern.observer.example2.observer.MobileAlertObserverImpl;
import com.designpattern.observer.example2.observer.NotificationAlertObserver;

public class Store {
	
	public static void main(String[] args) {
		StocksObservable iphoneStocksObservable = new IPhoneObservableImpl();
		
		NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStocksObservable);
		NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStocksObservable);
		NotificationAlertObserver observer3 = new MobileAlertObserverImpl("uvw_username", iphoneStocksObservable);
		
		iphoneStocksObservable.add(observer1);
		iphoneStocksObservable.add(observer2);
		iphoneStocksObservable.add(observer3);
		
		iphoneStocksObservable.setStockCount(10);
//		iphoneStocksObservable.setStockCount(-10);
//		iphoneStocksObservable.setStockCount(100);
	}

}
