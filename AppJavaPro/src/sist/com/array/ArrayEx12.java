package sist.com.array;

public class ArrayEx12 {

	public static void main(String[] args) {
		int[] arr = {10,7,9,8,6};
		
	    for (int i = 0; i < arr.length - 1; i++) {  
	    	for (int j = 0; j < arr.length - i - 1; j++) { 
	    		if (arr[j] > arr[j + 1]) {  
	    			int temp = arr[j];  
	          arr[j] = arr[j + 1]; 
	          arr[j + 1] = temp; 
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

