package sist.com.basic5.obj;

public class Node {
	//Node node=null;		//지정하지 않은 초기값일때; 이미 이렇게 설정되어서 생략됐기 때문에 안보임
	static Node node=null; 		//왜 이렇게 해야 오류가 안 뜨는지 다시 한번 물어보기...
	//instance를 1번만 생성
	
	private int dataValue;
		
	public void setDataValue(int dataValue) {
		this.dataValue=dataValue;
	}
	
	public int getDataValue() {
		return this.dataValue;
	}

	public static int Node getInstance() {
		return node;
	}
	
	private Node() {
		dataValue=0;
	}

	
}
