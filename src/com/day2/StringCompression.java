package com.day2;

import java.util.Scanner;

public class StringCompression {

	//String Compression Algorithm->Haffman coding algorithm
//	KMP
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res=stringcompression(str);
		System.out.println(res);
	}

	private static String stringcompression(String str) {
		String res="";
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(i<str.length()-1&& str.charAt(i)==str.charAt(i+1)) {
				count=count+1;//increment
			}else {
				res+=str.charAt(i);
				if(count>1) {
					res+=count;
				}
				count=1;
			}
			
		}
		return res;
	}

}
