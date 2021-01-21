import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

	// 4
//class Rectangle {
//	
//	int width;
//	int height;
//		
//	int area() {
//		return width*height; 
//	}
//}
	// 5

//class Song {
//	
//	String str;
//
//	public Song(String str) {
//		this.str = str;
//	}
//	public String getsong() {		
//		return str;
//	}			
//}


public class Day120_quiz {
	
	public static void main(String[] args) throws IOException  {
		
		// 1
		
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		
		while(true) {
			System.out.println("실수를 입력");
			double n = s.nextDouble();
			if(n == -1) {
				break;
			}
			sum += n;
			count++;
		}
		System.out.println(sum/count);
		
		// 2
		
//		FileWriter fw = new FileWriter("test01.txt");
//		BufferedWriter out = new BufferedWriter(fw);
//		
//		out.write("HI\n");
//		out.newLine();
//		out.write("저는 자바를 좋아하고 잘합니다.\n");
//		out.newLine();
//		out.write("앞으로 더 열심히 공부할 것입니다.");
//		out.newLine();	
//		
//		out.close();
		
		// 3
		
//		BufferedReader bu = null;
//		PrintWriter pr = null;
//		
//		try {
//			InputStreamReader in = 
//					new InputStreamReader(System.in);
//			
//			bu = new BufferedReader(in); // 콘솔 입력
//			
//			FileWriter fw = new FileWriter("test02.txt");
//			pr = new PrintWriter(fw);
//			
//			String str = null;
//			while((str = bu.readLine()) != null) {
//				pr.println(str);
//			}
//			bu.close();
//		} catch(Exception e) {}
//		finally {
//			pr.close();
//		}
		
		// 3.1
		
//		BufferedReader in = 
//				new BufferedReader(new FileReader("test02.txt"));
//		
//		
//		
//		while(true) {
//			i = in.readLine();
//		}
		
		// 4.
		
//		Rectangle rec = new Rectangle();
//	    rec.width=5;
//	    rec.height=6;
//	    System.out.println("사각형 면적" + rec.area());
		
		// 5
//		Song s1 = new Song("On");
//		Song s2 = new Song("00:00");
//		System.out.println("좋아하는 노래" + s1.getsong());
//		System.out.println("내 노래" + s2.getsong());

	}

}


