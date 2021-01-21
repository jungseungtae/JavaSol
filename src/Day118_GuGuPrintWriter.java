import java.io.IOException;
import java.io.PrintWriter;

public class Day118_GuGuPrintWriter {

	public static void main(String[] args) throws IOException {
		
		int i,k;
		
		PrintWriter pw = new PrintWriter("gugu.txt");
		
		String str = ""; // ���� ���� �� ����
		
		for(i = 2; i <= 9; i++)  // ���� �Լ�
			str += " �� " + i + " �� ";
			
		pw.println(str); // for�� ���
		pw.println(); // �� ����
		str = "";
		
		for(i = 1; i <= 9; i++) { // ������ �Է�
			for(k = 2; k <= 9; k++) { // ������ �Է�
			str += String.format("%2dx%2d=%2d", k, i, k*i); // ���
		}
			pw.println(str);
			str = "";
		}
		pw.close();
	}
}
