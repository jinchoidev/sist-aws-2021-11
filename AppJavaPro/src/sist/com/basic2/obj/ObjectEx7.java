package sist.com.basic2.obj;
//String, StringBuffer, StringBuilder

public class ObjectEx7 {

	public void objectPro1() { 
		String s1=new String(new byte[] {97,98,99,100});	//value[97,98,99,100]
		//�迭�� ���� ������ ���ĺ� �ҹ����� ASCII �ڵ尪; byte���·� �־ ���� ��µ�!
		String s2=new String("Ajax");		//value[A,j,a,x]


//		for(byte b:s2.getBytes()) {
//			System.out.println(b);

		char []c = new char[10];
		s1.getChars(0,2,c,0);		//�ƴ� �̰� ����ϸ� �� ab�� ����...?
		System.out.println(c);
		
	}
	
	public void objectPro2() {
		String s1="abc";
		String s2=new String("defd");
		System.out.println(s1.concat("�Դϴ�."));
//		System.out.println(s1);
//		System.out.println(s1.charAt(0));
//		System.out.println(s1.codePointAt(0));
//		System.out.println(s1.codePointBefore(1));
		System.out.println(s2.indexOf("d",s2.indexOf("d")+1));
		System.out.println(s1.startsWith("a"));
		System.out.println(s1.endsWith("x"));
	}
	
	public void objectPro3() {
		String s1="Abc#Def#GHI";
		String []strArray = s1.split("G");
		for(String s:strArray) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		ObjectEx7 o = new ObjectEx7();
		o.objectPro1();
	}
	
}


