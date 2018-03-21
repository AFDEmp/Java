package com.afdemp.introduction;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int limit=5;
		double sum=0;

		for(int j=1; j<=limit; j++){
			sum=0;
			for(int i=1; i<=j; i++)
				sum=sum+1.0/i;
			System.out.println(sum);
		}
		scanner.close();
	}

}
