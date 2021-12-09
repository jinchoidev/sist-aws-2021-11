package sist.com.controller;

//looping, for, while, do while
public class ControllerEx5 {

	public void looping1() {
		int cnt=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=4;j++) {
				for(int k=0;k<3;k++) {
					cnt++;
				}
		}
	}
		System.out.printf("cnt=%d",cnt);
	}

	public void looping2() {
		int i=0,j=0,k=0,cnt=0;
		while(i<=5) {
			while(j<3) {
				while(k<2) {
					cnt++;
					k++;
				}
				k=0;
				j++;
			}
			j=0;
			i++;
		}
	}
		
	public void looping3() {
		int i=0,j=0,k=0,cnt=0;
		do {
			do {
				do {
					cnt++;
			}while(k<2);
			k=0;
		}while(j<3);
		j=0;
	}while(i<5);		
		
		System.out.println("hi");
	}
	
	public void looping4() {
	
		int cnt=0;
		for(int i=0;i<10;i++);
			cnt++;
		
	}

public static void main(String[] args) {
	ControllerEx5 c=new ControllerEx5();
	c.looping4();
	
	}
}
