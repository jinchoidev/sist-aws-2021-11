package sist.com.array.core;

public class Selection {
	int[] selectionSort = {4, 1, 3, 5, 2};
	
	public static void main(String[] args) {
	    selectionSortMin(selectionSort, selectionSort.length);
	    for (int a : selectionSort) {
	    	System.out.printf("%3d",a);
	    }
	  }

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
	}

