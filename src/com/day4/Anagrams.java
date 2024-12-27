package com.day4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		if(checkanagram(str1,str2)) {
			System.out.println("Anagrams");
		}else {
			System.out.println("Not anagrams");
		}

	}

	private static boolean checkanagram(String str1, String str2) {
		//length
		if(str1.length()!=str2.length()) {
			return false;//not anagram
		}
		
		//convert string into array
		char[] array1=str1.toLowerCase().toCharArray();
		char[] array2=str2.toLowerCase().toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);

		return Arrays.equals(array1, array2);//true=
		
	}

}
