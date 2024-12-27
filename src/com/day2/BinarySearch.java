package com.day2;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the array size");
		int n=sc.nextInt();
		
		//create an array of size n
		int[] array=new int[n];
		
		//ask the user to enter elements
//		System.out.print("Enter the elements of the array");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();//1 3 5 7 9
		}
		

//		System.out.print("Enter the element you want to search: ");
		
		int target=sc.nextInt();//7
		
		//method 
		int res=binarysearch(array,target);
		
		if(res==-1) {
			System.out.println("-1");
		}else {
			System.out.println(res);
		}
		
	}

	private static int binarysearch(int[] array, int target) {
		int left=0;
		int right=array.length-1;
		
		while(left<=right) {
			//mid element->avoid overflow situation
			int mid=left+(right-left)/2;//0+(4)/2;//2
			
			//target is available in middle
			if(array[mid]==target) {
				return mid;
			}
			
			//if target is available in right part
			if(array[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		
		return -1;//element not exist in entire array
	}

}

//Time- 
//best->O(1)
//worst->O(log n)
//16 size of the array->4 steps
//if ->16->16/2->8/2->4/2-2/2-1

//
//Space-O(1)