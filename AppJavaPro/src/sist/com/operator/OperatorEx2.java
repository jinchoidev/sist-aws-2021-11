package sist.com.operator;
//operator(연산자) = 계산하게 해주는 기호
//최우선연산은 > (), [], .
//단항연산자 (항이 1개; unary operator) +- (sign)
//++, -- (1씩 더하거나 1씩 감소), !(논리 부정), ~(뭐지?)

public class OperatorEx2

public int unaryOperator(int x) {
    System.out.println("unaryOperator(int x)");
    return !(x>10)?-x:+x;
 }
 public int unaryOperator(byte x) {
    System.out.println("unaryOperator(byte x)");
    return !(x>10)?-x:+x;
 }
 public void unaryOperator(String x,int y) {
    System.out.println("unaryOperator(String x)");
    int rs=!x.equals("Action")?++y:y++;      
    System.out.println("rs="+rs++);
    System.out.println("rs="+ ++rs);   
 }
 public boolean unaryOperator(int x,int y,int z,int k) {
    return ((!(!!!(x<y)&& z++==3)||(x+y)<z)?"Java":"Oracle").equals("Java");
 }   
 public static void main(String[] args) {
    OperatorEx2 o=new OperatorEx2();
    System.out.println(o.unaryOperator(1, 2, 3, 4));
    //o.unaryOperator("Action",10);
    //System.out.println(o.unaryOperator(11));
    
    
 }
