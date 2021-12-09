package sist.com.array.core;

public class Selection1 {

int[] selectionSort = {4,1,3,5,2};

	public void swap(int[] a, int i,int j) {
		int temp=0;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public void selectionSort(int []a, int size) {
		for (int i = 0; i < size-1; i++) {
			int min=i;
			
			//최솟값 인덱스 찾기
			for (int j = 0; j < size-1; j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			//i번째 값과 찾은 최솟값을 서로 교환
			swap(a,min,i);
			
		}
		
		System.out.printf("3d",selectionSort);
	}

}
