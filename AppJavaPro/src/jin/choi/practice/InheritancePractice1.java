package jin.choi.practice;

public class InheritancePractice1 extends InheritanceParent {
	private int car;
	
	public InheritancePractice1(int estate1, int car) {
		super(estate1);
		this.car=car;
		System.out.println("나는 자동차 역시 상속받았다.");
	}
	

}
