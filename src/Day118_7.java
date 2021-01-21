
import java.io.IOException;
import java.util.Scanner;

public class Day118_7 {
	
	static void pr(int s[], int n) {		
		
		for(int i = 0; i < n; i++) {
			int j = s[i]/n;
			
			for(int k = 0; k < j; k++) {
				System.out.print("#");
			}
			System.out.println();
		}						
	}

	public static void main(String[] args) throws Exception{
		
		int score[]=new int[] {58, 60, 86, 90, 84};

		pr(score, 5);
	}
}