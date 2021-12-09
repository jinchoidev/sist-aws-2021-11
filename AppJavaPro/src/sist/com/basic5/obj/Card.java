package sist.com.basic5.obj;

public class Card {
	private String name;
	
	public static Card getInstance() {
		return new Card();
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	private Card() {
	super();		//이게 생략되어 있다는 사실을 잊지 말기
	}
	
}
