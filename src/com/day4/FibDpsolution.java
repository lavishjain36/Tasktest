package com.day4;

import java.util.Scanner;

public class FibDpsolution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();//5
		
		//array to store fibonacci series
		int[] fib=new int[num+1];
		
		
		//base case
		fib[0]=0;
		fib[1]=1;
		
		int i;
		//fill->all next level using result of
		for(i=2;i<=num;i++) {
			fib[i]=fib[i-1]+fib[i-2];//dp solution
			System.out.println(fib[i]);
		}
		
		System.out.println(fib[num]);

	}

}
