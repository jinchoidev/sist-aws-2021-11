package sist.com.basic.obj;

public class BookExample2 {
	
	static String title;
	
	public static void main(String[] args) {
		new BookExample1().bookName="�ڹٸ� �� ���� �;��";
		new BookExample1().bookSerialNumber=23;
		title="å �̸� ���";
		
		System.out.println(title);
		System.out.println(new BookExample1().bookName);
		System.out.println(new BookExample1().bookPrice);
		System.out.println(new BookExample1().bookPublisher);
		System.out.println(new BookExample1().bookSerialNumber);
	}

}
