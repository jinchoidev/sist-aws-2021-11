package sist.com.basic.obj;

public class Alphabet {
	
	
	public static void main(String[] args) {
//		B b=new B(20,new A(10));
//	System.out.println(b.getA().getA());	
		   
		C c=new C(30,new B());
		System.out.println(c.getB().getA().getA());
	}

}
