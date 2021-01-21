import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Day119_WriteRead {  // 출력작업
	
	public static void main(String[] args) throws IOException {
		
		String[]str2= new String[10];
		
		FileReader fr=new FileReader("Sample.txt"); // 파일을 불러옴
		BufferedReader br=new BufferedReader(fr); // 형식을 지정
		String str=null; // 형식에 맞는 변수 초기화
		
		int i=0; // 초기값 설정
		
		while((str=br.readLine())!=null) { // 반복해서 읽어라 널이 아닐 때 까지
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