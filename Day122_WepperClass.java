
public class Day122_WepperClass{
	public static void main(String[] args) {

		Integer int1 = new Integer(100);
		Double db1 = new Double(3.14);
		Character chr1 = new Character((char)65); // A?
		
		System.out.println(int1.toString());
		System.out.println(Integer.toHexString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(db1.longValue());
		System.out.println(chr1.charValue());
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.parseDouble("3.14"));
		
		Integer i = new Integer(10);
		int i1 = i.intValue();
		
		Character c = new Character('a');
		char c1 = c.charValue();
		
		Boolean b = new Boolean(true);
		boolean b1 = b.booleanValue();
		
		// 문자열을 기본타입으로 변경
		
		int i2 = Integer.parseInt("123");
		boolean b2 = Boolean.parseBoolean("true");
		double d2 = Double.parseDouble("3.14");
		
		int i3 = Integer.valueOf("123");
		int i4 = Integer.valueOf("10") + Integer.valueOf("20");
		
		String s = Integer.toString(123);
		Integer i5 = 100; // auto boxing
	}
}