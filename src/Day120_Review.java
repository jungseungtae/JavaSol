class Book2 {
	
	Book2() {
		System.out.println("(�Ķ���� ����)");
	}
	Book2(String a) {
		this(); // �������� �� ������ ȣ���� ����.
		System.out.println(a);
	}
}

class ComputerBook extends Book2 {
	
	ComputerBook(String a) {
		
		super(a);
		System.out.println("ComputerBook ������");
	}
}

public class Day120_Review {  // ����۾�
	
	public static void main(String[] args) {
		
		ComputerBook sedan1 = 
				new ComputerBook("�� �ڹ�");
	}
}