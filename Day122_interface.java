interface A {  //interface������ ��ü������ �Ұ����ϴ�.
	public void fincA();
}
interface B {
	public void fincB();
}
interface C extends A,B { // ���߻��
	public void fincC();
}
class D implements C { // interface�� �ִ� �Լ��� ����Ϸ��� implements�� ȣ���ؾ� �Ѵ�.
	// C�� A,B�� ��� �޾����Ƿ� C�� ȣ���ϸ� A,B ��� ����� �� �ִ�.
	
	public void fincA() {  //implements�� ���Ͽ� ��ü�� �����Ѵ�.
		System.out.println("fincA");
	}
	public void fincB() {
		System.out.println("fincB");
	}	
	public void fincC() {
		System.out.println("fincC");
	}
}
public class Day122_interface {

	public static void main(String[] args) {
		
		// ����۾�
		
		D dd = new D(); // ��ü����
		A a1 = dd; // Class D�� ���ؼ� ��ü�� �����.
		a1.fincA();
		
		B b1 = dd;
		b1.fincB();
		
		C c1 = dd;
		c1.fincA();
		c1.fincB();
		c1.fincC();
	}
}