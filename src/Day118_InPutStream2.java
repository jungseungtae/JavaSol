import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Day118_InPutStream2 {

	public static void main(String[] args) throws Exception{
		
		InputStreamReader in = 
				new InputStreamReader(System.in);
		FileWriter out = null;
		
		int r;
		try {
			out = new FileWriter("f.txt");
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