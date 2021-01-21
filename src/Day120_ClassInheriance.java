class People {
	
	int age;
	String name;
	
	void show() {
		System.out.println(age + " " + name);
	}
}

class Student extends People {
	
	String major;
	
	void pr() {
		show();
		System.out.println(major);
	}
}
public class Day120_ClassInheriance {  // 출력작업
	
	public static void main(String[] args) {
		
		People p = new People(); // 객체생성 필수
		p.age = 30;
		p.name = "홍길동";
		p.show();
		
		Student s = new Student();  // 객체생성 필수
		s.age = 20;
		s.name = "고길동";
		s.major = "컴퓨터 공학";
		s.pr();
	}
}