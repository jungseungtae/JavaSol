interface IT {
	public void java();	// �������̽� ����, �Լ� ����
}
class Student { 
	public void study(IT i) { // Ŭ����
		i.java();
	}
}
class ITStudent implements IT {
	public void java() {
		System.out.println("�ڹٰ���");
	}
}
class DBStudent implements IT {
	public void java() {
		System.out.println("DB ����");
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