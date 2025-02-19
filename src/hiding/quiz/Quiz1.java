package hiding.quiz;

public class Quiz1 {
	
	// 책 클래스
	// 속성 private
	// getter 사용 출력

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setTitle("자바프로그래밍");
		book1.setPrice(20000);
		book1.setCompany("한빛컴퍼니");
		book1.setPage(300);
		System.out.println(book1.getTitle()+"," + book1.getPrice()+"," + book1.getCompany()+"," + book1.getPage());

//	    type을 체크해야할때는 아래 방법
//		String t = book1.getTitle();
//		int p = book1.getPrice();
//		String c = book1.getCompany();
//		int pg = book1.getPage();
//		System.out.println(t+", "+p+", "+c+", "+pg);
		
		
		Book book2 = new Book();
		book2.setTitle("스프링");
		book2.setPrice(15000);
		book2.setCompany("한빛컴퍼니");
		book2.setPage(500);
		System.out.println(book2.getTitle()+"," + book2.getPrice()+"," + book2.getCompany()+"," + book2.getPage());
//		String t1 = book2.getTitle();
//		int p1 = book2.getPrice();
//		String c1 = book2.getCompany();
//		int pg1 = book2.getPage();
//		System.out.println(t1+", "+p1+", "+c1+", "+pg1);

	}

}

class Book{
	// private 접근제어자: 클래스 내부에서만 사용 가능
	private String title;
	private int price;
	private String company;
	private int page;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
}