package sist.com.basic5.obj;

public class Node {
	//Node node=null;		//�������� ���� �ʱⰪ�϶�; �̹� �̷��� �����Ǿ �����Ʊ� ������ �Ⱥ���
	static Node node=null; 		//�� �̷��� �ؾ� ������ �� �ߴ��� �ٽ� �ѹ� �����...
	//instance�� 1���� ����
	
	private int dataValue;
		
	public void setDataValue(int dataValue) {
		this.dataValue=dataValue;
	}
	
	public int getDataValue() {
		return this.dataValue;
	}

	public static int Node getInstance() {
		return node;
	}
	
	private Node() {
		dataValue=0;
	}

	
}
