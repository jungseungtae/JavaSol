import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Day118_InputStream {

	public static void main(String[] args) throws Exception{
		
		BufferedReader bu = null; // 문자로 읽는다
		PrintWriter pr = null; // 문자를 쓴다
		
		try {
		InputStreamReader in = 
				new InputStreamReader(System.in); // 입력받기
		
		bu = new BufferedReader(in); // 
		// 콘솔에 입력하는 작업
		
		FileWriter fw = new FileWriter("d.txt"); // 입력받은 문자 저장
		pr = new PrintWriter(fw); // 텍스트 문서를 읽어온다
		
		String str = null;
		while((str = bu.readLine()) != null) { // 글자를 끝날때까지 읽어라
			pr.println(str);
		}
		bu.close(); // 트라이 close 
		
	} catch(Exception e) {} // 처리방법 없음
	finally { // 무조건 출력해라
		pr.close();
	}

}
}