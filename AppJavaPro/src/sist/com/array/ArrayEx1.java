package sist.com.array;

//배열개념: 같은 기억장소의 모임
//배열목적: 일괄처리

public class ArrayEx1 {

	public void arrayEx1() {
	      int []m1=new int[6];//[10][20][30][40][50]
	      m1[0]=10;
	      m1[1]=20;
	      m1[2]=30;
	      m1[3]=40;
	      m1[4]=50;
	      /*
	       * System.out.println(m1[0]); System.out.println(m1[1]);
	       * System.out.println(m1[2]); System.out.println(m1[3]);
	       * System.out.println(m1[4]);
	       */
	      
	      for(int i=0;i<m1.length;i++) {
	         System.out.printf("m[%d]=%-3d",i,m1[i]);         
	      }
	}
	
	public void arrayEx2() {
	      int []m= {10,20,30,40,50,60,70,80};
	      for(int i=0;i<m.length;i++) {
	         System.out.printf("%5d",m[i]);
	      }
	      System.out.println();
	      int j=0;
	      while(j<m.length) {
	         System.out.printf("%5d",m[j++]);
	      }
	      System.out.println();
	      int k=0;
	      do {
	         System.out.printf("%5d",m[k++]);
	      }while(k<m.length);
	      
	   }
	
}