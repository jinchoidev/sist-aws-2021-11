package sist.package1;

public class Sub extends Super {

	public sub() {
		this.publicData=10;
		this.protectedData=20;
		this.defaultData=30;
//		this.privateData=40;	//private이라 후손이라도 접근 안 돼서 에러남!
		
		
	}
	
}
