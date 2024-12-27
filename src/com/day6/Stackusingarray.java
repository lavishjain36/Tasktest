package com.day6;

import java.util.Scanner;

class Stack{
	
	private int[] stack;
	private int size;
	private int top;
	
	public Stack(int size) {
		this.size=size;
		stack=new int[size];
		top=-1;
	}

	public void push(int element) {
		if(top==size-1) {
			System.out.println("Stack Overflow...");
			return;
		}
		
		stack[++top]=element;
		System.out.println(element);
	}

	public int pop() {
		
		if(top==-1) {
			System.out.println("Stack Underflow");
			return -1;
		}
		System.out.println("Popped: "+stack[top]);
		return stack[top--];
	}

	//view top element
	public int peek() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return -1;
		}
		return stack[top];
	
	}

	public void display() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return;
		}
		for(int i=0;i<=top;i++) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
		
	}
}

public class Stackusingarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();//size of stack
		Stack st=new Stack(size);
		
		while(true) {
			System.out.println("1.push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			
			System.out.print("Choose an operation : ");

			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter an element to push: ");
				int element=sc.nextInt();
				st.push(element);
				break;
			
			case 2:
				st.pop();
				break;
				
			case 3:
				int topelem=st.peek();
				if(topelem!=-1) {
					System.out.println("Top Element "+topelem);
				}
				break;
				
			case 4:
				st.display();
				break;
				
			case 5:
				System.out.println("Exiting...");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Provide choice from 1 to 5");
			}
			
			
		}

	}

}
