package sist.com.array;

import java.util.Arrays;



//?ֺ??? ,???? 
public class ArrayEx8 {   
   
   public void disp(int []m) {
      for(int i:m) {
         System.out.printf("%3d",i);
      }
      System.out.println(); 
   }
   public int arrayCount(int []m) {
      int mx=0;
      for (int i = 0; i < m.length; i++) {
         if(mx<m[i]) {
            mx=m[i];
         }
      }
      return mx;
   }
   public void mode(int []m) {
      int []c=new int[m.length];
      //m[10][1][1][1][1][5][5][5][5][9]
      //c[1] [4][4][4][4][4][0][0][0][0]      
      for (int i = 0; i < m.length; i++) {
         for(int j=0;j<m.length;j++) {
            if(m[i]==m[j]) {
               c[i]++;
            }
         }          
      }
      
      int temp=0;
      for (int i = 0; i < c.length; i++) {
         if(c[i]==arrayCount(c)) {//1 == 4, 4==4                        
            System.out.print(m[i]+"\t");
         }  
      }
   }
      
   public static void main(String[] args) {
      ArrayEx8 a=new ArrayEx8();
      int []m= {10,1,1,1,1,5,5,5,5,9};
      //a.disp(m);
      a.mode(m);
      
   }

}