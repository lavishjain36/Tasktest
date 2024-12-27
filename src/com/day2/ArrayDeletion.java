package com.day2;

import java.util.Scanner;

public class ArrayDeletion {

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
		int pos=sc.nextInt();//2
		
		//check for valid position
		if(pos<0||pos>=n) {
			System.out.println("Invalid position");
		}else {
			//shift element to left
			for(int i=pos;i<n-1;i++) {
		    array[i]=array[i+1];
			}
		}
		for(int i=0;i<n-1;i++) {
			System.out.print(array[i]+ " ");	
		}
		
	}

}
