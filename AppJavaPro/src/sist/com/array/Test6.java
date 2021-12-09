package sist.com.array;

import java.util.Random;

public class Test6 {
	
	 int []m=new int[10];
	   public void initArray() {
	      Random random=new Random();
	      for (int i=0;i< m.length;i++) {
	         m[i]=random.nextInt(100);
	      }
	      
	   }
	   public void swap(int i,int j) {
	      int temp=0;
	      temp=m[i];
	      m[i]=m[j];
	      m[j]=temp;
	   }
	   public void bubbleSort(int order) {
	      int temp=0;
	      for(int i=0;i<m.length-1;i++) {
	         for(int j=0;j<m.length-1-(i+1);j++) {
	            if(m[j]<m[j+1]) {
	            	temp=m[j+1];
	            	}
	               swap(i,j);
	             }
	            }else {
	               if(m[i]>m[j]) {
	                  swap(i,j);   
	                }
	           }
	      }
	   }
	   public void sortDataDisp() {
	      for(int i:m) {
	         System.out.printf("%3d",i);
	      }
	      System.out.println();
	   }
	   public static void main(String[] args) {      
	      ArrayEx9 a=new ArrayEx9();
	      a.initArray();
	      a.bubbleSort(0);
	      a.sortDataDisp();
	   }
	   

	}
