package sist.com.basic.obj;

public class Process {

	private int countProcess=10;
	private String processWhere="Front";
	private String processWhen="MethodBefore";
	
	public Process() {
		
	}
	
	public Process(int countProcess) {
		this.countProcess=countProcess;		
	}
	
	public void setCountProcess(int countProcess) {
		this.countProcess=countProcess;
	}
	
	public int getCountProcess() {
		return this.countProcess;
	}
	
	
	public static void main(String[] args) {
		Process p1=new Process();
		p1.setCountProcess(9000);
		p1.setCountProcess(8000);
		System.out.println(p1.countProcess);
	}
	
}
