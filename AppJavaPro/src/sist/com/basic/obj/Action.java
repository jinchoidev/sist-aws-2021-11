package sist.com.basic.obj;

public class Action {

	private String message;
	private int countAction;
	private String actionWhen;

	public Action() {
		System.out.println("Action()");
	}
	
	public Action(String message,int countAction) {
		this.message=message;
		this.countAction=countAction;
	}
	
	public Action(Action i) {
		this.message=i.message;
		this.countAction=i.countAction;
	}
	
	public static void main(String[] args) {
		Action a1=new Action("Hi",100); //message|countAction|actionWhen
		Action a2=new Action(a1); //message|countAction|actionWhen
	}	
	
}
