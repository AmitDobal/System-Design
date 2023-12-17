package com.designpattern.observer.example1.observable;

import com.designpattern.observer.example1.observer.DisplayObserver;

public interface WeatherStationObservable {
	public void add(DisplayObserver observer);

	public void remove(DisplayObserver observer);
	
	public void notifies();
	
	public void setTemp();
	

}
