package sist.com.basic2.obj;

public class Practice1 {
	
	private int dumplings;
	private int apples;
	private int coffee;
	
	public void fridge() {
		dumplings++;		
	}
	
	public void iHateCucumber() {
		System.out.println("������ �� ���̰� �Ⱦ��.");
	}
	
	public static void main(String[] args) {
	
		Practice1 p1=new Practice1();
		System.out.println("������� ���̰�");
		System.out.println();
		System.out.println("�� �ֽ��ϴ�.");
		System.out.println();
		p1.iHateCucumber();
	}
	

}
