package sist.com.controller;

import java.util.Iterator;

//
public class ControllerEx6 {
	public void loopingEx1(int count) {
		for (int i=1;i<=100;i++) {
			if(i%6==0) System.out.println();
			if(!(i%2==0))continue;
			//System.out.print(i+"\t");
			System.out.printf("%-5d",i);
			
		}
	}
	
	public void loopingEx2(int count) {
		int i=0;
		while(i<count) {
			i++;
			if(i%2==0)continue;
			System.out.println(i);
		}
	}
			
	public static void main(String[] args) {
		ControllerEx6 c=new ControllerEx6();
		c.loopingEx2(100);
	}

}
