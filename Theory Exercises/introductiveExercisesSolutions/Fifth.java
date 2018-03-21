package com.afdemp.introduction;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter number of pronic numbers: ");
		int limit=scanner.nextInt();
		for(int i=1; i<=limit; i++){
			System.out.print(i*(i+1)+" ");
		}
		scanner.close();

	}

}
