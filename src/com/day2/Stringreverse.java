package com.day2;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res=stringreverse(str);
		System.out.println(res);
	}

	private static String stringreverse(String str) {
		String rev="";
		//starting from end of the string to first character of the string
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	}

}
