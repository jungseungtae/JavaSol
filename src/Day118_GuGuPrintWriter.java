import java.io.IOException;
import java.io.PrintWriter;

public class Day118_GuGuPrintWriter {

	public static void main(String[] args) throws IOException {
		
		int i,k;
		
		PrintWriter pw = new PrintWriter("gugu.txt");
		
		String str = ""; // 단의 제목 줄 설정
		
		for(i = 2; i <= 9; i++)  // 설정 함수
			str += " 제 " + i + " 단 ";
			
		pw.println(str); // for문 출력
		pw.println(); // 줄 띄우기
		str = "";
		
		for(i = 1; i <= 9; i++) { // 구구단 입력
			for(k = 2; k <= 9; k++) { // 구구단 입력
			str += String.format("%2dx%2d=%2d", k, i, k*i); // 출력
		}
			pw.println(str);
			str = "";
		}
		pw.close();
	}
}
