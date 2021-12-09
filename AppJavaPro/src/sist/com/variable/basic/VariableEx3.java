package sist.com.variable.basic;
//class (설계도, 사용자 정의 자료형)
public class VariableEx3 {

	public void byteValueMethod() {
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);	
	}
	public void IntValueMethod() {
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		//return Integer.MAX_VALUE
	}
	
	public static void main(String[] args) {
		VariableEx3 vv=new VariableEx3();
		vv.IntValueMethod();
		//System.out.println("rs="+rs);();
			//vv.methodAction1();
	}
	
}
