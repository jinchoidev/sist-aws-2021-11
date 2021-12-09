package sist.com.basic3.obj;

public class ObjectDemo {

	public void inheritanceEx1 () {
		String s=new String();
		Object o=(Object)s;		//upcast ¿¹½Ã
		s=(String)o;		//downcast
		System.out.println(s.concat("test"));
	}
	
	public void inheritanceEx2(Object obj) {
		if (obj instanceof String) {	
		System.out.println(((String)obj).charAt(0));
		}
		if (obj instanceof ObjectDemo) {
			((ObjectDemo)obj).inheritanceEx1();
		}
	}
	
	public void inheritanceEx3() {
		//String s=new Object();
	}
	
	
	public static void main(String[] args) {
		ObjectDemo o=new ObjectDemo();
		o.inheritanceEx3();
	}
	
}
