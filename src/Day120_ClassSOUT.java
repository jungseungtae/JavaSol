class AAA {
	
	void ride() {
		System.out.println("�������̵� AAA");
	}
	void load() {
		System.out.println("�����ε� AAA");
	}
}

class BBB extends AAA {
	
	void ride() {
		System.out.println("�������̵� BBB");
	}
	void load() {
		System.out.println("�����ε� BBB");
	}
	
}
public class Day120_ClassSOUT {  // ����۾�
	
	public static void main(String[] args) {
		
		AAA a = new AAA();
		a.ride();
		a.load();
				
		BBB b = new BBB();
		b.ride();
		b.load();
	}
}