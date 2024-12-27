package com.day6;

import java.util.LinkedList;
import java.util.Scanner;

public class HashTable {
	
	private static final int SIZE=7;//hash table size
	LinkedList<Integer>[] table;
	
  //constructor to initialize the data
	public HashTable() {
		table=new LinkedList[SIZE];
		for(int i=0;i<SIZE;i++) {
			table[i]=new LinkedList<>();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashTable ht=new HashTable();
		
		//insert an element ->
		int n=sc.nextInt();//5
		
		for(int i=0;i<n;i++) {
			int key=sc.nextInt();
			ht.insert(key);
		}
		
		ht.display();
		
		//element to search
		int target=sc.nextInt();
		
		
		if(ht.search(target)) {
			System.out.println("Element "+target+" found in the table");
		}else {
			System.out.println("Element"+target+" not found in table.");
		}
		
	}

	private boolean search(int key) {
		int index=key%SIZE;
		return  table[index].contains(key);

	}

	private void display() {
		for(int i=0;i<SIZE;i++) {
			System.out.print(i+ "-->");
			for(int num:table[i]) {
				System.out.print(num + "-->");
			}
			System.out.println("null");
		}
		
	}

	private void insert(int key) {
		int index=key%SIZE;
		table[index].add(key);
	}

}
