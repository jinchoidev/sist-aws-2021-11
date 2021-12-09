package sist.com.controller;

import java.util.Calendar;
import java.util.Scanner;

public class ControllerEx9 {
	//생년월일 찾아서 입력하면 띠, 나이, 요일 출력
	
	public int getAge(int year) {
		System.out.println();
		return Calendar.getInstance().get(Calendar.YEAR)-year+1;
	}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year,month,date,cdate,day;
		
		while(true) {
			System.out.println("태어난 해");
			year=sc.nextInt();
			System.out.println("태어난 달");
			month=sc.nextInt();
			System.out.println("태어난 날짜");
			date=sc.nextInt();
		//1년 1월 1일부터 입력된 날짜까지 총 일수 계산하기

		cdate=0;
		
		for(int i=1;1<=year-1;i++) {
			if(i%4==0 && i%100!=0)
				cdate+=366;
			else
				cdate+=365;
			}
		
		//월별 일수 총합 계산
		for(int i=1;i<month-1;i++) {
		switch(i)
			{
			case 2:
				
			if (year%4==0&&year%100!=0&&)
				cdate+=29;
			else
				cdate+=28;
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				cdate+=30;
			break;
			default:
				cdate+=31;
				}
		}
		
		cdate+=date;
		//cdate+date=cdate임 헷갈리지 말기
			
			System.out.println("총 일수:"+cdate);
			day=cdate%7;
			System.out.println(year+"년"+month+"월"+date+"일에 태어난 사람은"+
			(day==0?"일":day==1?"월":day==2?"화":day==3?"수":day==4?"목":day==5?"금":"토")+"요일에 태어났습니다.");		
			System.out.println(year+"년 출생은");		

					
			switch (year%12) {
	         case 1: System.out.println("닭"); break;
	         case 2: System.out.println("개"); break;
	         case 3: System.out.println("돼지"); break;
	         case 4: System.out.println("쥐"); break;
	         case 5: System.out.println("소"); break;
	         case 6: System.out.println("호랑이"); break;
	         case 7: System.out.println("토끼"); break;
	         case 8: System.out.println("용"); break;
	         case 9: System.out.println("뱀"); break;
	         case 10: System.out.println("말"); break;
	         case 11: System.out.println("양"); break;
	         default: System.out.println("원숭이"); break;
			}
			
			System.out.println("띠입니다.");

			}
		}
	}