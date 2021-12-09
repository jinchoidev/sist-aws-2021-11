package sist.com.basic2.obj;
//overload(메서드 이름이 같아야 한다/ 인자 개수 또는 타입이 달라야 한다)

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

	
	public void add(int ...a) {		// ... <가변배열
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
		o.add(10L, 20);		//L만 추가했는데 long형태로 출력되네...
//		o.add((short)10); //byType
		//o.add(10); <만약 타입을 지정하지 않으면 기본형은 int로 나옴
	}

}
