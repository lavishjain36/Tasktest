package com.day4;

import java.util.Scanner;

public class Substringsearch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String substr=sc.nextLine();
		
		int index=-1;//no matching string found initially
		
		//Brute force technique
		for(int i=0;i<str.length();i++) {
			
			boolean found=true;
			
			for(int j=0;j<substr.length();j++) {
				if(str.charAt(i+j)!=substr.charAt(j)) {
					//no matching character
					found=false;
					break;
				}
			}
			
			if(found) {
				index=i;//updated substring matching char. value 
				break;
			}
		}
		
		if(index!=-1) {
			System.out.println(index);
		}else {
			System.out.println("-1");
		}
		
	
	}

}
