package com.day1;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		String str=sc.nextLine();//space b/w string
		int res=countvowels(str);
		System.out.println(res);//3
		sc.close();
	}

	private static int countvowels(String str) {
		int count=0;
		str=str.toLowerCase();//hello world
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);//he
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count=count+1;//3
			}
		}
		
		return count;//3
	}

}
