package com.afdemp.introduction;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.println("Enter number of 50 euro banknotes:");
		int fifties=scanner.nextInt();

		System.out.println("Enter number of 20 euro banknotes:");
		int twenties=scanner.nextInt();		

		System.out.println("Enter number of 10 euro banknotes:");
		int tens=scanner.nextInt();

		System.out.println("Enter number of 5 euro banknotes:");
		int fives=scanner.nextInt();

		System.out.println("Enter number of 2 euro coins:");
		int twos=scanner.nextInt();

		System.out.println("Enter number of 1 euro coins:");
		int ones=scanner.nextInt();

		int sum=fifties*50 + twenties*20 + tens*10 + fives*5 + twos*2 + ones*1;
		System.out.println("You have "+sum +" euros");
		scanner.close();
	}


}
