package constructor.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		// 1. 디폴트 생성자를 사용하여 인스턴스 생성
		Book book1 = new Book();
		book1.title = "스프링부트";
		book1.price = 30000;
		book1.publisher = "한빛출판사";
		book1.page = 200;
		book1.showBookInfo();

		Book book2 = new Book("자바프로그래밍", 10000, "금빛출판사", 300);
		book2.showBookInfo();

	}

}

class Book {
	String title;
	int price;
	String publisher;
	int page;

	
	public Book() {
		
	}

	// 모든 멤버변수를 초기화하는 생성자
	// 인스턴스 생성 + 초기화
	public Book(String title, int price, String publisher, int page) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.page = page;
	}
	// 클래스 내부에 생성자가 하나라도 있으면
	// 컴파일러는 기본생성자를 만들지 않는다!
	
//	public Book(String tt, int pr, String pub, int pg) {
//		title = tt;
//		price = pr;
//		publisher = pub;
//		page = pg;
//	}
	public void showBookInfo() {
		System.out.println("제목:" + title + " 가격:" + price + " 출판사:" + publisher + " 페이지수:" + page);
	}
}
