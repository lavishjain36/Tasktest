package com.day5;

import java.util.Scanner;

public class CountSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//5
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		
		countsort(arr);
		printsorted(arr);

	}
	
	//logic
	private static void countsort(int[] arr) {
		int n=arr.length;
		//get the max
		int max = findmax(arr);
//		System.out.println(res);
		
		//create count array
		int[] count=new int[max+1];
		
		//count the freq. of every
		for(int num:arr) {
			count[num]++;
		}
		
//		for(int num:count) {
//			System.out.print(num+" ");
//		}
		
		//update count array-cummulative sum
		for(int i=1;i<=max;i++) {
			count[i]+=count[i-1];
		}
	
		//buil sorted array
		int[] res=new int[n];
		for(int i=n-1;i>=0;i--) {
			res[count[arr[i]]-1]=arr[i];
			count[arr[i]]--;
		}
		
		//copy sorted data array back->
		System.arraycopy(res, 0, arr, 0, n);
	}

	
	
	private static int findmax(int[] arr) {
		int max=arr[0];//4
		for(int num:arr) {
			if(num>max) {
				max=num;
			}
		}
		return max;
		
	}

	private static void printsorted(int[] arr) {

		for(int num:arr) {
			System.out.print(num+ " ");
		}
		System.out.println();	
	}

	

}
//Time-O(n)
//Space-O(n)

