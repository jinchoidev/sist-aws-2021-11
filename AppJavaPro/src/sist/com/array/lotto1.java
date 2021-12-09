package sist.com.array;

public class lotto1 {

	public static void main(String[] args) {
		int lotto1[]=new int[6];					 //번호 받을 배열
		
		System.out.println("[로또 번호]");
		
		for(int i=0;i<lotto1.length;i++) {
			lotto1[i]=(int)(Math.random()*45)+1;		//난수 반환
			
			for (int j=0;j<i;j++) {
				if(lotto1[i]==lotto1[j]) {
					i--;
						break;						//중복 제거
				}			
			}
		}
	for (int i=0;i<lotto1.length;i++) {
		System.out.println("\n"+lotto1[i]);
	}
		System.out.println("\n"+"입니다.");
	}
}

