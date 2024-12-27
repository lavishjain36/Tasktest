package com.day1;

import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();//123
		int res=getsumofdigit(num);
		System.out.println(res);

	}

	private static int getsumofdigit(int num) {
		//assume the sum as -0
		int sum=0;
		
		while(num!=0) {
			sum+=num%10;//reminder
			num=num/10;//quotient
		}
		
		return sum;
	}

}

//Time->O(n)
//Space-O(1)