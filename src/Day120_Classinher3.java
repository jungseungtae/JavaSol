class Person {
	
	private String name;
	
	Person(String name) {
		this.name = name;
	}
	void name() {
		System.out.println(name);
	}
}

class Student1 extends Person {
		
	private String major1;
	private String major2;
	
	Student1(String name, String major1, String major2) {

		super(name); // 부모생성자는 첫 줄에 작성
		this.major1 = major1;
		this.major2 = major2;
	}

	public void show() {
		System.out.println(major1);
		System.out.println(major2);
	}

}


public class Day120_Classinher3 {  // 출력작업
	
	public static void main(String[] args) {
		
		Person p = new Person("길동");
		Student1 s = new Student1("길동", "컴퓨터", "컴공");
		s.name();
		s.show();
	}
}