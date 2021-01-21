import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Day120_ObjectWrite {  // 출력작업
	
	public static void main(String[] args) throws IOException {
		
		ObjectOutputStream os = null;
		
		try {
			os = new ObjectOutputStream
					(new FileOutputStream("ob.txt"));
			
			Stu s = new Stu();
			s.setName("승태");
			s.setId("123");
			s.setAge(22);
			
			os.writeObject(s);
		} catch(Exception e) {}
		os.close();
	}
}