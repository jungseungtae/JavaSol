import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Day119_WriteRead {  // ����۾�
	
	public static void main(String[] args) throws IOException {
		
		String[]str2= new String[10];
		
		FileReader fr=new FileReader("Sample.txt"); // ������ �ҷ���
		BufferedReader br=new BufferedReader(fr); // ������ ����
		String str=null; // ���Ŀ� �´� ���� �ʱ�ȭ
		
		int i=0; // �ʱⰪ ����
		
		while((str=br.readLine())!=null) { // �ݺ��ؼ� �о�� ���� �ƴ� �� ����
		str2[i]=str; // 
		i++;
		}
		
		for (String str3:str2) {
		if (str3==null) {
		break;
		}
		
		System.out.print(str3+" ");
		}
		
		br.close();
		fr.close();
	}
}