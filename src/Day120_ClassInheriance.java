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
public class Day120_ClassInheriance {  // ����۾�
	
	public static void main(String[] args) {
		
		People p = new People(); // ��ü���� �ʼ�
		p.age = 30;
		p.name = "ȫ�浿";
		p.show();
		
		Student s = new Student();  // ��ü���� �ʼ�
		s.age = 20;
		s.name = "��浿";
		s.major = "��ǻ�� ����";
		s.pr();
	}
}