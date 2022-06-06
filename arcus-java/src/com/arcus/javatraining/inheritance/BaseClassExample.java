package com.arcus.javatraining.inheritance;

public class BaseClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseClassExample myInstance = new BaseClassExample();
		
		int myNumber = myInstance.displayNumber(50);
		
		System.out.println("My Number "+ myNumber);

	}
	
	public int displayNumber(int number) {
		return number;
	}
	

}
