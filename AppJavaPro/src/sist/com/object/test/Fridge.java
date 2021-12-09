package sist.com.object.test;

public class Fridge {
	private int f;
	private Mandoo m;
	public Fridge() {
	}
	
	public Fridge(int f) {
		this.f=f;
	}
	
	public Fridge(int f,Mandoo m) {
		this.f=f;
		this.m=m;
	}
	
	public Mandoo getMandoo() {
		return this.m;
	}
	
	public Fridge(Mandoo m) {
		this.m=m;
		
	}
	
	public int getFridge() {
		return this.f;
	}

}
