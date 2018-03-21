package com.afdemp.introduction;

public class First {

	public static void main(String[] args) {
		int numbers=9;
		for(int i=1; i<=numbers; i++){
			for(int k=1; k<=numbers-i; k++)
				System.out.print("0");
			for(int j=1; j<=i; j++)
				System.out.print(i);
			System.out.println();
		}
	}
}

