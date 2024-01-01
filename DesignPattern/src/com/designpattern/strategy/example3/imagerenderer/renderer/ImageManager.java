package com.designpattern.strategy.example3.imagerenderer.renderer;

import com.designpattern.strategy.example3.imagerenderer.startegy.RendererStrategy;

public class ImageManager {

	private RendererStrategy rendererStrategy;
	
	public void setRenderer(RendererStrategy rendererStrategy) {
		this.rendererStrategy= rendererStrategy;
	}
	
	public void show() {
		this.rendererStrategy.showImage();
	}
	
}
