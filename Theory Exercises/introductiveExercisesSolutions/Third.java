package com.afdemp.introduction;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double solution1,solution2;
		System.out.print("Insert a: ");
		int a= scanner.nextInt();

		System.out.print("Insert b: ");
		int b= scanner.nextInt();

		System.out.print("Insert c: ");
		int c= scanner.nextInt();

		int d=(int)Math.pow(b, 2) - 4*a*c;

		if(d>0){
			solution1= (-b + Math.sqrt(d))/(2*a);
			solution2= (-b - Math.sqrt(d))/(2*a);
			System.out.println("x1="+solution1);
			System.out.println("x2="+solution2);			
		}
		else if (d==0){
			solution1=-b/2*a;
			solution2=solution1;
			System.out.println("x1 = x2 ="+solution1);
		}
		else {
			System.out.println("No real solutions");
		}
		scanner.close();

	}

}
