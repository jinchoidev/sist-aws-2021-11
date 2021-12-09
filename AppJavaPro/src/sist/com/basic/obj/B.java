package sist.com.basic.obj;

public class B {
	private int b;
	private A a;
	
	public B() {
		
	}
	public B(int b) {
		this.b=b;
	}
	
	public B(int b,A a) {
		this.b=b;
		this.a=a;
	}
	
	public A getA () {
		return this.a;
	}
	
	public B(A a) {
		this.a=a;
	}
	
	public int getB() {
		return this.b;
	}
	
}
