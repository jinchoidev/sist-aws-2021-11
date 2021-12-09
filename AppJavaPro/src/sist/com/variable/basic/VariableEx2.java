package sist.com.variable.basic;
//클래스 (설계도, 사용자 정의 자료형)
//ctrl+F11
//변수 	(DATA를 담는 공간)
//DATA 기본형 | 참조형
//byte(1byte) < short(2byte) < int(4byte) < long(8byte)
//float(4byte) < double (8byte)
//boolean(1byte)
//char(2byte)

public class VariableEx2 {

	public static void main(String[] args) {

		/*
	       * final boolean booleanValue=10<90; booleanValue=5==3;
	       * System.out.println("booleanValue="+booleanValue);
	       */
	      byte byteValue=127;//[0][1][1][1][1][1][1][1]
	                           //64 32 16  8  4  2  1
	      short shortValue=32767;//-32768~32767
	      int intValue=2147483647;
	      System.out.print(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
	      System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
	      System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
	      System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
	      char charValue='A';
	      String str="aajfkldsajflkasjdfklasjdfkljasdkasfjdsa";
	      
	      
	}
}
