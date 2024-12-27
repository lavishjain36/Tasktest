package com.day2;

import java.util.Scanner;

public class Removeduplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		//create an array of size n
		int[] array=new int[n];//heap memory
		
		//ask the user to enter elements
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();//1 1 2 2 3 4
			
		}

		int unique=removeduplicates(array,n);//6
		
		for(int i=0;i<unique;i++) {
			System.out.print(array[i]+ " ");
		}
	}

	private static int removeduplicates(int[] array, int n) {
		//base case-if the size of array 0 or 1->no duplicate possible
		if(n==0||n==1) {
			return n;
		}
		//index to store position of next unique element
		int j=0;
		
		for(int i=0;i<n-1;i++) {
			if(array[i]!=array[i+1]) {
				//shifht element from arr[i] to arr[j]
				array[j++]=array[i];
			}
		}
		//store last element in array as it was not check in loop
		array[j++]=array[n-1];
		
		return j;
		
	}

}
