package sist.com.array.core;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx5 {

	public void arrayEx1() {
		int [][]m=new int[2][]; //가변배열이란? 행만 고정해두고 열은 바뀔 수 있음
								 //[][][]
								 //[][][]
		Random rm=new Random();
		for (int i = 0; i < m.length; i++) {	//행
			for (int j = 0; j < m[i].length; j++) {	//열
				//여기서 m[i]로 해두는 이유는 i(1차원 배열)의 길이가 다 같은게 아니라 다를 수도 있기 때문
				//eg. 3행 4열 [3][4] 인데 마지막 행은 4칸이 아니라 3칸일 수도 있어서...
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
			//i=1차원배열의 주소; m=i의 집합체이기 때문
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
		//원래 int []a의 주소를 끊고 b의 주소를 가짐; 그래서 int []b랑 똑같이 나온다
		array[0]=a; //0행(1번째줄)에는 5열이 들어감
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
