
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Day118_Byteinput {

	public static void main(String[] args) throws Exception{
		
		ByteArrayInputStream in = null;
		FileOutputStream out = null;
		
		try {
			byte b [] = new byte[]{1,2,3};
			in = new ByteArrayInputStream(b);
			out = new FileOutputStream("g.dat");
			
			int r = -1;
			while((r = in.read()) != -1) {
				out.write(r);
				}
			}catch(Exception e) {}
		out.close();
		in.close();
	}
}