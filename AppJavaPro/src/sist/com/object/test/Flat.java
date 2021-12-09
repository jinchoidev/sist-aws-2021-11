package sist.com.object.test;

public class Flat {
	
	public static void main(String[] args) {
		Kitchen k=new Kitchen(1,new Fridge(new Mandoo()));
		System.out.println("우리집 부엌 냉장고에는");
		System.out.println(k.getFridge().getMandoo().getMandoo());
		System.out.println("개의 만두가 있습니다.");
		
	}

}
