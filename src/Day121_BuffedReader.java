
public class Day121_BuffedReader {	
	public static void main(String[] args) {
		
		BufferedReader b=null;
		PrintWriter p=null;
		InputStreamReader in=new InputStreamReader(System.in);
		b=new BufferedReader(in);
		FileWriter f=new FileWriter("java.txt");
		p=new PrintWriter(f);
		String str=null;
		while((str=b.readLine())!=null){
		p.println(str);
		}
		b.close();
		p.close();
	}
}