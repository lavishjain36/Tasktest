package com.day8;

import java.util.Scanner;

//Node represent->structure
class Node{
	int data;//value
	Node next;//address of the next node
	
	//constructor
	Node(int data){
		this.data=data;
		this.next=null;	
	}
}
public class SinglyLinkedlist {
	
	Node head;//point to first node in list

	public static void main(String[] args) {
		SinglyLinkedlist list=new SinglyLinkedlist();
		Scanner sc=new Scanner(System.in);
		
		//Menu driven
		while(true) {
			System.out.println("1.Insert at beginning..");
			System.out.println("2.Insert at end");
			System.out.println("3.Delete an Node");
			System.out.println("4.Traversal or Display of List: ");
			System.out.println("5.Exit.");

			int choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter the value to insert at the beginning..");
				int valbeg=sc.nextInt();
				list.insertatbegin(valbeg);
				break;
			case 2:
				System.out.println("Enter the value to insert at the end.");
				int valend=sc.nextInt();
				list.insertatEnd(valend);
				break;
				
			case 3:
				System.out.println("Enter the value to delete.");
				int valdel=sc.nextInt();
				list.deleteNode(valdel);
				break;
				
			case 4:
				list.display();
				break;
			case 5:
				System.out.println("Exiting..");
				System.exit(0);
		    default:
		    	System.out.println("Invalid Choice..Provide 1 to 5 case number..");
			}



		}

	}


	
	private void insertatbegin(int data) {
		Node newnode=new Node(data);//created node
		newnode.next=head;
		head=newnode;//update head to point to newnode->first node now
	}
	
	//Insert at the end 
	private void insertatEnd(int data) {
		Node newnode=new Node(data);//created node
		//list is empty
		if(head==null) {
			head=newnode;
			return;
		}
		//start from head
		Node temp=head;
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		temp.next=newnode;//a new node data inserted into last node
		
	}
	
	private void deleteNode(int key) {
		//if the list is empty
		if(head==null) {
			System.out.println("List is empty.");
			return;
		}
		
		//if the head node contains any key to delete 
		if(head.data==key) {
			head=head.next;
			return;
		}
		
		//deletion
		Node temp=head;
		//traverse untill 
		while(temp.next!=null&& temp.next.data!=key) {
			temp=temp.next;
		}
		
		if(temp.next==null) {
			System.out.println("Node not found.");
		}else {
			temp.next=temp.next.next;//skip 20 data node to delete that
		}
		
		
	}
	private void display() {
		if(head==null) {
			System.out.println("List is empty.");
			return;
		}
		
		Node temp=head;
		while(temp!=null) {
			//print the data
			System.out.print(temp.data+ "->");
			temp=temp.next;//move next to print the next element
		}
		System.out.println("NULL");
		
	}

}
