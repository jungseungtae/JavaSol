import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Day118_Quiz34 {
	
	static void show(int a[]) throws IOException {
		
//	// 1
//		
//		FileOutputStream f = 
//				new FileOutputStream("test.txt");
//		
//		byte b [] = {4,6,7,8,-1,2,4};
//		
//		for(int i = 0; i < b.length; i++) {
//			f.write(b[i]);
//		}
		
	// 1-2	
//		 2
//		int n = 0;
//		
//		for(int i = 0; i < a.length; i++) {
//			for(int j = 0; j < b.length; j++) {
//				if(a[i] == b[j]) {
//					n++;
//				}				
//			}
//		}
//		return n;
//	}
//	public static void main(String[] args) throws IOException {		
//		
//		int lotto[] = {4,10,25,30,45,47};
//		int my [] = {1,4,7,26,45,48};
//		int r;
//		
//		r = same(lotto,my);
//		
//		System.out.printf("일치하는 번호의 개수 : %d \n", r);
	 4		
		for(int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		
	}

//	public static void main(String[] args) throws Exception{
//		
//		int ary[] = {6,2,8,4,9};
//		
//		show(ary);
		
		
	 // 5
		int hap = 0;
		
		int ary[][] = {{43,97},
						{34,77,87},
						{100,95,38,89}};
		
		for(int i = 0; i < ary.length; i++) {
			for(int j = 0; j < ary[i].length; j++) {
				hap += ary[i][j];
			}
		}
		System.out.println(hap);
		
	}
}