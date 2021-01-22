
public class Day122_WepperClassPrac{
	public static void main(String[] args) {
		
		byte var1 = Byte.valueOf("100");  // 문자열을 앞 자료형으로 저장.
		short var2 = Short.valueOf("200");
		int var3 = Integer.valueOf("300");
		long var4 = Long.valueOf("400");
		float var5 = Float.valueOf("500");
		double var6 = Double.valueOf("600.0");
		
		String str1 = Integer.toString(var1);  // 자료형을 문자열로 저장
		String str2 = Double.toString(var6);
		String str3 = Short.toString(var2);
		
		System.out.println(var1 + var2);
		System.out.println(var2);
		System.out.println(var6);
		
		Double db1 = new Double(3.14); // 객체 db1 선언
		String str4 = Double.toString(var6); // 객체 db1을 스트링으로 변경
		
		
	}
}