package sist.com.variable.core;

import com.sun.tools.javac.launcher.Main;

//변수 (데이터를 담는 공간) 숫자

public class VariableAppEx1 {
	
	public int variableEx1() {
		double dValue=25.6789;
		return (int)dValue;
		
	}
	
	public char VariableEx2() {
		return 97;
	}
		
	public int variableEx3() {
		return 'A';
		
	}
	

public double variableEx4(int x, int y, int z) {
	return (x+y*z)/(double)(x-y);
	}

public boolean variableEx5(int x, int y, int z) {
	return ++x==y;
}
}


