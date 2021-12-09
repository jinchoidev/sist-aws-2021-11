package sist.com.variable.basic;

//변수 Variable, Constant(final)
//Primitives = 논리, 문자, 정수... 
//boolean

public class VariableEx5 {

	public boolean actionBoolean(int x,int y,int z) {
		return x+y<y-z;
	}
	
	public char actionChar(int x) {
		return (char)x;
	}
	
	public static void main(String[] args) {
		VariableEx5 v=new VariableEx5();
		//v.actionBoolean(5,7);
		//System.out.println(v.actionBoolean(5,7,8));
		System.out.println(v.actionChar(34));
	}

}
