package sist.com.basic9.obj;

public class Rabbit implements RunnableEx, Pet, Eats {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Rabbit runs");
	}
	
	@Override
	public void love() {
		// TODO Auto-generated method stub
		System.out.println("Rabbit loves");
	}
	
	@Override
	public void eats() {
		// TODO Auto-generated method stub
		System.out.println("Rabbits are herbivores");
		
	}
	
}
