package com.day2;

import java.util.Scanner;

public class ArraysComptabile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		//create an array of size n
		int[] array1=new int[n];//heap memory
		int[] array2=new int[n];//heap memory

		//ask the user to enter first array elements
		for(int i=0;i<n;i++) {
			array1[i]=sc.nextInt();//1 1 2 2 3 4
			
		}
		
		for(int i=0;i<n;i++) {
			array2[i]=sc.nextInt();//1 1 2 2 3 4
			
		}
		
		//check comptability
	boolean res=	areArrayscompatible(array1,array2);
	
	if(res) {
		System.out.println("Comptabile");
	}else {
		System.out.println("Not Compatible.");
	}

	}

	private static boolean areArrayscompatible(int[] arr1, int[] arr2) {
		
		if(arr1.length!=arr2.length) {
			return false;
		}
		//checking Not compatible.
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]<arr2[i]) {
				return false;
			}
		}
		
		return true;
	}

}


//Time-O(n)
//Space-O(1)
