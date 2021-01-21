import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Day118_WriteRead {

	public static void main(String[] args) throws Exception{
		
		FileWriter fw = new FileWriter("b.txt");
		BufferedWriter out = new BufferedWriter(fw);
		
		out.write("안녕");
		out.newLine();
		out.write("월요일");
		out.newLine();		
		out.write("월요일!");
		out.newLine();
		
		out.close();

		BufferedReader in = 
				new BufferedReader(new FileReader("b.txt"));
		
		String str;
		
		while(true) {
			str = in.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		in.close();
	}

}
