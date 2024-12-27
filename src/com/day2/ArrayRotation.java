package com.day2;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		//create an array of size n
		int[] array=new int[n];//heap memory
		
		//ask the user to enter elements
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();//1 2 3 4 5 6
			
		}
		
		//No of the position we need to rotate an array
		int k=sc.nextInt();//2
		
		rotatearray(array,k);
			
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+ " ");
		}
		
	}

	private static void rotatearray(int[] array, int k) {
		int n=array.length;
		// k value larger than size of the array
		k=k%n;//8%5->2
		//reverse the first k elements->Recursion 
		reverse(array,0,k-1);////2 1 3 4 5 6
		reverse(array,k,n-1);//2 1 6 5 4 3
		reverse(array,0,n-1);//3 4 5 6 1 2
	}

	//reverse the array->swapping 3 variable
	private static void reverse(int[] arr, int start, int end) {
		while(start<end) {
			//swap the 
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}

}
