package sist.com.basic.obj;

public class FontMain {
	static String nation;
	public static void main(String[] args) {
		new Font().fontFace="±¼¸²";	//fontFace|size|colour
		new Font().fontFace="±Ã¼­";	//fontFace|size|colour
		System.out.println(new Font().fontFace); //fontFace|size|colour
		nation="¿ì°£´Ù";
		System.out.println(FontMain.nation);
	}

}
