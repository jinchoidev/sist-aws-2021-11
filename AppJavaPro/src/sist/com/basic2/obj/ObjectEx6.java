package sist.com.basic2.obj;

public class ObjectEx6 {	//scope(변수를 사용할 수 있는 >>유효범위<<)
	String globalVariable = "global variable"
	//class 밑에 선언하면 global variable
	//static 붙여서 선언하면 class내에 공유되어서 아무데서나 쓸 수 있음
	
	//아래로는 멤버변수
	private String value;		//new 했을 때 새로 만들어지는 애; 객체변수(instance)
	private static final String maker="Oracle";	//종단변수 (final)
	//추상화했던 것들을 눈으로 >>형상화<<한 것을(메모리에 로딩한것을) instance라고 함
	//형상화를 하려면 설계도(class)가 필요
	
	public ObjectEx6(String value) {
		this.value=value;		//생성자를 정의(define)
		//this.maker="Sun";	
	}	//얘들은 생성자(default constructor; 쓰지 않아도 기본적으로 존재함)
		//소멸자는 자바가 자동으로 메모리 삭제(collect garbage)하므로 필요없지롱
	
	public void supplement() {	//여기서부터 method 영역
		String supplementEx1 = "supplement supplementEx1";	//method 영역에 선언한 변수(local variable)
		System.out.println(globalVariable);		//class영역 안의 method는 class variable 사용 가능
	}	//여기까지가 method 영역

	public void setMaker(String Maker) {
		ObjectEx6.maker=maker;
	}
	
	public static String getMaker() {
		return ObjectEx6.maker;
	}
		
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value=value;
	}
	
	public static void main(String[] args) {
		//main method는 static 변수가 아닐 경우 객체화를 따로 해줘야 클래스 변수 사용 가능
		//객체화 = new, new 할때마다 value|maker 이게 매번 만들어짐(heap에만 할당이 됨)
		ObjectEx6 o1 = new ObjectEx6("A");		//value(A)|maker(Oracle)
		ObjectEx6 o2 = new ObjectEx6("B");
		//근데 같은 값을 가지는 메모리(maker)를 계속 가져갈 필요가 있나? 메모리 낭비인듯
		//ㄴ 이럴 때는 위에 static을 쓰면 클래스 전체에서 공유할거라 문제 해결!
		//instance variable을 초기화; 얘들이 사는 곳은 heap
		//instance variable이라 특정해주지 않으면 몰라 여러개 있을 수 있어서...
		//그래서 꼭 this. 하고 특정을 해줘야 얘가 아 걔구만~ 하고 이해함
		//하지만 static method에서는 this 사용 >>불가<<
		o2.setValue("XML");
		System.out.println(o1.getValue());
		
	}
	

}
//class 영역 끝!!