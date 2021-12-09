package jin.choi.practice;

public class InheritanceParent {
	private int estate1;
	
	public InheritanceParent() {
	//일부러 빈 기본생성자를 남겨둠 / 아래로 overloading(과적) <개념 확실히 할 것
	}
	
	public InheritanceParent(int estate1) {
		this.estate1=estate1;
		System.out.println("아버지는 내게 반포 자이를 상속했다.");
	}
	
}
