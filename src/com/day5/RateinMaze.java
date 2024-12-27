package com.day5;

import java.util.Scanner;

public class RateinMaze {
	
	static int N;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//enter number of matrix or maze->
		N=sc.nextInt();//4
		
		//input matrix
		int[][] maze=new int[N][N];//heap memory
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				maze[i][j]=sc.nextInt();
			}
		}
		
		int[][] sol=new int[N][N];//result
		
		
		if(solvemaze(maze,sol,0,0)) {
			printsoln(sol);
		}else {
			System.out.println("No solution exist. Rat can't reach destination.");
		}
		
	}

	private static void printsoln(int[][] sol) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(sol[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

	//logic part
	private static boolean solvemaze(int[][] maze, int[][] sol, int x, int y) {
		//if rat has already reached to destination
		if(x==N-1&& y==N-1) {
			sol[x][y]=1;
			return true;
		}
		
		//path that has chosen is safe
		if(issafe(maze,x,y)) {
			//mark the cell as 1 ->solution maze for rate path
			sol[x][y]=1;
			
			//move to right(x,y+1)->recursive solution
			
			if(solvemaze(maze,sol,x,y+1))
				return true;
			//move to down (x+1,y)
			if(solvemaze(maze,sol,x+1,y))
				return true;
			
			//backtracking approach-blocked path
			sol[x][y]=0;//blocked path
			return false;
			
		}
		
		return false;
	}

	//logic
	private static boolean issafe(int[][] maze, int x, int y) {
		//x and y boundaries
		return (x>=0&& x<N && y>=0 && y<N && maze[x][y]==1);//path is safe->true
	}

}
