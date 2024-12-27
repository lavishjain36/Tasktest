package com.graphmatrix;

import java.util.Scanner;

public class GraphAdjMatrix {
	private int[][] adjmatrix;
	private int nodes;
	
//constructor
	public GraphAdjMatrix(int nodes) {
		this.nodes=nodes;
		adjmatrix=new int[nodes][nodes];
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of vertices: ");
		int nodes=sc.nextInt();
		
		GraphAdjMatrix graph=new GraphAdjMatrix(nodes);
		
		System.out.print("Enter the no of edges:");
		int edges=sc.nextInt();
		
		//to take connection
		System.out.println("Enter edge connections: ");
		for(int i=0;i<edges;i++) {
			int src=sc.nextInt();
			int dest=sc.nextInt();
			graph.addedge(src,dest);
		}
		
		graph.display();
	}
   
	private void display() {
		for(int i=0;i<nodes;i++) {
			for(int j=0;j<nodes;j++) {
				System.out.print(adjmatrix[i][j]+ " ");
			}
			System.out.println();//move to next line to print next row
		}
		
	}

	//adding an edge.
	private void addedge(int src, int dest) {
		adjmatrix[src][dest]=1;//directed
		adjmatrix[dest][src]=1;//undirected
	}

}
