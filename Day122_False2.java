interface IT {
	public void java();	// 인터페이스 생성, 함수 설정
}
class Student { 
	public void study(IT i) { // 클래스
		i.java();
	}
}
class ITStudent implements IT {
	public void java() {
		System.out.println("자바공부");
	}
}
class DBStudent implements IT {
	public void java() {
		System.out.println("DB 공부");
	}
}
public class Day122_False2{
	
	public static void main(String[] args) {
		
		Student s = new Student();
		ITStudent i = new ITStudent();
		DBStudent d = new DBStudent();
		
		s.study(i);
		s.study(d);
	}
}