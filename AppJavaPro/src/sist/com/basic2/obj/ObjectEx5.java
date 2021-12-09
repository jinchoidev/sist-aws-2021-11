package sist.com.basic2.obj;

public class ObjectEx5 {

	public void add(int x, long y) {
		System.out.println("add(int x, long y)");
	}
	
	public void add(long x, int y) {
		System.out.println("add(long x, int y)");
	}

	public void makerOverload1() {
		byte b=10;
		short s=25;
		int i=100;
		System.out.print(i);
		System.out.println(5>3);
		System.out.println(new char[] {'a','b','c'});
		System.out.println(10.5F);
		System.out.println("abc");
	}
	
	public void array(int ...x) {
		System.out.println("array(int ...x)");
	}

	public void array(long ...x) {
		System.out.println("array(long ...x)");	
	}
	
	public void array(double ...x) {
		System.out.println("array(double ...x)");
	}
	
	public static void main(String[] args) {
		ObjectEx5 o=new ObjectEx5();
		//o.makerOverload1();
		o.array(new int[] {10, 20, 30});
		//o.add(10, 10L);
		//o.add(10L, 10L);		//�� �� long�� �����ϴµ� ������ �װ� ����? ��Ȯ�ϰ� Ÿ���� �������� ������ ������ ����!
		//o.add(10, 10); 		//�̰� x�� y�� int�� long 2���� �� �����ؼ� ������
		//���¸� ������� �ϴ� overloading & int, long �� Ÿ�Ժ� �켱����?
	}

}
