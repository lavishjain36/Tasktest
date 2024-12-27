package com.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();//5
		//method
		long res=getfactorial(num);
		System.out.println(res);

	}

	private static long getfactorial(int num) {
			long fact=1;
			for(int i=1;i<=num;i++) {
				fact=fact*i;//1*2*3*4*5->120
			}
			return fact;
	}

}
