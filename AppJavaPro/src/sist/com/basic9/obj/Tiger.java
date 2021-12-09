package sist.com.basic9.obj;

public class Tiger implements RunnableEx, Eats {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Tiger runs");
		
	}
	
	@Override
	public void eats() {
		// TODO Auto-generated method stub
		System.out.println("Tigers are carnivores");
	}
	
}
