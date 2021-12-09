package sist.com.controller;

//if, if else, if sleseif elseif else, switch case default

public class ControllerEx2 {
	public void controlEx1(double avg) {
		if(avg>=90)System.out.println("A");
		else if (avg>=80)System.out.println("B");
		else if (avg>=70)System.out.println("C");
		else System.out.println("D");
	}
	
	public void controlEx2 (int value) {
		switch(value) {
		case 5:
			System.out.println("5");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("6");
			break;
		default:	
			System.out.println("±‚≈∏");
		}
		
	public void controlEx3 (int first,int second) {

		switch(first) {
		case 1:
			System.out.println("1");
			switch(second) {
		case 10:
			System.out.println("10");
			return;
		case 20:
			System.out.println("20");
		}
		case 2:
			System.out.println("2");
		}
		
	}
	
	public void controlEx4(double avg) {
		switch ((int)(avg/10)) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
			
		}
	}
	
	public void controlEx5(string avg) {
		switch ((int)(avg/10)) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
			
		}
	}
	public static void main(String[] args) {
		ControllerEx2 c=new ControllerEx2();
		c.controlEx4(85.5);
		
	}
	
}
