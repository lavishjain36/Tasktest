//package com.day9;
//
//import java.util.Scanner;
//
////Node represent->structure
//class Node{
//	int data;//value
//	Node next;//address of the next node
//	
//	//constructor
//	Node(int data){
//		this.data=data;
//		this.next=null;	
//	}
//}
//
//
//public class DetectLoop {
//	
//	Node head;//first node in list
//	
//
//	public static void main(String[] args) {
//		DetectLoop list=new DetectLoop();
//		Scanner sc=new Scanner(System.in);
//		
//		//Menu driven
//		while(true) {
//			System.out.println("1.Insert at End.");
//			System.out.println("2.Create a loop");
//			System.out.println("3.Detect a loop");
//			System.out.println("4.Traversal or Display of List: ");
//			System.out.println("5.Exit.");
//
//			int choice=sc.nextInt();
//			
//			switch (choice) {
//			case 1:
//				System.out.println("Enter the value to insert at end.");
//				int valend=sc.nextInt();
//				list.insertAtEnd(valend);
//				break;
//			case 2:
//				System.out.println("Enter position to create a loop.");
//				int pos=sc.nextInt();
//				list.createLoop(pos);
//				break;
//				
//			case 3:
//			    list.detectLoop();
//				break;
//				
//			case 4:
//				list.display();
//				break;
//			case 5:
//				System.out.println("Exiting..");
//				System.exit(0);
//		    default:
//		    	System.out.println("Invalid Choice..Provide 1 to 5 case number..");
//			}
//
//
//
//
//	}
//
//}
//
//
//	//creating loop
//	private void createLoop(int pos) {
//		if(head==null)
//		return;
//		Node temp=head;
//		Node loopnode=null;
//		int count=1;
//		
//		while(temp.next!=null) {
//			if(count==pos) {
//				//store node in loop position
//				loopnode=temp;
//			}
//			temp=temp.next;
//			count++;
//		}
//		//create loop 
//		temp.next=loopnode;
//	}
//
////Floy's cycle algorithm->tortoise and hare
//	private boolean detectLoop() {
//		Node slow=head;
//		Node fast=head;
//		while(fast!=null&& fast.next!=null) {
//			//move slow 1 and fast by 2 steps
//			slow=slow.next;//1 step
//			fast=fast.next.next;//2 step
//			
//			//slow and fast meet at ->loop detected
//			if(slow==fast) {
//				System.out.println("Loop detected in a list");
//				return true;
//			}
//		}
//		System.out.println("No Loop detected in list");
//		return false;
//	}
//
//
//	
//
//	private void insertAtEnd(int data) {
//		Node newnode=new Node(data);//created node
//		//list is empty
//		if(head==null) {
//			head=newnode;
//			return;
//		}
//		//start from head
//		Node temp=head;
//		
//		while(temp.next!=null) {
//			temp=temp.next;
//		}
//		
//		temp.next=newnode;//a new node data inserted into last node
//		
//	}
//	
//	private void display() {
//		if(head==null) {
//			System.out.println("List is empty.");
//			return;
//		}
//		
//		Node temp=head;
//		int count=0;
//		while(temp!=null && count<20) {
//			//print the data
//			System.out.print(temp.data+ "->");
//			temp=temp.next;//move next to print the next element
//			count++;
//		}
//		System.out.println("NULL");
//		
//	}
//
//}