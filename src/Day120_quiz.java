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
			System.out.println("�Ǽ��� �Է�");
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
//		out.write("���� �ڹٸ� �����ϰ� ���մϴ�.\n");
//		out.newLine();
//		out.write("������ �� ������ ������ ���Դϴ�.");
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
//			bu = new BufferedReader(in); // �ܼ� �Է�
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
//	    System.out.println("�簢�� ����" + rec.area());
		
		// 5
//		Song s1 = new Song("On");
//		Song s2 = new Song("00:00");
//		System.out.println("�����ϴ� �뷡" + s1.getsong());
//		System.out.println("�� �뷡" + s2.getsong());

	}

}


