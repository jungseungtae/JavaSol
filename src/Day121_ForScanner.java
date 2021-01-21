import java.util.Scanner;

public class Day121_ForScanner {			

	public static void main(String[] args) {
		
		String eng[] = {"student","book","future","note"};
		String kor[] = {"학생","책","미래","노트"};
		String e;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("영어단어입력");
			e = s.next();
			if(e.equals("stop")) {
				System.out.println("stop");
				break;
			}
			for(int i = 0; i < eng.length; i++) {
				if(e.equals(eng[i])) {
					System.out.println(kor[i]);
				}
		}
	}
	}
}