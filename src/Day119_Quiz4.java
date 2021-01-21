
public class Day119_Quiz4 {

	public static void main(String[] args) {
		
		int hap = 0;
		
		int a[][] = {{43,97},
					{34,77,87},
					{100,95,38,89}};
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j] + " ");
			hap += a[i][j];
		}
	}
		System.out.println();
		System.out.println(hap);
		System.out.println((double)hap/9);
}
}