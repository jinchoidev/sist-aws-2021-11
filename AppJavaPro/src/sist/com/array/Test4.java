package sist.com.array;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
	int array2[] = {42,9,71,64,35,98};
	}
}

	int max = array2[0];
	int min = array2[0];
	
	//arrays.sort로 최대 및 최소 구하기
	Arrays.sort(array2);
		System.out.println("Arrays.sort 이용");
		System.out.println("최대값 : "+array2[array2.length-1]);
		System.out.println("최소값 : "+array2[0]);
		
	}
