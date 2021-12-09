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
		//o.add(10L, 10L);		//둘 다 long을 만족하는데 위에는 그게 없네? 정확하게 타입을 맞춰주지 않으면 에러가 난다!
		//o.add(10, 10); 		//이건 x도 y도 int와 long 2개를 다 만족해서 에러남
		//형태를 맞춰줘야 하는 overloading & int, long 등 타입별 우선순위?
	}

}
