package sist.com.basic2.obj;
//class, object(instance), classArray, overloading, constructor, this, this()
//object(사물 그 자체, this, instance), static, final

public class ObjectEx1 {
	//자료형 변수명; 자료형(기본, 참조), class 영역, heap 영역
	private int data; //lv heap
	private static int classVariable;
	public void instanceMethod() {
		System.out.println("instanceMethod");
		int local=10; //lv stack
		this.data=500;
	}
	public static void staticMethod() {
	System.out.println("staticMethod");
	//data=99;
	//this.data=100; <this 인식을 못함(static 영역이라) = 사용못함
	}
	public static void main(String[] args) {
		//staticMethod();
//		ObjectEx1 o1=new ObjectEx1();
//		ObjectEx1 o2=new ObjectEx1();
//		o1.instanceMethod();
		staticMethod();
	}
}
