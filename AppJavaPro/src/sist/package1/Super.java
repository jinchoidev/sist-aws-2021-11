package sist.package1;

//public > protected > default > private (접근성 큰 범위 > 작은 범위)

public class Super {

	public int publicData;
	protected int protectedData;
	int defaultData;
	private int privateData;
	public Super(){
		
		}
	
	}

//package가 다르면 후손이라도&default라도 접근 못한다!
//다른 package에서도 접근하게 해주고 싶으면 public으로 설정할 것
