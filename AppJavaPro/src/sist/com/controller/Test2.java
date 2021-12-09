package sist.com.controller;

public class Test2 {

	public void loopingEx4() {
	      int i = 1;
	      int j = 1;
	      while (i <= 9) {
	         while (j <= 9) {
	            System.out.printf("%d * %d = %d\t", i, j, i * j);
	            j++;
	         }
	         System.out.println();
	         j = 1;
	         i++;
	      }
	   }
	   
	   public void loopingEx5(){
	      int i = 1;
	      int j = 1;
	      
	      do {
	         do {
	            System.out.printf("%d * %d = %d\t", i, j, i * j);
	            j++;
	         }while(j<=9);
	         System.out.print...
	
	
}
