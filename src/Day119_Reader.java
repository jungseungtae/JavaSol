import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Day119_Reader {

	public static void main(String[] args) throws IOException {
		
		FileReader f = new FileReader("i.txt");
		BufferedReader w = new BufferedReader(f);
		
		String str;
		
		while(true) {
			str = w.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		w.close();
	}
}