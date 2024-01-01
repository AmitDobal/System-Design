package com.designpattern.strategy.example3;

import com.designpattern.strategy.example3.imagerenderer.renderer.*;

public class MainClient {
	public static void main(String[] args) {
		ImageManager imageManager = new ImageManager();
		
		imageManager.setRenderer(new LaptopRenderer());
		
		imageManager.show();
	}
}
