package sist.com.array;

import java.util.Arrays;

//배열(선형) 같은 기억 장소의 모임(일괄처리)
//선언,초기화,출력  

public class Test1 {
   
   public void inject(int state,int []m) {
      for (int i = 0; i < m.length; i++) {
         /*
          * if(state==1) { m[i]=(int)(Math.random()*100); }else { m[i]=(i+1)*10; }
          */
         m[i]=state==1?(int)(Math.random()*100):(i+1)*10;
      }      
      disp(m);
   }
   public void disp(int []m) {
      //System.out.println(Arrays.toString(m));
      /*
       * for(int i=0;i<m.length;i++) { System.out.printf("%3d",m[i]); }
       * System.out.println();
       */
      for(int i:m) {
         System.out.printf("%3d",i);
      }
      System.out.println();
      
   }
   public void arrayPro1(int []m,int state) {
      inject(state, m);
   }
   public void print() {
	   String []s= {"A","B","C","D"};
	   double []d= {10.5,9.9,78.6,12.9};
	   
	   for(String i:s) {
		   System.out.printf("%s",i);
	   }
   }
   
   public static void main(String[] args) {
      Test1 a=new Test1();
      a.print();
      int []m1=new int [5];//[][][][][]난수 
      int []m2=new int [5];//[][][][][] 10 ,20 30 40 50
      a.arrayPro1(m1,1);      
      a.arrayPro1(m2,2);      
      
   } 

}
