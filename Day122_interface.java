interface A {  //interface에서는 객체생성이 불가능하다.
	public void fincA();
}
interface B {
	public void fincB();
}
interface C extends A,B { // 다중상속
	public void fincC();
}
class D implements C { // interface에 있는 함수를 사용하려면 implements로 호출해야 한다.
	// C가 A,B를 상속 받았으므로 C만 호출하면 A,B 모두 사용할 수 있다.
	
	public void fincA() {  //implements를 통하여 객체를 생성한다.
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
		
		// 출력작업
		
		D dd = new D(); // 객체생성
		A a1 = dd; // Class D를 통해서 객체를 출력함.
		a1.fincA();
		
		B b1 = dd;
		b1.fincB();
		
		C c1 = dd;
		c1.fincA();
		c1.fincB();
		c1.fincC();
	}
}