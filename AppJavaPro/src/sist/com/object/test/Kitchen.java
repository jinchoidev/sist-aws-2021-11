package sist.com.object.test;

public class Kitchen {
	
	private int k;
	private Fridge f;
	public Kitchen(+ fridge) {
	}
	
	public Kitchen (int k) {
	}
	
	public Kitchen (int k,Fridge f) {
		this.k=k;
		this.f=f;
	}
	
	public void setFridge(Fridge f) {
		this.f=f;
	}
	
	public Fridge getFridge() {
		return this.f;
	}
	
	public int getKitchen() {
		return this.k;
	}
	

}
