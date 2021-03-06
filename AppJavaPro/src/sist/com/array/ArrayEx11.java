package sist.com.array;

public class ArrayEx11 {
	public static void main(String[] args) {
		int[] arr = {15,12,11,13,14};
		
		if(arr.length > 1) {
			int i, j;
			for(i=1; i<arr.length; i++) {
				int tmp = arr[i];
				for(j=i-1; j>=0; j--) {
					arr[j+1] = arr[j];
					if(tmp > arr[j]) {
						break;
					}
				}
				arr[j+1] = tmp;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i+1 != arr.length) {
				System.out.print(", ");
			}
		}
	}
}
