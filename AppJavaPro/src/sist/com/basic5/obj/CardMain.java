package sist.com.basic5.obj;

public class CardMain {

	public static void main(String[] args) {
		Card.getInstance().setName("연지");
		System.out.println(Card.getInstance().getName());
		//heap에 name이 만들어짐
		//에러 나는 이유? Card 클래스에서 접근제한자를 private로 써서...
	}
	
}
