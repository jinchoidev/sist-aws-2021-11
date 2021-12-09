package sist.com.basic2.obj;

public class Practice1 {
	
	private int dumplings;
	private int apples;
	private int coffee;
	
	public void fridge() {
		dumplings++;		
	}
	
	public void iHateCucumber() {
		System.out.println("하지만 난 오이가 싫어요.");
	}
	
	public static void main(String[] args) {
	
		Practice1 p1=new Practice1();
		System.out.println("냉장고에는 오이가");
		System.out.println();
		System.out.println("개 있습니다.");
		System.out.println();
		p1.iHateCucumber();
	}
	

}
