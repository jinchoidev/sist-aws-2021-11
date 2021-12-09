package sist.com.array;

import java.util.Scanner;

//scanner로 최대 및 최소 구하기

public class Test3 {
	Scanner scanner=new Scanner(System.in);
	
	public int getMax(int[] array3) {
		
		int max = Integer.MIN_VALUE;
			for(int i=0;i<array3.length;i++)
				if(array3[i]>max) max=array3[i];
			return max;
		}

	public int getMin(int[] array3) {
		
		int min = Integer.MAX_VALUE;
		
			for(int i=0; i<array3.length; i++)
				if(array3[i]<min) min=array3[i];
			return min;
			
	}
	
	public int getClosest(int comp, int[] array3) {
	
		int diff = Integer.MAX_VALUE;
		int closest = 0;
		
			for(int i=0; i<array3.length; i++) {
				if (Math.abs(array3[i]-comp) < diff) {
					diff = Math.abs(array3[i]-comp);
					closest = array3[i];
					}
				}
			return closest;
		}
	
	}
	