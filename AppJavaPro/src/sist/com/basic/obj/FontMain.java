package sist.com.basic.obj;

public class FontMain {
	static String nation;
	public static void main(String[] args) {
		new Font().fontFace="����";	//fontFace|size|colour
		new Font().fontFace="�ü�";	//fontFace|size|colour
		System.out.println(new Font().fontFace); //fontFace|size|colour
		nation="�찣��";
		System.out.println(FontMain.nation);
	}

}
