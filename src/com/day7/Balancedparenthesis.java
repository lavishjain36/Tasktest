package com.day7;

import java.util.Scanner;
import java.util.Stack;

public class Balancedparenthesis {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		//read a input->string
		String expr=sc.nextLine();//[{}]
		
		if(checkbalanced(expr)) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanaced");
		}

	}

	private static boolean checkbalanced(String expr) {
	Stack<Character> st=new Stack<>();
	
	//traverse through the string
	for(char ch:expr.toCharArray())
		//push the character every opening bracket
		if(ch=='('||ch=='{'||ch=='[') {
			st.push(ch);
		}
		//check-closing 
		else if(ch==')'||ch=='}'|| ch==']') {
			if(st.isEmpty()) {
				return false;
			}
			
			char top=st.pop();
			if((ch==')'&& top!='('||
			   ch=='}'&& top!='{'||
			   ch==']'&& top!='[')){
				   return false;//no matching
			   }
		}
		
	return st.isEmpty();//balanced parenthesis
	}

}
