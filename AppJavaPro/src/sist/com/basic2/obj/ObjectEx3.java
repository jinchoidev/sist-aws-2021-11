package sist.com.basic2.obj;

public class ObjectEx3 {
	
	private int a;
	private boolean b;
	private float c;
	
	public void instanceMethod() {
		a++;
	}
	
	public static void message() {
		System.out.println("message");
	}
	
	public static void main(String[] args) {
		ObjectEx3 o1=new ObjectEx3(); //a|b|c
		o1.message();	//해당 영역이 static이라 new. 하지 않아도 호출 가능!
	}

}
