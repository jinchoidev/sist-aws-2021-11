package sist.com.array.core;

import java.util.Iterator;

//1���� ����, �ߺ��˻�

public class ArrayEx4 {

	int []m=new int[6];	//instance����
	int []rank=new int[m.length];
	public void initArray() {
		for (int i = 0; i < m.length; i++) {
			m[i]=(int)(Math.random()*100);
		}
	}
	public void rank() {
		
		for (int i = 0; i < m.length; i++) {
				rank[i]=1;	//�̰� �� �̷��� �ϴ���?
			for (int j=0;j<m.length;j++) {
				if(m[i]<m[j]) {
					rank[i]++;
					//0���̶� 1���̶� ������ �� 1���� �� ũ��
					//rank�迭�� �÷��� �ļ����� �̷��
				}
			}
		}
		disp(m);
		disp(rank);
	}
	
	public void disp(int []m) {
		for(int i:m) {
			System.out.printf("%5d",i);
		}
		System.out.println();
	}
	
	public int randomProcess() {
		return (int)(Math.random()*100%6)+1; //�̰� �� �� �̷��� ����???		
	}
	
	public void lottoProcess() {
		for (int i = 0; i < m.length; i++) {
			m[i]=randomProcess();
			for(int j=0;j<i;j++)
				if(m[i]==m[j])i--;
				//�ߺ��˻�
				//�ε����� ������ 0
				//���� ��� �ε��� 3���� ���� 0~2���� �˻��ؾ� �ϴϱ� j<i�� �Ǿ����)
				//i�� j�� ������ �� �Ȱ����� ��ĭ �ڷ� ���ư��� �ٽ� ���� �ֱ�
		}
		disp(m);
	}
	
	public static void main(String[] args) {
		ArrayEx4 a=new ArrayEx4();
		a.lottoProcess();
//		a.initArray();
//		a.rank();
	}
	
}
