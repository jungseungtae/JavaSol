class Book {
	
	String a;
	int d;
	
	Book(String a, int d) {
		this.a = a;
		this.d = d;
		System.out.println("ù°");
	}
	Book(String a) {
		this(a,20000);
		System.out.println("��°");
	}
	Book() {
		this("����ϱ�", 100000);
		System.out.println("��°");
	}
	void show() {
		System.out.println(a + " " + d);
	}
}

public class Day119_ClassThis {  // ����۾�
	
	public static void main(String[] args) {
		
		Book b1 = new Book("�ϸ�ǥ����", 30000);
		Book b2 = new Book("�ѱռ�");
		Book b3 = new Book();
		
		b1.show();
		b2.show();
		b3.show();
	}
}