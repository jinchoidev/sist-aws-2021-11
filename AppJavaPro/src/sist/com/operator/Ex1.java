package sist.com.operator;

//ÃÖ´Ü»ê½¬°ü³í»ï´ëÄÞ 
public class Ex1 {
	
	   public void samHang(int x,int y,int z,int k) {
		      System.out.println(x++==++y?(z-->++k)?"A":"B":(x+y)>(z-k)?"C":"D");	      
		      
}
	   public static void main(String[] args) {
		      Ex1 o=new Ex1();
		      o.samHang(2, 3, 4, 5);
}
}