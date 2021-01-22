class Tv { // Ipad의 부모클래스
	public void on() { // 함수정의
		System.out.println("Tv on");
		}
}	
interface Computer { // interface 선언
	public void m(); // method 선언은 하지만 생성은 안됨
}
class Com { // 클래스
	public void m() {
		System.out.println("컴");
	}
}
class Ipad extends Tv implements Computer { //Tv를 상속받고 Com을 구현하겠다.
	
	Com c = new Com(); // 객체생성 Com클래스는 public이라서 그냥 가져옴.
	public void m() { // 함수정의
		c.m(); // Com꺼 라인 10번 가져옴
	}
	public void ip() { // 함수정의2
		m(); // 이건 COM 꺼?
		on(); //Tv를 상속했으니 라인 2번 가져옴
	}
}
public class Day122_interface2{
	public static void main(String[] args) {
	
		Ipad pd = new Ipad();
		
		pd.ip();
	}
}
