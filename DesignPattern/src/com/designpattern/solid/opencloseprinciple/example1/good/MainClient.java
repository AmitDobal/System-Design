package com.designpattern.solid.opencloseprinciple.example1.good;

public class MainClient {
	public static void main(String[] args) {
		SortingProcessor.sort(new InsertionSortAlgorithm());
	}
}
