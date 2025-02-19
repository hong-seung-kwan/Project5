package constructor;

public class Ex3 {

	public static void main(String[] args) {
		

	}

}

class Board {
	int no;
	String title;
	String content;
	
	public Board(int no) {
		super();
		this.no = no;
	}

	public Board(int no, String title, String content) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
	}
	
	
	//생성자 자동으로 만들기
	// 1. 클래스 안에 마우스를 콕
}
