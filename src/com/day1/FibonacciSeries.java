package com.day1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();//7
		
		printfibonacci(num);

	}

	private static void printfibonacci(int num) {
		//logic 
		int ft=0,st=1;
		
		for(int i=1;i<=num;i++) {
			System.out.print(ft+ " ");
			//calculate next term
			int next=ft+st;//addition of previous-1 unit
			ft=st;//1unit
			st=next;//1unit
		}
		
	}

}

//time-O(n)
//space-O(1)