
public class Day119_Lotto {
	
	static int same(int a[], int b[]) {
		
		int r = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					r++;
				}
			}
		}
		return r;
	}

	public static void main(String[] args) {
		
		int lotto [] = {4,10,25,30,41,45};
		int my [] = {1,4,7,26,41,45};
		
		int r;
		
		r = same(lotto,my);
		
		System.out.printf("일치번호 : %d개", r);

	}
}