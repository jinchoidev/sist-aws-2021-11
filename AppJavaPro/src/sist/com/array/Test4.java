package sist.com.array;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
	int array2[] = {42,9,71,64,35,98};
	}
}

	int max = array2[0];
	int min = array2[0];
	
	//arrays.sort�� �ִ� �� �ּ� ���ϱ�
	Arrays.sort(array2);
		System.out.println("Arrays.sort �̿�");
		System.out.println("�ִ밪 : "+array2[array2.length-1]);
		System.out.println("�ּҰ� : "+array2[0]);
		
	}
