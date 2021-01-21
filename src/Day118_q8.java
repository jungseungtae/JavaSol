
import java.io.IOException;
import java.util.Scanner;

public class Day118_q8 {
	
	static String show(char a, int b) {		
		
		String str = "";
		
		for(int i = 0; i < b; i++) {
			str += a;
		}
		return str;
	}

	public static void main(String[] args) throws Exception{
		
		System.out.println(show('$', 10));
	}
}