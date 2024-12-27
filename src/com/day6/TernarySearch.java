package com.day6;

import java.util.Scanner;

public class TernarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//10
		
		int[] arr=new int[n];//storage in -heap 
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		//element that you want to search
		int target=sc.nextInt();
		
	int res=ternarysearch(arr,0,n-1,target);

	if(res!=-1) {
		System.out.println(res);
	}else {
		System.out.println("-1");
	}
	}
   //Ternary search
	private static int ternarysearch(int[] arr, int low, int high, int target) {
		while(low<=high) {
			//calculate 2 mid1 and mid2-
			int mid1=low+(high-low)/3;
			int mid2=high-(high-low)/3;
			
			if(arr[mid1]==target) {
				return mid1;
			}
			if(arr[mid2]==target) {
				return mid2;
			}
			
			if(target<arr[mid1]) {
				high=mid1-1;//left-[low,mid1-1]
			}else if(target>arr[mid2]) {
				low=mid2+1;//[mid2+1,high]//right
			}else {
				low=mid1+1;
				high=mid2-1;//search in middle of -
			}
		}
		return -1;//element target not exist
		
	}

}
