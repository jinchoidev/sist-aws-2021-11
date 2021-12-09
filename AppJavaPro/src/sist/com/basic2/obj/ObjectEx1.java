package sist.com.basic2.obj;
//class, object(instance), classArray, overloading, constructor, this, this()
//object(�繰 �� ��ü, this, instance), static, final

public class ObjectEx1 {
	//�ڷ��� ������; �ڷ���(�⺻, ����), class ����, heap ����
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
	//this.data=100; <this �ν��� ����(static �����̶�) = ������
	}
	public static void main(String[] args) {
		//staticMethod();
//		ObjectEx1 o1=new ObjectEx1();
//		ObjectEx1 o2=new ObjectEx1();
//		o1.instanceMethod();
		staticMethod();
	}
}
