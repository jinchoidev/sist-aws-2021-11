package sist.com.basic.obj;

public class Font {
	//아래로는 전부 멤버변수
	String fontFace; //instanceVariable
	int size;
	String colour;
	static String nation; //StaticVariable,ClassVariable
	static final int weight=20;	//StaticVariable,ClassVariable
		//위는 new 하지 않아도 메모리에 만들어지는 변수
	
//		public static void main(String[] args) {
//			Font f1=new Font(); //fontFace|size|colour
//			Font.nation="AA";
//			System.out.println(Font.weight);
//		}
}
