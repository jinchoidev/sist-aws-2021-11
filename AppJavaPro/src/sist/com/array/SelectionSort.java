package sist.com.array;

public class SelectionSort {

	final int []input= {4,1,3,5,2};
	
	  public static void selectionSortMin(int[] input, int length) {
	    int min;
	    int temp;
	    for (int i = 0; i < length - 1; i++) {
	      min = i;
	      for (int j = i + 1; j < length; j++) {
	        if (input[j] < input[min])
	          min = j;
	      }
	      temp = input[i];
	      input[i] = input[min];
	      input[min] = temp;
	    }
	  } 
	  
		public static void main(String[] args) {
			selectionSort a=new selectionSort();
			a.selectionSortMin();
			
		}	
	}
}
