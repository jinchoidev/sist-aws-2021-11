package sist.com.basic2.obj;

public class ObjectEx6 {	//scope(������ ����� �� �ִ� >>��ȿ����<<)
	String globalVariable = "global variable"
	//class �ؿ� �����ϸ� global variable
	//static �ٿ��� �����ϸ� class���� �����Ǿ �ƹ������� �� �� ����
	
	//�Ʒ��δ� �������
	private String value;		//new ���� �� ���� ��������� ��; ��ü����(instance)
	private static final String maker="Oracle";	//���ܺ��� (final)
	//�߻�ȭ�ߴ� �͵��� ������ >>����ȭ<<�� ����(�޸𸮿� �ε��Ѱ���) instance��� ��
	//����ȭ�� �Ϸ��� ���赵(class)�� �ʿ�
	
	public ObjectEx6(String value) {
		this.value=value;		//�����ڸ� ����(define)
		//this.maker="Sun";	
	}	//����� ������(default constructor; ���� �ʾƵ� �⺻������ ������)
		//�Ҹ��ڴ� �ڹٰ� �ڵ����� �޸� ����(collect garbage)�ϹǷ� �ʿ������
	
	public void supplement() {	//���⼭���� method ����
		String supplementEx1 = "supplement supplementEx1";	//method ������ ������ ����(local variable)
		System.out.println(globalVariable);		//class���� ���� method�� class variable ��� ����
	}	//��������� method ����

	public void setMaker(String Maker) {
		ObjectEx6.maker=maker;
	}
	
	public static String getMaker() {
		return ObjectEx6.maker;
	}
		
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value=value;
	}
	
	public static void main(String[] args) {
		//main method�� static ������ �ƴ� ��� ��üȭ�� ���� ����� Ŭ���� ���� ��� ����
		//��üȭ = new, new �Ҷ����� value|maker �̰� �Ź� �������(heap���� �Ҵ��� ��)
		ObjectEx6 o1 = new ObjectEx6("A");		//value(A)|maker(Oracle)
		ObjectEx6 o2 = new ObjectEx6("B");
		//�ٵ� ���� ���� ������ �޸�(maker)�� ��� ������ �ʿ䰡 �ֳ�? �޸� �����ε�
		//�� �̷� ���� ���� static�� ���� Ŭ���� ��ü���� �����ҰŶ� ���� �ذ�!
		//instance variable�� �ʱ�ȭ; ����� ��� ���� heap
		//instance variable�̶� Ư�������� ������ ���� ������ ���� �� �־...
		//�׷��� �� this. �ϰ� Ư���� ����� �갡 �� �±���~ �ϰ� ������
		//������ static method������ this ��� >>�Ұ�<<
		o2.setValue("XML");
		System.out.println(o1.getValue());
		
	}
	

}
//class ���� ��!!