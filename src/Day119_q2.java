import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Day119_q2 {
	
	static int same(int a[], int b[]) {
	
		// 2
		int n = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					n++;
				}				
			}
		}
		return n;
	}

	public static void main(String[] args) throws IOException {
		

		
		int lotto[] = {4,10,25,30,45,47};
		int my [] = {1,4,7,26,45,48};
		int r;
		
		r = same(lotto,my);
		
		System.out.printf("일치하는 번호의 개수 : %d \n", r);
		
	}
}