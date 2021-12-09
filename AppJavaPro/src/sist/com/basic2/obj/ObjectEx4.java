package sist.com.basic2.obj;
//overload(�޼��� �̸��� ���ƾ� �Ѵ�/ ���� ���� �Ǵ� Ÿ���� �޶�� �Ѵ�)

public class ObjectEx4 {
	
	public void add() {
		System.out.println("add");
	}
	
	public void add(byte value) {
		System.out.println("public void add(byte value)");
	}
	
	public void add(short value) {
		System.out.println("public void add(short value)");
	}
	
	public void add(int value) {
		System.out.println("public void add(int value)");
	}
	
	public void add(String s,int value) {
		System.out.println("add(String s,int value)");
	}
	
	public void add(int value,String s) {
		System.out.println("add(int value,String s)");
	}

	
	public void add(int ...a) {		// ... <�����迭
		System.out.println("add(int ...a)");
	}
	
	public void add(long x, long y) {
		System.out.println("add(long x, long y)");
	}
	
	public void add(int x, int y) {
		System.out.println("add(int x, int y)");
	}
	
	
//	public void add(int value) {
//		System.out.println("public void add(int value)");
//		return 0;
//	}
	
	public static void main(String[] args) {
		ObjectEx4 o=new ObjectEx4();
		o.add(10L, 20);		//L�� �߰��ߴµ� long���·� ��µǳ�...
//		o.add((short)10); //byType
		//o.add(10); <���� Ÿ���� �������� ������ �⺻���� int�� ����
	}

}
