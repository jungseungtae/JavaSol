import java.util.Scanner;

public class Day121_ForScanner {			

	public static void main(String[] args) {
		
		String eng[] = {"student","book","future","note"};
		String kor[] = {"�л�","å","�̷�","��Ʈ"};
		String e;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("����ܾ��Է�");
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