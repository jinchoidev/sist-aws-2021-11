package com.sist.main;

import java.util.Scanner;

// ����ڰ� ����/�� �Է�
// �޷� ��� -> ����

// �θ��ô붧 ������
// 4�⸶�� ���� / 100�⸶�� ���� / 400�⸶�� ����

// 1. 1�� 1�� 1�� -> �۳������ �� �ϼ�
// 2. ����⵵�� 1������ �Է��� �������� �� �ϼ�
// 3. 1++ <- why?
// ============================================

// �� �ϼ� % 7 -> ����
// ----> Calendar <

public class MainClass {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�:");
		int year=scan.nextInt();
		
		System.out.println("�� �Է�:");
		int month=scan.nextInt();
		
		// ��û�� ������ ���� -> 1������ ���� ���ϱ�
		// ���⵵������ �� �ϼ�
		int total=(year-1)*365
				 +(year-1)/4
				 -(year-1)/100
				 +(year-1)/400;
		
		// ���������� ��
		int[] lastday= {31,28,31,30,31,30,
						31,31,30,31,30,31};
		
		if((year%4==0 && year%100!=0)||(year%400==0)) {
			lastday[1]=29;
		} else {
			lastday[1]=28;
		}
		
		
//			���� ���ϱ�
		int week=total%7;
		
//			���
//		
//			���ڿ��� �Է¹޾Ƽ� �Ųٷ� ���
//			======================
//			�׸������� �о�ͼ� �Ųٷ� ���
//			byte[] buffer=fileReader()

		String[] strWeek= {"��","��","ȭ","��","��","��","��"};

//			���� ���
		System.out.println(year+"�⵵"+month+"��");
		for(int i=0;i<strWeek.length;i++) {
			System.out.println(strWeek[i]+"\t");
		}
		System.out.println("\n");
		for(int i=1;i<=lastday[month-1];i++) {
//			System.out.print(i+"\t");
			if(i==1) {		// �� ù��
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
