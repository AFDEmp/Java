package com.afdemp.introduction;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Validate VAT: ");
		String vat = scanner.next();
		char[] numbers = vat.toCharArray();

		int sum = 0;
		int position = 1;

		for(int i=numbers.length-2; i>=0; i--){
			sum=sum +Character.getNumericValue(numbers[i])*(int)Math.pow(2, position);
			position++;
		}
		sum = sum%11;
		sum = sum%10;

		if(sum==Character.getNumericValue(numbers[numbers.length-1]))
			System.out.println("correct");
		else  
			System.out.println("incorrect");

		scanner.close();

	}

}
