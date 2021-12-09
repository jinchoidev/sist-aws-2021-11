package test.polymorphism;

public class InstanceExample extends Uber {
	
	public void ExampleAction() {
		
		Uber u = new Uber();
		u.publicData=10;
		u.defaultData=20;
		u.protectedData=30;	//후손 이외에는 다른데서 접근 불가능
		u.privateData=40;	//private은 후손도 함부로 접근 못해서 에러남
		
	}
	
}
