class Person3 {
	
	String name;
	String id;
    	
	Person3(String name) {
		this.name  = name;
	}	
}
class Student2 extends Person3 {
	
	Student2(String name) {
	super(name);
	}	
}
public class Day121_ClassUPDOWNGrade {  // ����۾�
	
	public static void main(String[] args) {

		Person3 p = new Student2("����");
		Student2 s = (Student2)p;
//		Student2 s = new Student2("����");
		System.out.println(p.name);
	}
}