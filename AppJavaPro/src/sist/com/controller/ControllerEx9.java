package sist.com.controller;

import java.util.Calendar;
import java.util.Scanner;

public class ControllerEx9 {
	//������� ã�Ƽ� �Է��ϸ� ��, ����, ���� ���
	
	public int getAge(int year) {
		System.out.println();
		return Calendar.getInstance().get(Calendar.YEAR)-year+1;
	}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year,month,date,cdate,day;
		
		while(true) {
			System.out.println("�¾ ��");
			year=sc.nextInt();
			System.out.println("�¾ ��");
			month=sc.nextInt();
			System.out.println("�¾ ��¥");
			date=sc.nextInt();
		//1�� 1�� 1�Ϻ��� �Էµ� ��¥���� �� �ϼ� ����ϱ�

		cdate=0;
		
		for(int i=1;1<=year-1;i++) {
			if(i%4==0 && i%100!=0)
				cdate+=366;
			else
				cdate+=365;
			}
		
		//���� �ϼ� ���� ���
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
		//cdate+date=cdate�� �򰥸��� ����
			
			System.out.println("�� �ϼ�:"+cdate);
			day=cdate%7;
			System.out.println(year+"��"+month+"��"+date+"�Ͽ� �¾ �����"+
			(day==0?"��":day==1?"��":day==2?"ȭ":day==3?"��":day==4?"��":day==5?"��":"��")+"���Ͽ� �¾���ϴ�.");		
			System.out.println(year+"�� �����");		

					
			switch (year%12) {
	         case 1: System.out.println("��"); break;
	         case 2: System.out.println("��"); break;
	         case 3: System.out.println("����"); break;
	         case 4: System.out.println("��"); break;
	         case 5: System.out.println("��"); break;
	         case 6: System.out.println("ȣ����"); break;
	         case 7: System.out.println("�䳢"); break;
	         case 8: System.out.println("��"); break;
	         case 9: System.out.println("��"); break;
	         case 10: System.out.println("��"); break;
	         case 11: System.out.println("��"); break;
	         default: System.out.println("������"); break;
			}
			
			System.out.println("���Դϴ�.");

			}
		}
	}