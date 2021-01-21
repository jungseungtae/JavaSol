import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Day118_InputStream {

	public static void main(String[] args) throws Exception{
		
		BufferedReader bu = null; // ���ڷ� �д´�
		PrintWriter pr = null; // ���ڸ� ����
		
		try {
		InputStreamReader in = 
				new InputStreamReader(System.in); // �Է¹ޱ�
		
		bu = new BufferedReader(in); // 
		// �ֿܼ� �Է��ϴ� �۾�
		
		FileWriter fw = new FileWriter("d.txt"); // �Է¹��� ���� ����
		pr = new PrintWriter(fw); // �ؽ�Ʈ ������ �о�´�
		
		String str = null;
		while((str = bu.readLine()) != null) { // ���ڸ� ���������� �о��
			pr.println(str);
		}
		bu.close(); // Ʈ���� close 
		
	} catch(Exception e) {} // ó����� ����
	finally { // ������ ����ض�
		pr.close();
	}

}
}