package com.milkyway.objects;

public class Sun extends Star {

	private Sun() {
		super("Sun", 696342, 1.989e30, "G-type");
	}
	
	@Override
	public void displayInfo() {
		String ANSI_YELLOW = "\u001B[33m";
		String ANSI_RESET = "\u001B[0m";
		System.out.println(ANSI_YELLOW + "The sun is always yellow" + ANSI_RESET);
		super.displayInfo();
	}
	
	private static Sun instance = new Sun();
	
	public static Sun getInstance() {
		return instance;
	}
}
