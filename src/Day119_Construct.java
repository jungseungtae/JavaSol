
class Car {
	
	private String color;
	private int speed;

	Car() {
		color = "����";
		speed = 0;
	}	
	public String getcolor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
}


public class Day119_Construct {  // ����۾�
	
	public static void main(String[] args) {
		
		Car myCar1 = new Car(); // �����ϴ� ���� ������ new Car();
		Car myCar2 = new Car();
		
		System.out.println("�ڵ��� 1�� ������ " + 
		myCar1.getcolor() + "�̸� ");
		System.out.println();
	}
}