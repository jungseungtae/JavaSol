class Fruit {
	String color; // �Ķ���� ����
	int count;
	
	Fruit(String color, int count) {
		this.color = color; // �����ڷ� �Ķ���Ϳ� ����
		this.count = count; // ���� �ö󰡼� ����
	}
	void show() {
		System.out.println(color + " " + count); // ���
	}
}

class Apple extends Fruit {

	Apple(String color, int count) {
		super(color, count); //�θ� Ŭ�������� ȣ��
	}
	
}

public class Day121 {			

	public static void main(String[] args) {
		
		Fruit f1 = new Apple("red",10); // ��ü ����
		f1.show();//red 10 ��� �Լ� ����
	}
}