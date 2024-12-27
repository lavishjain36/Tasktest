package com.day2;

import java.util.Scanner;

public class Stringconcept {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		String res=replacespace(str);
		System.out.println(res);
	}

	private static String replacespace(String str) {
		//edge case
		if(str==null||str.isEmpty()) {
			return str;
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(char ch:str.toCharArray()) {
			if(ch==' ') {
				sb.append("%20");
			}else {
				sb.append(ch);
			}
		}
		
		return sb.toString();
		
	}

}
