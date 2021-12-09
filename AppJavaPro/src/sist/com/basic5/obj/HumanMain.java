package sist.com.basic5.obj;

public class HumanMain {

	Human h;
	public void process(int data) {
		if(data>=10) {
			h=new Student();
		}else {
			h=new Doctor();
		}
		h.think();
	}
	
	public static void main(String[] args) {
		
		HumanMain h = new HumanMain();
		
		
	}
	
}
