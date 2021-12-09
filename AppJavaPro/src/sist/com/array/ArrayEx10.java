package sist.com.array;

public class ArrayEx10 {
	public static void main(String[] args) {
		int[] arr = {4,1,3,5,2};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) { //오름차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
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

