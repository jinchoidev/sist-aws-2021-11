package sist.com.array;

public class lotto1 {

	public static void main(String[] args) {
		int lotto1[]=new int[6];					 //��ȣ ���� �迭
		
		System.out.println("[�ζ� ��ȣ]");
		
		for(int i=0;i<lotto1.length;i++) {
			lotto1[i]=(int)(Math.random()*45)+1;		//���� ��ȯ
			
			for (int j=0;j<i;j++) {
				if(lotto1[i]==lotto1[j]) {
					i--;
						break;						//�ߺ� ����
				}			
			}
		}
	for (int i=0;i<lotto1.length;i++) {
		System.out.println("\n"+lotto1[i]);
	}
		System.out.println("\n"+"�Դϴ�.");
	}
}

