package com.graphmatrix;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSalgorithm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of vertices: ");
		
		int nodes=sc.nextInt();
		int[][] graph=new int[nodes][nodes];
		
		for(int i=0;i<nodes;i++) {
			for(int j=0;j<nodes;j++) {
				graph[i][j]=sc.nextInt();
			}

		}

		System.out.println("Enter the source vertices for traversal: ");
		int start=sc.nextInt();
		
		bfs(graph,start);
}

	private static void bfs(int[][] graph, int start) {
		int nodes=graph.length;
		boolean[] visited=new boolean[nodes];
		
		//Queue->BFS
		Queue<Integer> queue=new LinkedList<>();
		
		visited[start]=true;
		queue.add(start);
		
		System.out.println("BFS traversal "+start);
		
		while(!queue.isEmpty()) {
		//dqueue
			int u=queue.poll();
			System.out.println(u+ " ");
			
			//visit all unvisited neigbours
			for(int v=0;v<nodes;v++) {
				if(graph[u][v]!=0 && !visited[v]) {
					queue.add(v);
					visited[v]=true;
				}
			}
		}
		System.out.println();
		
	}
}
