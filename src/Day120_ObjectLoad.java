import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Day120_ObjectLoad {  // 출력작업
	
	public static void main(String[] args) throws IOException {
		
		ObjectInputStream is = null;
		
		try {
			is = new ObjectInputStream
					(new FileInputStream("ob.txt"));
			
			Stu s = (Stu)is.readObject();
			System.out.println(s.getName());
			System.out.println(s.getId());
			System.out.println(s.getAge());
			
		} catch(Exception e) {}
		is.close();
	}
}