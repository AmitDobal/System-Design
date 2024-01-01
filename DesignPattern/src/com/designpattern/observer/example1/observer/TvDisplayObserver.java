package com.designpattern.observer.example1.observer;

import com.designpattern.observer.example1.observable.WeatherStationObservable;

public class TvDisplayObserver implements DisplayObserver {
	WeatherStationObservable observable;

	public TvDisplayObserver(WeatherStationObservable observable) {
		this.observable = observable;
	}

	@Override
	public void update() {
		System.out.println("TV Display observer: " + observable);

	}

}
