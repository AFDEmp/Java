package com.afdemp.introduction;

import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Validate 8-bit binary : ");
		String bits8 = scanner.next();
		char[] bits = bits8.toCharArray();	
		int sum=0;
		for (char bit : bits) {
			sum=sum+Character.getNumericValue(bit);
		}
		if(sum%2==0)
			System.out.println("Valid 8-bit");
		else 
			System.out.println("Invaid");
		scanner.close();
	}
}
