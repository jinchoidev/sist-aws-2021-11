package com.sist.main;

import java.util.Scanner;

// 사용자가 연도/월 입력
// 달력 출력 -> 윤년

// 로마시대때 정해짐
// 4년마다 포함 / 100년마다 제외 / 400년마다 포함

// 1. 1년 1월 1일 -> 작년까지의 총 일수
// 2. 현재년도의 1월부터 입력한 월까지의 총 일수
// 3. 1++ <- why?
// ============================================

// 총 일수 % 7 -> 요일
// ----> Calendar <

public class MainClass {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("연도 입력:");
		int year=scan.nextInt();
		
		System.out.println("월 입력:");
		int month=scan.nextInt();
		
		// 요청한 내용을 가공 -> 1일자의 요일 구하기
		// 전년도까지의 총 일수
		int total=(year-1)*365
				 +(year-1)/4
				 -(year-1)/100
				 +(year-1)/400;
		
		// 전월까지의 합
		int[] lastday= {31,28,31,30,31,30,
						31,31,30,31,30,31};
		
		if((year%4==0 && year%100!=0)||(year%400==0)) {
			lastday[1]=29;
		} else {
			lastday[1]=28;
		}
		
		
//			요일 구하기
		int week=total%7;
		
//			출력
//		
//			문자열을 입력받아서 거꾸로 출력
//			======================
//			그림파일을 읽어와서 거꾸로 출력
//			byte[] buffer=fileReader()

		String[] strWeek= {"일","월","화","수","목","금","토"};

//			요일 출력
		System.out.println(year+"년도"+month+"월");
		for(int i=0;i<strWeek.length;i++) {
			System.out.println(strWeek[i]+"\t");
		}
		System.out.println("\n");
		for(int i=1;i<=lastday[month-1];i++) {
//			System.out.print(i+"\t");
			if(i==1) {		// 맨 첫줄
				for(int j=0;j<week;j++) {
					System.out.print("\t");
				}
			}
			System.out.print(i+"\t");
			week++;
			if(week>6) {
				week=0;
				System.out.println();
			}
		}
		
	}
	
}
