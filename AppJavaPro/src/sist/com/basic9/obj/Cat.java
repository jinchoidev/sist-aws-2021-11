package sist.com.basic9.obj;

public class Cat implements RunnableEx, Thinkable, Pet, Eats {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Cat runs");
	}
	
	@Override
	public void think() {
		// TODO Auto-generated method stub
		System.out.println("Cat thinks");
	}
	
	@Override
	public void love() {
		// TODO Auto-generated method stub
		System.out.println("Cat loves");
	}
	
	@Override
	public void eats() {
		// TODO Auto-generated method stub
		System.out.println("Cats are carnivores");
	}

}
