import java.util.Scanner;

class Song {
	
	String a,b;
	
	public Song(String singer, String title) {
		this.a = a;  // �Ʒ��� ��½� ��� ������ �������� ��.
		this.b = b;
	}	
	
}


public class Day121_false2 {	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);		
		Song so [] = new Song[2];
		
		for(int i = 0; i < so.length; i++) {
			
			System.out.println("�����Է�");
			String singer = s.next();
			
			System.out.println("�����Է�");
			String title = s.next();
			
			so[i] = new Song(singer,title);
		}
		for(int i = 0; i < so.length; i++) {
			System.out.println(so[i].a + " " + so[i].b);
			// �迭�̸����� ����ϰ� ������ ������ String�� �̸����� ���
		}
	}
}