package sist.com.basic2.obj;

import java.util.Calendar;

public class ObjectEx8 {
	//�̸�, ����, ���� ����, ����, ����, ��, ��ȭ��ȣ
		String[]data= {"�ּ���#881210-1010547#031)457-1280",
					   "������#981202-1012947#02)457-1980",
					   "������#990210-2010547#061)957-1280",
					   "���μ�#580510-1010547#02)657-9280"};
		
		DataPile []datapile=new DataPile[data.length];
		public void stringProcess() {
			for (int i=0;i<data.length;i++) {
				String []res=data[i].split("#");
				datapile[i] = new DataPile();
				
				for (int j = 0; j < res.length; j++) {
					switch (j) { 
					case 0:
						datapile[i].setName(res[j]);
						break;
						
					case 1:
						datapile[i].setAge((Calendar.getInstance().get(Calendar.YEAR)-(Integer.parseInt(res[j].substring(0,2))+1900)));
						break;
					}
					
				}
			
			}	//for��

			disp();
		}	
		
		public void disp() {
			for(DataPile d:datapile) {
				System.out.println(d.toString());
			}
		}

	public static void main(String[] args) {
		ObjectEx8 o=new ObjectEx8();
		o.stringProcess();
}
	
}
