package sist.com.array.core;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx5 {

	public void arrayEx1() {
		int [][]m=new int[2][]; //�����迭�̶�? �ุ �����صΰ� ���� �ٲ� �� ����
								 //[][][]
								 //[][][]
		Random rm=new Random();
		for (int i = 0; i < m.length; i++) {	//��
			for (int j = 0; j < m[i].length; j++) {	//��
				//���⼭ m[i]�� �صδ� ������ i(1���� �迭)�� ���̰� �� ������ �ƴ϶� �ٸ� ���� �ֱ� ����
				//eg. 3�� 4�� [3][4] �ε� ������ ���� 4ĭ�� �ƴ϶� 3ĭ�� ���� �־...
				m[i][j]=rm.nextInt(10);
			}
		}
		disp3(m);
	}
	public void disp1(int [][]m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%5d",m[i][j]);
			}
			System.out.println();
		}	
		System.out.println();
	}
	
	public void disp2(int [][]m) {
		for(int []i:m) {
			for(int j:i) {
				System.out.println();
				
			}
		}
	}
	
	public void disp3(int [][]m) {
		for(int []i:m) {
			System.out.println(Arrays.toString(i));
			//i=1�����迭�� �ּ�; m=i�� ����ü�̱� ����
		}
	}
	
	public void arrayEx2() {
//		int []a= {10,20,30,40,50};
		int [][]b= {{10,20,30},{40,50,60},{70}};
		disp1(b);
	}
	
	public void arrayEx3() {
		int []a= {10,20,30,40,50};
		int []b= {60,70,80,90};
		int []c= {100};
		
		int [][]array=new int [3][];
		//a=b;
		//���� int []a�� �ּҸ� ���� b�� �ּҸ� ����; �׷��� int []b�� �Ȱ��� ���´�
		array[0]=a; //0��(1��°��)���� 5���� ��
		array[1]=b;
		array[2]=c;
		for (int []i:array) {
			for(int j:i) {
			System.out.printf("%5d",i);
		}
			System.out.println();
	}
}	
	
	public static void main(String[] args) {
		ArrayEx5 a=new ArrayEx5();
		a.arrayEx1();
	}
	
}
