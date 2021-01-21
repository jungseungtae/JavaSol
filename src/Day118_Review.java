import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Day118_Review {

	public static void main(String[] args) throws Exception{
		
		Scanner s = new Scanner(System.in);
		
		int hap = 0;
		
		while(true) {
			
			try {
							
			int n1 = s.nextInt();
			int n2 = s.nextInt();
			System.out.println(n1+n2);
			
			
		}catch(Exception e) {
			System.out.println("½Ç¼ö ¾ÈµÊ");
			break;
		}
	}
}
}