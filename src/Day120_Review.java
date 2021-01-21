class Book2 {
	
	Book2() {
		System.out.println("(파라미터 없음)");
	}
	Book2(String a) {
		this(); // 안적으면 위 생성자 호출을 안함.
		System.out.println(a);
	}
}

class ComputerBook extends Book2 {
	
	ComputerBook(String a) {
		
		super(a);
		System.out.println("ComputerBook 생성자");
	}
}

public class Day120_Review {  // 출력작업
	
	public static void main(String[] args) {
		
		ComputerBook sedan1 = 
				new ComputerBook("굿 자바");
	}
}