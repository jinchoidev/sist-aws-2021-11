package sist.com.basic2.obj;

public class Practice3 {
	//이름, 나이, 오늘 생일, 성별, 지역, 띠, 전화번호
	
	public void stringProcess() {
		String[]data= {"주석영#881210-1010547#031)457-1280",
					   "장태훈#981202-1012947#02)457-1980",
					   "최은영#990210-2010547#061)957-1280",
					   "김인수#580510-1010547#02)657-9280"};

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
