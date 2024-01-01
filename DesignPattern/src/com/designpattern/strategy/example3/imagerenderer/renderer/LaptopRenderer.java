package com.designpattern.strategy.example3.imagerenderer.renderer;

import com.designpattern.strategy.example3.imagerenderer.startegy.RendererStrategy;

public class LaptopRenderer implements RendererStrategy {

	@Override
	public void showImage() {
		System.out.println("Showing an image on laptop...");
	}

}
