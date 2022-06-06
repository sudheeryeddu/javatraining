/**
 * 
 */
package com.arcus.javatraining;

/**
 * @author sudheeryeddu
 *
 */
public class OverloadingExample {

	/**
	 * @param args
	 */
	
	
	OverloadingExample(){
	
		System.out.println("Creating an instance from constructor");
	}
	
	
	OverloadingExample(String name){
		
		System.out.println("Printing name from constructor" + name);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * OverloadingExample myObject1 = new OverloadingExample(); OverloadingExample
		 * myObject2 = new OverloadingExample();
		 * 
		 * myObject1.doCalculateSum(10,20);
		 * 
		 * int returnedValue = myObject1.returnHundred();
		 * 
		 * System.out.println(returnedValue);
		 */
		
		
	//	OverloadingExample myInstance = new OverloadingExample();
		
		//OverloadingExample myInstance2 = new OverloadingExample("Arcus Java Training");
		
		
		
		//Print numbers from 1 to 10
		
		for (int i=1; i<11; i++) {
			
			System.out.println (i);	
			
		}
		
		
		//myInstance.doCalculateSum(20,10,30,50);
		
		
		
		
		}
	
	
	public void doCalculateSum(int firstNumber, int secondNumber) {
		
		int sum = firstNumber + secondNumber;
		System.out.println("Sum of two numbers: "+sum);
	}
	
	
	
	public void doCalculateSum(int firstNumber, int secondNumber, int thirdNumber) {
		
		int sum = firstNumber + secondNumber + thirdNumber;
		System.out.println("Sum of three numbers: "+sum);
	}
	
	
	public void doCalculateSum(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
		
		int sum = firstNumber + secondNumber + thirdNumber+ fourthNumber;
		System.out.println("Sum of four numbers: "+sum);
	}
	
	
	public int returnHundred()
	{
		return 100;
	}	
	
	
	public int returnHundred(int i)
	{
		return 100;
	}	
	
	public void printNumbers(int i, int j) {
		System.out.println("First number" +1 + "Second Number"+j);
		
	}
	
	
	
	

}
