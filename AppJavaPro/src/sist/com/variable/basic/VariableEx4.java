package sist.com.variable.basic;

public class VariableEx4 {
	public void localValueEx1() {
		int a=5;
		a=a+1;
		System.out.println(a);
	}
	int x=5;
	public void localValueEx2() {
		x=x+5;
		System.out.println("x="+x);
	}
	
	public void localValueEx3() {
		int a=10;
		{
			int b=50; {
				
				int c=99;
					c=100;
			}
			
				b=88;
			
				}
		
			a=55;
		
			}
	
	public void localValueEx4() {	
		System.out.println((int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);
		for(int i=(int)Character.MIN_VALUE;i<=(int)Character.MAX_VALUE;i++)
	
		System.out.println(65);
	}
	
		
	public static void main(String[] args) {
		VariableEx4 v=new VariableEx4();
		v.localValueEx2(); //10
		v.localValueEx2(); //10
		v.localValueEx2(); //10
	}
	
}
