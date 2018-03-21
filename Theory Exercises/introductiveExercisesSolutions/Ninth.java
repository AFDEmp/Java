package com.afdemp.introduction;

import java.util.Scanner;

public class Ninth {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Type 9-digit number:  ");
		int digits9 = scanner.nextInt();
		int digits[]=new int[9];
		for(int i=digits.length-1; i>=0; i--){
			digits[i]=digits9%10;
			digits9=digits9/10;

		}
		int lines=3;
		String blank="";
		for	(int i=0; i<lines; i++){
			System.out.print(blank);
			for(int j=i; j<digits.length; j=j+lines)
				System.out.print(digits[j]+"  ");
			System.out.println();
			blank=blank+" ";
		}
		scanner.close();
	}

}
