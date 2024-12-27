package com.day10;

import java.util.ArrayList;
import java.util.Scanner;

//graph structure
class Graph{
	int nodes;
	ArrayList<ArrayList<Integer>> adjlist;
	
	public Graph(int nodes) {
		this.nodes=nodes;
		adjlist=new ArrayList<>();
		
		
		//traverse through every node
		for(int i=0;i<nodes;i++) {
			adjlist.add(new ArrayList<>());//create empty list to store 
		}
	}

	//adding edge b/w two vertices
	public void addedge(int src, int dest) {
		adjlist.get(src).add(dest);
		adjlist.get(dest).add(src);	//undirected.	
	}

	public void display() {
		for(int i=0;i<nodes;i++) {
			System.out.print("Vertices "+i+ ": ");
			for(int data:adjlist.get(i)) {
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
	}
}
public class GraphConcept {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of vertices:");
		
		int nodes=sc.nextInt();
		
		System.out.println("Enter the no of edges: ");
		int edges=sc.nextInt();
		
		//create a graph object
		Graph graph=new Graph(nodes);

		System.out.println("Enter the edge from every vertices: ");
		for(int i=0;i<edges;i++) {
			int src=sc.nextInt();//first edge of node
			int dest=sc.nextInt();//second->undirected graph->
			graph.addedge(src,dest);
		}
		
		graph.display();
	}

}
