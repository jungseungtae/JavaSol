import java.util.Scanner;

class Song {
	
	String a,b;
	
	public Song(String singer, String title) {
		this.a = a;  // 아래서 출력시 얘네 가지고 내려가야 함.
		this.b = b;
	}	
	
}


public class Day121_false2 {	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);		
		Song so [] = new Song[2];
		
		for(int i = 0; i < so.length; i++) {
			
			System.out.println("가수입력");
			String singer = s.next();
			
			System.out.println("제목입력");
			String title = s.next();
			
			so[i] = new Song(singer,title);
		}
		for(int i = 0; i < so.length; i++) {
			System.out.println(so[i].a + " " + so[i].b);
			// 배열이름으로 출력하고 위에서 설정한 String의 이름으로 출력
		}
	}
}