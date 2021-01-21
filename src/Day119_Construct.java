
class Car {
	
	private String color;
	private int speed;

	Car() {
		color = "빨강";
		speed = 0;
	}	
	public String getcolor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
}


public class Day119_Construct {  // 출력작업
	
	public static void main(String[] args) {
		
		Car myCar1 = new Car(); // 대입하는 곳이 생성자 new Car();
		Car myCar2 = new Car();
		
		System.out.println("자동차 1의 색상은 " + 
		myCar1.getcolor() + "이며 ");
		System.out.println();
	}
}