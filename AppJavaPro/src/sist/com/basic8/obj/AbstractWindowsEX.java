package sist.com.basic8.obj;

public abstract class AbstractWindowsEX implements MouseInter {

	@Override
	
	public void mousePress() {
		System.out.println("MouseWindowsPress");
	}
	
	@Override
	public void mouseClick() {
		System.out.println("MouseWindowsClick");
		
	}
	
	@Override
	public void mouseRelease() {
		System.out.println("MouseWindowsRelease");
		
	}
	
	public abstract void mouseRelease();

}
