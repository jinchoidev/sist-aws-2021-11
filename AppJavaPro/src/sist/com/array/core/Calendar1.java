package sist.com.array.core;

import java.util.Scanner;

public class Calendar1 {
   Scanner scanner=new Scanner(System.in);
   public void weekDay() {
      int year=0,month=0;//2021/11
      System.out.println("Year:");
      year=scanner.nextInt();
      System.out.println("Month:");
      month=scanner.nextInt();
      int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
      int []lastDay={31,28,31,30,31,30,31,31,30,31,30,31};
      if(year%4==0&&year%100!=0||year%400==0) {
         lastDay[1]++;
      }
      for(int i=0;i<month-1;i++) {
         total+=lastDay[i];
      }
      total++;
      int week=total%7;
      String []strWeek= {"일","월","화","수","목","금","토"};
      System.out.println(year+"년"+month+"월");
      for (int i = 0; i < strWeek.length; i++) {
         System.out.print(strWeek[i]+"\t");
      }
      System.out.println();
      
      for(int i=1;i<=lastDay[month-1];i++) {
         if(i==1) {
            for (int j = 0; j < week; j++) {
               System.out.print("\t");
            }
         }
         System.out.printf("%2d\t",i);
         week++;
         if(week>6) {
            week=0;
            System.out.println();
         }
         
      }
      
   }   
   public static void main(String[] args) {
      Calendar1 a=new Calendar1();
      a.weekDay();
      
        
       
   }

}
