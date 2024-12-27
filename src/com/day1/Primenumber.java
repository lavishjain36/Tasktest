package com.day1;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(checkprime(num)) {
			System.out.println(num+" is a prime");
		}else {
			System.out.println(num+" is not a prime");
		}
	}

	private static boolean checkprime(int num) {
		if(num<=1) {
			return false;//not prime 
		}
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			//no has more than 1 factor
			if(num%i==0) {
				return false;//not prime
			}
		}
		
		return true;//prime number
	}

}


	
