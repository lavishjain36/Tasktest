package com.day5;

import java.util.Scanner;

public class DutchNationalFlagsorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//5
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		
		dutchflagsorting(arr);
		printsorted(arr);
	}

	private static void printsorted(int[] arr) {
		for(int num:arr) {
			System.out.print(num+ " ");
		}
		System.out.println();
	}

	private static void dutchflagsorting(int[] arr) {
		int low=0,mid=0,high=arr.length-1;
		while(mid<=high) {
			switch (arr[mid]) {
			case 0:
				//swap arr[low] and arr[mid
			    swap(arr,low,mid);
			    low++;
			    mid++;
			    break;
			case 1:
				mid++;
				break;
			case 2:
			    swap(arr,mid,high);
			    high--;
			    break;	    	
		}
	}

}

	private static void swap(int[] arr, int x, int y) {	
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}

}

//spac-O(1)
//Time-O(n)