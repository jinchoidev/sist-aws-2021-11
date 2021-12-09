package sist.com.basic7.obj;

//자바의 다형성 예시

public class PolymorphismEx {
	
	public void classCastAction(Object obj) {		//ㅁㅓ라고...?
//		Object o=new StringAction();				//이걸 생략한게 위 텍스트라는데...
//	}
	
		if (obj instanceof StringAction) {
			((StringAction)obj).stringAction();
		}
		
		if (obj instanceof NumberAction) {
			NumberAction new_name = (NumberAction) obj;
			new_name.numberAction();
		}
		
	}
	public static void main(String[] args) {		//이해 못해서 다시 찾아봐야 하는듯
		PolymorphismEx e=new PolymorphismEx();
		e.classCastAction(new NumberAction());
		
	}
	

}
