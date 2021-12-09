package sist.com.basic5.obj;

public class Notebook {
	private int screensize;
	private String CPU;
	private String RAM;
	static String nation;
	private final int COUNT=100;
	
	static {
		System.out.println("staticBlock");
		nation="한국";
	}
	
	public Notebook() {
		System.out.println("Notebook");
		RAM="16GB";
		CPU="Intel 10세대";
	}
	
	
	public static void main(String[] args) {
		System.out.println("MainMethod");
		Notebook notebook=new Notebook();
	}
}
