package sist.com.basic.obj;

public class BookExample1 {
	   private String title;
	   private String publisher;
	   private String author;
	   private int price;
	   private boolean soldout;
	   
	   public BookExample1() {
	   }
	   
	   public BookExample1(String title) {
		   this.title=title;
	   }
	   
	   public BookExample1(String title,String publisher) {
		   this.title=title;
		   this.publisher=publisher;
	   }
	   
	   public BookExample1(String title,String publisher,String author) {
		   this.title=title;
		   this.publisher=publisher;
		   this.author=author;
		   
	   }
	   
	   public BookExample1(String title,String publisher,String author,int price) {
		   this.title=title;
		   this.publisher=publisher;
		   this.author=author;
		   this.price=price;
		   
	   }	   
	   
	   public BookExample1(String title,String publisher,String author,int price,boolean soldout) {
		   this.title=title;
		   this.publisher=publisher;
		   this.author=author;
		   this.price=price;
		   this.soldout=soldout;
	   }	   
	   
	   
	   public BookExample1(BookExample1 db) {
		   db.title=title;
		   db.publisher=publisher;
		   db.author=author;
		   db.price=price;
		   db.soldout=soldout;   
	   }
	   

	   
}
