class Circle1 {
	
	int r;
	
	Circle1(int r) {
		this.r = r;
	}
	double getarea() {
		return r*r*3.14;
	}
}


public class Day121_False {	
	public static void main(String[] args) {
		
		Circle1 ary[] = new Circle1 [4];
		
		for(int i = 0; i < ary.length; i++) {
			ary[i] = new Circle1(i);
			System.out.println(ary[i].getarea());
		}
	}

}


