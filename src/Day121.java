class Fruit {
	String color; // 파라미터 선언
	int count;
	
	Fruit(String color, int count) {
		this.color = color; // 생성자로 파라미터에 대입
		this.count = count; // 위로 올라가서 대입
	}
	void show() {
		System.out.println(color + " " + count); // 출력
	}
}

class Apple extends Fruit {

	Apple(String color, int count) {
		super(color, count); //부모 클래스에서 호출
	}
	
}

public class Day121 {			

	public static void main(String[] args) {
		
		Fruit f1 = new Apple("red",10); // 객체 생성
		f1.show();//red 10 출력 함수 설정
	}
}