package sist.com.basic5.obj;

public class CardMain {

	public static void main(String[] args) {
		Card.getInstance().setName("����");
		System.out.println(Card.getInstance().getName());
		//heap�� name�� �������
		//���� ���� ����? Card Ŭ�������� ���������ڸ� private�� �Ἥ...
	}
	
}
