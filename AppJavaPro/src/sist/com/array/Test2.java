package sist.com.array;

import java.util.Arrays;

public class Test2 {
	
	public static void main(String[] args) {
	int array1[] = {31,7,80,24,65,79};
	
	//for문 사용으로 최대 및 최소 구하기
	int max = array1[0];
	int min = array1[0];
	
	for (int i=0;i<array1.length;i++) {
		if(array1[i]>max) {
			max=array1[i];
		}
		
		if(array1[i]<min) {
			min=array1[i];
		}
		

		System.out.println("for문 이용");
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);

		}
	}


}

