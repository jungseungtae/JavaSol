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

		super(name); // �θ�����ڴ� ù �ٿ� �ۼ�
		this.major1 = major1;
		this.major2 = major2;
	}

	public void show() {
		System.out.println(major1);
		System.out.println(major2);
	}

}


public class Day120_Classinher3 {  // ����۾�
	
	public static void main(String[] args) {
		
		Person p = new Person("�浿");
		Student1 s = new Student1("�浿", "��ǻ��", "�İ�");
		s.name();
		s.show();
	}
}