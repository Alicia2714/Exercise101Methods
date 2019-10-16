package com.Exercise101Subprogramas.app;

import java.util.Scanner;

public class Subprogramas {

	public static void main(String[] args) {
		
		//Variable declaration
		int num1 =0;
		int num2 =0;
		int result = 0;
		
		//Object declaration
		Scanner input = new Scanner(System.in);
		
		System.out.print(ShowTunnedMessage("")+"Ale \n");
		
		ShowMessage();
		num1 = input.nextInt();
		
		ShowMessage();
		num2 = input.nextInt();
		
		result = AddNumbers(num1, num2);
		
		System.out.println(result);

	}
	
	public static void ShowMessage() {
		System.out.print("Input a number: ");
	}
	
	public static String ShowTunnedMessage(String message) {
		return "Hello!! "+message;
	}
	
	public static int AddNumbers(int num1, int num2) {
		return num1+num2;
	}
	
}
