package com.day5;

import java.util.Scanner;

public class Selectionsort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//5
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		
		selectionsort(arr);
		printsorted(arr);
	}
	
	//logic

	private static void selectionsort(int[] arr) {
		int n=arr.length;
		//outer-pass-n-1
		for(int i=0;i<n-1;i++) {
			int minindex=i;//assume the element at 0 th index 
			
			//inner loop-> minimum element
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minindex]) {
					minindex=j;
				}
			}
			
			//swap logic
//			swap min-first element 
			int temp=arr[minindex];
			arr[minindex]=arr[i];
			arr[i]=temp;
		}
		
		
	}

	private static void printsorted(int[] arr) {
		for(int num:arr) {
			System.out.print(num+ " ");
		}
		System.out.println();
		
	}

}


//Time complexity
//Best -
//Worst-
//
//Space complexity->
//O(1)