package jin.choi.practice;

public class InheritanceSibling extends InheritanceParent {
	private int estate2;
	
	public InheritanceSibling(int estate1, int estate2) {
		super(estate1);
		this.estate2=estate2;
		System.out.println("������ �ƹ����κ��� �ѳ������� ��ӹ޾Ҵ�.");
	}
}
