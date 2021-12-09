package jin.choi.practice;

public class InheritanceSibling extends InheritanceParent {
	private int estate2;
	
	public InheritanceSibling(int estate1, int estate2) {
		super(estate1);
		this.estate2=estate2;
		System.out.println("동생은 아버지로부터 한남더힐을 상속받았다.");
	}
}
