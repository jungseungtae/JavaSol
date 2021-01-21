
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Day118_ByteArray {

	public static void main(String[] args) throws Exception{
		
		byte in [] = {1,2,3,4,5};
		byte out[] = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		output = new ByteArrayOutputStream();
		input = new ByteArrayInputStream(in);
		
		int r = 0;
		while((r = input.read()) != -1) {
			output.write(r);
		}
		out = output.toByteArray();
		
		System.out.println(Arrays.toString(out));
		System.out.println(Arrays.toString(in));
	}
}