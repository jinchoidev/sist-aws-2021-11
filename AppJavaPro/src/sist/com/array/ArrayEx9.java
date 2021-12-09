package sist.com.array;

import java.util.Random;

//SelectionSort(선택정렬),InsertionSort,Bubblesort,Quicksort

public class ArrayEx9 {

	int []m=new int[10];
	public void initArray(){
		Random random=new Random();
		for (int i=0;i<m.length;i++){
			m[i]=random.nextInt(100);
		}
	}
	
	public void swap(int i,int j) {
		int temp=0;
		temp=m[i];
		m[i]=m[j];
		m[j]=temp;
	}
	
	public void selectionSort(int order) {
		for (int i=0;i<m.length-1;i++) {
			for (int j=1;j<m.length;j++) {
				if(order==0) {
				if(m[i]<m[j]) {  //m[i]<m[j] 오름차순, 반대면 내림차순
					swap(i,j);
				}
			}else {
				if(m[i]>m[j]) {
					swap(i,j);
				}
			}
		}
	}	
}
	
	public void sortDataDisp() {
		for (int i:m) {
			System.out.printf("%3d",i);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayEx9 a=new ArrayEx9();
		a.initArray();
		a.selectionSort(0);
		a.sortDataDisp();
	}
	
}
