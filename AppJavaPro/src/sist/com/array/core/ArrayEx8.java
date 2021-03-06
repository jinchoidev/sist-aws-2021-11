package sist.com.array.core;

import java.util.Iterator;

public class ArrayEx8 {

	public void disp(int [][]m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%5d",m[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public void sum(int [][]m) {
		final int ROW=m.length; 	//행
		final int COL=m[0].length; 	//열
			for (int i = 0; i < ROW-1; i++) {
				for (int j = 0; j < COL-1; j++) {
					m[i][COL-1]+=m[i][j];	//가로의 합
					//m[ROW-1][i]+=m[j][i];	//세로의 합
					m[ROW-1][j]+=m[j][i];	//세로의 합(2)
				}
				m[ROW-1][COL-1]+=m[i][i];
			}
	}
	
	
	public static void main(String[] args) {
		ArrayEx8 a=new ArrayEx8();
		int [][]m= {{10,20,30,0},
					{40,50,60,0},
					{70,80,90,0},
					{0,0,0,0}};
		
		int [][]m1= {{10,20,30},
					{40,50,60},
					{70,80,90}};		
		
		int [][]m2 = new int [4][];
			for (int i = 0; i < m2.length; i++) {
				for (int j = 0; j < m2.length; j++) {
					
				}
				
			}
		
		
		a.disp(m);
		a.sum(m);
		a.disp(m);
		}
	}