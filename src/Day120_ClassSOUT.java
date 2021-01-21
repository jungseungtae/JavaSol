class AAA {
	
	void ride() {
		System.out.println("오버라이딩 AAA");
	}
	void load() {
		System.out.println("오버로딩 AAA");
	}
}

class BBB extends AAA {
	
	void ride() {
		System.out.println("오버라이딩 BBB");
	}
	void load() {
		System.out.println("오버로딩 BBB");
	}
	
}
public class Day120_ClassSOUT {  // 출력작업
	
	public static void main(String[] args) {
		
		AAA a = new AAA();
		a.ride();
		a.load();
				
		BBB b = new BBB();
		b.ride();
		b.load();
	}
}