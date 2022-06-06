package com.arcus.javatraining.exceptions;

import java.util.Scanner;

class CustomizedExceptionDemo
{
public static void main(String[] args){
	
	try (Scanner myObj = new Scanner(System.in)) {
		System.out.println("Enter age: ");

		int age  = Integer.parseInt(myObj.nextLine());  // Read user input	
//int age=Integer.parseInt(args[0]);
if(age>60)
{
	throw new TooOldException("u r age already crossed....no chance of getting married");
}
else if(age<18)
{
	throw new TooYoungException("please wait some more time.... u will get best match");

}
else
{
System.out.println("you will get match details soon by e-mail");
}
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}}
