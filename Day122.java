import java.util.Scanner;

class Profile {
	
	String name;
	String id;
	
	void pr() {
		System.out.println(name + " " + id);
	}
	
}
public class Day122{
	
	public static void main(String[] args) {
		
		Profile p [] = new Profile[2];
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < p.length; i++) {			
			System.out.print("�̸� �Է� : ");
			String name = s.next();
			System.out.print("id �Է� : ");
			String id = s.next();
		}
		
	}
}