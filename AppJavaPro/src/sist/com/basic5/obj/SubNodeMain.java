package sist.com.basic5.obj;

public class SubNodeMain {

	public static void main(String[] args) {

		SubNode node = new SubNode();		//SubNode(SuperNode(saySuper()))
		node.saySuper();
		
	}
	
}

//static method는 override 할 수 없다
//instance method만 후손(child) 클래스에서 override가능
