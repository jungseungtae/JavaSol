class Book {
	
	String a;
	int d;
	
	Book(String a, int d) {
		this.a = a;
		this.d = d;
		System.out.println("첫째");
	}
	Book(String a) {
		this(a,20000);
		System.out.println("둘째");
	}
	Book() {
		this("백범일기", 100000);
		System.out.println("셋째");
	}
	void show() {
		System.out.println(a + " " + d);
	}
}

public class Day119_ClassThis {  // 출력작업
	
	public static void main(String[] args) {
		
		Book b1 = new Book("하멜표류기", 30000);
		Book b2 = new Book("총균쇠");
		Book b3 = new Book();
		
		b1.show();
		b2.show();
		b3.show();
	}
}