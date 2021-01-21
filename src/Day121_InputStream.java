import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// 2
//class Student3 {
//	
//	String a,b;
//	
//	Student3(String a, String b) {
//		this.a = a;
//		this.b = b;		
//	}
//	void pr() {
//		System.out.println(a + " "+ b);
//	}
//}

public class Day121_InputStream {	
	public static void main(String[] args) {
		
		// 2
//		Student3 s1 = new Student3("김길동", "kim");
//		Student3 s2 = new Student3("이길동", "lee");
//		
//		s1.pr(); 
//		s2.pr();         //모든 데이터 출력
		
		// 1
		InputStreamReader in = 
				new InputStreamReader(System.in);
		FileWriter out = null;
		
		int r;
		try {
			out = new FileWriter("java.txt");
			while((r = in.read()) != -1) {
				out.write(r);
			}
			in.close();
			out.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}