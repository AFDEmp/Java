package com.afdemp.introduction;

import java.util.Scanner;

public class Eighth {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Type 10-digit number:  ");
		
		long digits10 = scanner.nextLong();
		int digits[]=new int[10];
		
		for(int i=digits.length-1; i>=0; i--){
			digits[i]=(int) (digits10%10);
			digits10=digits10/10;

		}
		String even="";
		String odd="";
		for	(int i=0; i<digits.length; i++){
			if ((i+1)%2==0)
				even=even+" "+digits[i];
			else
				odd=odd+digits[i]+" " ;
		}
		
		System.out.println(odd);
		System.out.println(even);
		
		scanner.close();
	}
}
