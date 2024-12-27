package com.day5;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//5
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		
		bubblesort(arr);
		printsorted(arr);
	}

	private static void printsorted(int[] arr) {
		for(int num:arr) {
			System.out.print(num+ " ");
		}
		System.out.println();
	}

	//Bubble sort logic.
	private static void bubblesort(int[] arr) {
		int n=arr.length;	
		//outer -pass->n-1
		for(int i=0;i<n-1;i++) {
			boolean isswapped=false;
			//inner loop-compare adjacent element
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					//swap element logic
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isswapped=true;
				}
			}
			if(!isswapped)break;
		}
		
		
	}

}
