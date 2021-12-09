package sist.com.array;

import java.util.Arrays;

public class Test5 {
	
	int arr[]= {89,71,56,95,99,100};
	   // 석차
	   public int[] getRank(int[] arr) {
	      int[] rank = new int [arr.length];
	      // 배열을 1로 초기화
	      Arrays.fill(rank,1);
	      
	      for(int i=0; i<arr.length; i++) {
	         for(int j=0; j<arr.length; j++) {
	            if(j==i)continue;
	            if(arr[i]<arr[j]) rank[i]++;
	         }
	      }
	      return rank;
	   }
	
}
