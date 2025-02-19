package reference.quiz;

public class Quiz1 {

	// 1. 책정의
	// 2. 회원정의
	public static void main(String[] args) {

		Book book1 = new Book("자바", 10000, "출판사", 150);
		Book book2 = new Book("ㅇ", 1000, "ㅇ", 10);
		Book book3 = new Book("ㄴ", 5000, "ㄷ", 70);
		
		Member member = new Member(1, "둘리", book1, book2, book3);
	}

}

class Book {
	String title;
	int price;
	String company;
	int page;

	public Book(String title, int price, String company, int page) {
		super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}

}

class Member {
	int Memberno;
	String name;
	Book book1;
	Book book2;
	Book book3;

	public Member(int memberno, String name, Book book1, Book book2, Book book3) {
		super();
		Memberno = memberno;
		this.name = name;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}
}




//  간단하게 책의 제목만 넣을시
//class Member2 {
//	int Memberno;
//	String name;
//	String book1; //
//	String book2; //
//	String book3; //
//	public Member2(int memberno, String name, String book1, String book2, String book3) {
//		super();
//		Memberno = memberno;
//		this.name = name;
//		this.book1 = book1;
//		this.book2 = book2;
//		this.book3 = book3;
//	}
//
//	
//}
