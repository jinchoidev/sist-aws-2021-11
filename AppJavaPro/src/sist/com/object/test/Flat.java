package sist.com.object.test;

public class Flat {
	
	public static void main(String[] args) {
		Kitchen k=new Kitchen(1,new Fridge(new Mandoo()));
		System.out.println("�츮�� �ξ� �������");
		System.out.println(k.getFridge().getMandoo().getMandoo());
		System.out.println("���� ���ΰ� �ֽ��ϴ�.");
		
	}

}
