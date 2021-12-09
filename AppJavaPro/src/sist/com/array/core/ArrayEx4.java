package sist.com.array.core;

import java.util.Iterator;

//1차원 석차, 중복검사

public class ArrayEx4 {

	int []m=new int[6];	//instance변수
	int []rank=new int[m.length];
	public void initArray() {
		for (int i = 0; i < m.length; i++) {
			m[i]=(int)(Math.random()*100);
		}
	}
	public void rank() {
		
		for (int i = 0; i < m.length; i++) {
				rank[i]=1;	//이걸 왜 이렇게 하더라?
			for (int j=0;j<m.length;j++) {
				if(m[i]<m[j]) {
					rank[i]++;
					//0번이랑 1번이랑 비교했을 때 1번이 더 크면
					//rank배열을 늘려서 후순위로 미룬다
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
		return (int)(Math.random()*100%6)+1; //이건 또 왜 이렇게 쓰지???		
	}
	
	public void lottoProcess() {
		for (int i = 0; i < m.length; i++) {
			m[i]=randomProcess();
			for(int j=0;j<i;j++)
				if(m[i]==m[j])i--;
				//중복검사
				//인덱스의 시작은 0
				//예를 들어 인덱스 3번에 들어간건 0~2까지 검사해야 하니까 j<i가 되어야함)
				//i랑 j를 비교했을 때 똑같으면 한칸 뒤로 돌아가서 다시 난수 넣기
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
