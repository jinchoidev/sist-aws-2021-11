package sist.com.basic7.obj;

//�ڹ��� ������ ����

public class PolymorphismEx {
	
	public void classCastAction(Object obj) {		//���ö��...?
//		Object o=new StringAction();				//�̰� �����Ѱ� �� �ؽ�Ʈ��µ�...
//	}
	
		if (obj instanceof StringAction) {
			((StringAction)obj).stringAction();
		}
		
		if (obj instanceof NumberAction) {
			NumberAction new_name = (NumberAction) obj;
			new_name.numberAction();
		}
		
	}
	public static void main(String[] args) {		//���� ���ؼ� �ٽ� ã�ƺ��� �ϴµ�
		PolymorphismEx e=new PolymorphismEx();
		e.classCastAction(new NumberAction());
		
	}
	

}
