package test.polymorphism;

public class InstanceExample extends Uber {
	
	public void ExampleAction() {
		
		Uber u = new Uber();
		u.publicData=10;
		u.defaultData=20;
		u.protectedData=30;	//�ļ� �̿ܿ��� �ٸ����� ���� �Ұ���
		u.privateData=40;	//private�� �ļյ� �Ժη� ���� ���ؼ� ������
		
	}
	
}
