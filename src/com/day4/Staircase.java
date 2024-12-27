package com.day4;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//no of steps
		
		int res=countways(n);
		System.out.println("Number of ways to climb staicase: "+ res);
		

	}

	private static int countways(int n) {
		//if there 0 or 1 steps ,->
		if(n==0||n==1) {
			return 1;
		}
		
		//create an array to reach and count n ways
		int[] ways=new int[n+1];
		
		//base case
		ways[0]=1;//ground 
		ways[1]=1;//1 way to climb 1 step
		
		//dp programming
		for(int i=2;i<=n;i++) {
			ways[i]=ways[i-1]+ways[i-2];
		}
			
//		reach n steps
		return ways[n];
	}

}
