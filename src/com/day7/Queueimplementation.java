package com.day7;

import java.util.Scanner;

class Queue{
	
	private int[] queue;
	private int size;
	private int front;
	private int rear;
	
	//constructor
	public Queue(int size) {
		this.size=size;
		queue=new int[size];
		front=0;
		rear=-1;//before first element
	}

	//insertion of element into queue-rear
	public void enqueue(int element) {
	//queue is full
		if(rear==size-1) {
			System.out.println("Queue Overflow");
			return;
		}
		queue[++rear]=element;
		System.out.println("Enqueued: "+ element);
		
	}

	//removal of an element from quque->front
	public int dequeue() {
		if(front>rear) {
			System.out.println("Queue Undeflow");
			return -1;
		}
		System.out.println("Dequeued"+ queue[front]);
		return queue[front++];
	}

	public int peek() {
		if(front>rear) {
			System.out.println("Queue is empty..");
			return -1;
		}
		return queue[front];
	}

	public void display() {
		if(front>rear) {
			System.out.println("Queue is empty..");
			return;
		}
		for(int i=front;i<=rear;i++) {
			System.out.print(queue[i]+ " ");
		}
		System.out.println();
	}
	
 	
}

public class Queueimplementation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of queue: ");
		int size=sc.nextInt();
		Queue q=new Queue(size);	
		while(true) {
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Peek");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			
			System.out.println("Choose an operation: ");
			int choice=sc.nextInt();//1 to 5
			
			switch(choice) {
			case 1:
				System.out.print("Enter the element to enqueue");
				int element=sc.nextInt();
				q.enqueue(element);
				break;
			case 2:
				q.dequeue();
				break;
				
			case 3:
				int frontelement=q.peek();
				if(frontelement!=-1) {
					System.out.println("Front Element "+frontelement);
				}
				break;
			case 4:
				q.display();
				break;
			case 5:
				System.out.println("Exiting");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please provide choice 1 to 5.W");
			}
			
		}

	}

}
