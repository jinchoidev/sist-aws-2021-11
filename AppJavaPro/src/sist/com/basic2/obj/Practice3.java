package sist.com.basic2.obj;

public class Practice3 {
	//�̸�, ����, ���� ����, ����, ����, ��, ��ȭ��ȣ
	
	public void stringProcess() {
		String[]data= {"�ּ���#881210-1010547#031)457-1280",
					   "������#981202-1012947#02)457-1980",
					   "������#990210-2010547#061)957-1280",
					   "���μ�#580510-1010547#02)657-9280"};

		for(int i=0; i<data.length; i++) {
		String[]dataSort=data[i].split("#");
			for(String j:dataSort) {
				System.out.println(j);
			}
		}

	}
	
	
	public static void main(String[] args) {
		Practice3 o=new Practice3();
		o.stringProcess();
}
	
}
